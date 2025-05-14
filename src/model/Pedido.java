package model;

public class Pedido {

    private Cliente cliente;
    private Producto producto;
    private double cantidadEnKg;

    public Pedido(Cliente cliente, Producto producto, double cantidadEnKg) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadEnKg = cantidadEnKg;
    }

    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidadEnKg() {
        return cantidadEnKg;
    }

    public void setCantidadEnKg(double cantidadEnKg) {
        this.cantidadEnKg = cantidadEnKg;
    }

    @Override
    public String toString() {
        return "Pedido{" +
               "cliente=" + cliente +
               ", producto=" + producto +
               ", cantidadEnKg=" + cantidad +
               '}';
    }
}