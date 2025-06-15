
public class Persona {
    
    private String nombre;
    private String apellido;
    private String usuarionombre;

    public Persona(String nombre, String apellido, String usuarionombre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuarionombre = usuarionombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuarionombre() {
        return usuarionombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellidoh) {
        this.apellido = apellidoh;
    }

    public void setUsuarionombre(String usuarionombre) {
        this.usuarionombre = usuarionombre;
    }

    @Override
    public String toString() {
        
        return String.format("  Nombre: %s\n  Apellidos: %s\n  Usuario: %s",
                getNombre(), getApellido(), getUsuarionombre());
    }
}