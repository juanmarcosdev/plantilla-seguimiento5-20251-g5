package model;

public class Producto {

    private String id;
    private String nombre;
    private double precioPorKg;
    private int stock;


    public Producto(String id, String nombre, double precioPorKg, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precioPorKg = precioPorKg;
        this.stock = stock;
    }

    public Producto() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioPorKg() {
        return precioPorKg;
    }

    public void setPrecioPorKg(double precioPorKg) {
        this.precioPorKg = precioPorKg;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
               "id='" + id + '\'' +
               ", nombre='" + nombre + '\'' +
               ", precioPorKg=" + precio +
               ", stock=" + stock +
               '}';
    }
}