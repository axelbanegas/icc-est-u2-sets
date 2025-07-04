package models;

public class contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public contacto() {
    }

    public contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + apellido.hashCode();
    }

}