
public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    @Override
    public String toString() {
        return String.format("  Nombre Institución: %s\n  Siglas: %s",
                getNombre(), getSiglas());
    }
}
