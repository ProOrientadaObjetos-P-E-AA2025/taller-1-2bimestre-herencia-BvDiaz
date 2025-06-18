
public abstract class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamoMeses;
    protected String ciudadPrestamo;

    public Prestamo(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamoMeses = tiempoPrestamoMeses;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public int getTiempoPrestamoMeses() {
        return tiempoPrestamoMeses;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTiempoPrestamoMeses(int tiempoPrestamoMeses) {
        this.tiempoPrestamoMeses = tiempoPrestamoMeses;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public abstract double getValorMensualPago();

    @Override
    public String toString() {
        return String.format("--- Información del Préstamo ---\n"
                + "Beneficiario:\n%s\n"
                + "Tiempo de Préstamo (Meses): %d\n"
                + "Ciudad del Préstamo: %s",
                getBeneficiario(), getTiempoPrestamoMeses(), getCiudadPrestamo());
    }
}
