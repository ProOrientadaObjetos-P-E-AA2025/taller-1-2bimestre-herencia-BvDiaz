
public class Prestamo {
    
    protected Persona benificiario;
    protected int tprestamomeses;
    protected String ciudadprestamo;

    public Prestamo(Persona benificiario, int tiempoPrestamoMesess, String ciuddadPrestamo) {
        
        this.benificiario = benificiario;
        this.tprestamomeses = tprestamomeses;
        this.ciudadprestamo = ciudadprestamo;
    }

    public Persona getBenificiario() {
        return benificiario;
    }

    public int gettprestamomeses() {
        return tprestamomeses;
    }

    public String getciudadprestamo() {
        return ciudadprestamo;
    }

    public void setBenificiario(Persona benificiario) {
        this.benificiario = benificiario;
    }

    public void settprestamomeses(int tiempoPrestamoMesess) {
        this.tprestamomeses = tiempoPrestamoMesess;
    }

    public void setciudadprestamo(String ciuddadPrestamo) {
        this.ciudadprestamo = ciuddadPrestamo;
    }

    @Override
    public String toString() {
        
        return String.format("--- Informacion del prestamooo ---\n"
                
                + "Beneficiario:\n%s\n"
                + "Tiempo de Prestamoo (Meses): %d\n"
                + "Ciudadd del Prestamoo: %s",
                
                getBenificiario(), gettprestamomeses(), getciudadprestamo());
    }
}