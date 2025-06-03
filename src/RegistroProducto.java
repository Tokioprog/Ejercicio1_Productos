import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroProducto {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id = 1;
        String continuar;

        do {
            System.out.print("Ingrese nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese marca del producto: ");
            String marca = sc.nextLine();

            System.out.print("Ingrese precio del producto: ");
            double precio = Double.parseDouble(sc.nextLine());

            Producto prod = new Producto(id, nombre, marca, precio);
            productos.add(prod);
            id++;

            System.out.print("¿Desea ingresar otro producto? (s/n): ");
            continuar = sc.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        System.out.println("\n--- Productos Registrados ---");
        Iterator<Producto> iterador = productos.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        sc.close();
    }
}
