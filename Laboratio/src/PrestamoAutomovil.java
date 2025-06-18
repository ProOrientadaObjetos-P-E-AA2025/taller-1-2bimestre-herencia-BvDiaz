
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualPagoPrestamoAutomovil;

    public PrestamoAutomovil(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo,
            String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {

        super(beneficiario, tiempoPrestamoMeses, ciudadPrestamo);

        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;

        calcularValorMensualPagoPrestamoAutomovil();
        setCiudadPrestamo(ciudadPrestamo);
    }

    public void calcularValorMensualPagoPrestamoAutomovil() {
        if (tiempoPrestamoMeses > 0) {
            this.valorMensualPagoPrestamoAutomovil = valorAutomovil / tiempoPrestamoMeses;
        } else {
            this.valorMensualPagoPrestamoAutomovil = 0;
        }
    }

    @Override
    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    @Override
    public double getValorMensualPago() {
        return valorMensualPagoPrestamoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
        calcularValorMensualPagoPrestamoAutomovil();
    }

    @Override
    public String toString() {
        return String.format("%s\n"
                + "--- Detalles Préstamo Automóvil ---\n"
                + "Tipo de Automóvil: %s\n"
                + "Marca Automóvil: %s\n"
                + "Garante 1:\n%s\n"
                + "Valor Automóvil: %.2f\n"
                + "Valor Mensual Pago: %.2f",
                super.toString(),
                getTipoAutomovil(), getMarcaAutomovil(), getGarante1(),
                getValorAutomovil(), getValorMensualPago());
    }
}
