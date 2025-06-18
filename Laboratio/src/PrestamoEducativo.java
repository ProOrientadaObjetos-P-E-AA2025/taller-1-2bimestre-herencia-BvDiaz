
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudios;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPagoPrestamoCarrera;

    public PrestamoEducativo(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo,
            String nivelEstudios, InstitucionEducativa centroEducativo, double valorCarrera) {

        super(beneficiario, tiempoPrestamoMeses, ciudadPrestamo);

        this.nivelEstudios = nivelEstudios;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;

        calcularValorMensualPagoPrestamoCarrera();
        setCiudadPrestamo(ciudadPrestamo);
    }

    public void calcularValorMensualPagoPrestamoCarrera() {
        if (tiempoPrestamoMeses > 0) {
            double valorPorMes = valorCarrera / tiempoPrestamoMeses;
            this.valorMensualPagoPrestamoCarrera = valorPorMes - (valorPorMes * 0.10);
        } else {
            this.valorMensualPagoPrestamoCarrera = 0;
        }
    }

    @Override
    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo.toUpperCase();
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    @Override
    public double getValorMensualPago() {
        return valorMensualPagoPrestamoCarrera;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
        calcularValorMensualPagoPrestamoCarrera();
    }

    @Override
    public String toString() {
        return String.format("%s\n"
                + "--- Detalles Préstamo Educativo ---\n"
                + "Nivel de Estudio: %s\n"
                + "Centro Educativo:\n%s\n"
                + "Valor Carrera: %.2f\n"
                + "Valor Mensual Pago: %.2f",
                super.toString(),
                getNivelEstudios(), getCentroEducativo(),
                getValorCarrera(), getValorMensualPago());
    }
}
