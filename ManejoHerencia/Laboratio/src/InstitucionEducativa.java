
public class InstitucionEducativa {
    
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nombree, String siglass) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setNombre(String nombree) {
        this.nombre = nombree;
    }

    public void setSiglas(String siglass) {
        this.siglas = siglass;
    }

    @Override
    public String toString() {
        return String.format("  Nombre Institucion: %s\n  Siglas: %s",
                getNombre(), getSiglas());
    }
}