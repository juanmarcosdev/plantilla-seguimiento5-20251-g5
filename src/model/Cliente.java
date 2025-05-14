package model;

public class Cliente {

    private String id;
    private String nombre;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cliente() {
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

    @Override
    public String toString() {
        return "Cliente{" +
               "id='" + id + '\'' +
               ", nombre='" + nombre + '\'' +
               '}';
    }
}