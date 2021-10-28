package cl.inacap.evaluacion;

public class Producto {
    private String nombre;
    private int cantidad;
    private String unidad;
    private boolean estado;
    public static final boolean PENDIENTE=true;

    public static final Producto [] productos = {
            new Producto( nombre: ),
}

    public Producto(String nombre, int cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.estado=PENDIENTE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        String comprado;
        if(estado==PENDIENTE) comprado="pendiente";
        else comprado="comprado";
        return nombre + ":comprado";
    }
}