
public class Persona {

    private String nombre;
    private String apellido;
    private String usuarioNombre;

    public Persona(String nombre, String apellido, String usuarioNombre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuarioNombre = usuarioNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    @Override
    public String toString() {
        return String.format("  Nombre: %s\n  Apellidos: %s\n  Usuario: %s",
                getNombre(), getApellido(), getUsuarioNombre());
    }
}
