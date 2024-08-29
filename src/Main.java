import com.nombreCompania.appfacturas.model.Cliente;
import com.nombreCompania.appfacturas.model.Factura;
import com.nombreCompania.appfacturas.model.ItemFactura;
import com.nombreCompania.appfacturas.model.Producto;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String continuar = "si";



        while (continuar.equals("si")) {
            // Crear cliente con los valores dados
            Cliente cliente = new Cliente("Jara", "310725");

            System.out.print("Ingrese una descripción de la factura: ");
            String desc = x.nextLine();

            Factura factura = new Factura(desc, cliente);

            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el nombre del producto nº " + (i + 1) + ": ");
                String nombreProducto = x.nextLine();

                System.out.print("Ingrese el precio del producto: ");
                double precioProducto = x.nextDouble();

                System.out.print("Ingrese la cantidad: ");
                int cantidad = x.nextInt();

                Producto producto = new Producto(nombreProducto, precioProducto);
                factura.addItemFactura(new ItemFactura(producto, cantidad));

                System.out.println();
                x.nextLine(); // Consumir la línea pendiente

            }

            // Imprimir la factura después de agregar todos los ítems
            System.out.println(factura);

            // Preguntar si desea agregar otra factura
            System.out.println("Deseas agregar otra factura? (si/no)");
            continuar = x.nextLine();
        }

        // Cerrar el Scanner
        x.close();
    }
}