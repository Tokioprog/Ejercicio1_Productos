public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    // Constructor
    public Producto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = generarCodigo(nombre, marca);
    }

    // Metodo para generar el código
    private String generarCodigo(String nombre, String marca) {
        String parteNombre = nombre.length() >= 3 ? nombre.substring(0, 3) : nombre;
        String parteMarca = marca.length() >= 2 ? marca.substring(0, 2) : marca;
        int numeroAleatorio = (int)(Math.random() * 900 + 100); // número entre 100 y 999
        return parteNombre.toUpperCase() + parteMarca.toUpperCase() + numeroAleatorio;
    }

    // Getters
    public int getId() { return id; }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMarca() {
        return marca;
    }
    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Código: " + codigo +
                ", Nombre: " + nombre +
                ", Marca: " + marca +
                ", Precio: $" + precio;
    }
}