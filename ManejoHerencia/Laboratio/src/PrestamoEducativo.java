

public class PrestamoEducativo extends Prestamo {

    private String nivelEstudios;
    private InstitucionEducativa centroEducativoo;
    private double valorCarrera;
    private double valorMensualPagooPrestamoCarrera;

    public PrestamoEducativo(Persona benificiario, int tiempoPrestamoMesess, String ciuddadPrestamo,
            String nivelEstudios, InstitucionEducativa centroEducativoo, double valorCarrera) {

        super(benificiario, tiempoPrestamoMesess, ciuddadPrestamo);

        this.nivelEstudios = nivelEstudios;
        this.centroEducativoo = centroEducativoo;
        this.valorCarrera = valorCarrera;

        calcularValorMensualPagooPrestamoCarrera();
        setciudadprestamo(ciuddadPrestamo);
    }

    public void calcularValorMensualPagooPrestamoCarrera() {

        if (tprestamomeses > 0) {

            double valorPorMes = valorCarrera / tprestamomeses;
            this.valorMensualPagooPrestamoCarrera = valorPorMes - (valorPorMes * 0.10);

        } else {

            this.valorMensualPagooPrestamoCarrera = 0;
        }
    }

    public void setciudadprestamo(String ciuddadPrestamo) {
        this.ciudadprestamo = ciuddadPrestamo.toUpperCase();
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public InstitucionEducativa getCentroEducativoo() {
        return centroEducativoo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public double getValorMensualPagooPrestamoCarrera() {
        return valorMensualPagooPrestamoCarrera;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public void setCentroEducativoo(InstitucionEducativa centroEducativoo) {
        this.centroEducativoo = centroEducativoo;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
        calcularValorMensualPagooPrestamoCarrera();
    }

    @Override
    public String toString() {

        return String.format("%s\n"
                
                + "--- Detalles Prestamoo Educativo ---\n"
                + "Nivel de Estudio: %s\n"
                + "Centro Educativo:\n%s\n"
                + "Valor Carrera: %.2f\n"
                + "Valor Mensual Pago: %.2f",
                
                super.toString(),
                
                getNivelEstudios(), getCentroEducativoo(),
                getValorCarrera(), getValorMensualPagooPrestamoCarrera());
    }
}