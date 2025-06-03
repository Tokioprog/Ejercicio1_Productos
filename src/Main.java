import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se crea una lista para almacenar los productos registrados
        ArrayList<Producto> productos = new ArrayList<>();

        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Contador para asignar un ID único a cada producto
        int idContador = 1;

        // Bucle principal para registrar productos hasta que el usuario decida salir
        while (true) {
            System.out.println("Registro de nuevo producto:");

            // Se solicita al usuario que ingrese el nombre del producto
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            // Se solicita al usuario que ingrese la marca del producto
            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            // Se solicita al usuario que ingrese el precio del producto
            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());

            // Se crea un nuevo objeto Producto con los datos ingresados
            Producto producto = new Producto(idContador, nombre, marca, precio);

            // Se agrega el producto a la lista
            productos.add(producto);

            // Se incrementa el contador de ID para el próximo producto
            idContador++;

            // Se pregunta al usuario si desea registrar otro producto
            System.out.print("¿Desea registrar otro producto? (s/n): ");
            String respuesta = scanner.nextLine();

            // Si el usuario responde "n" (no), se sale del bucle
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Se muestra la lista de productos registrados utilizando un iterador
        System.out.println("\nProductos registrados:");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto p = iterator.next();
            System.out.println(p); // Se imprime la información del producto
        }
    }
}
