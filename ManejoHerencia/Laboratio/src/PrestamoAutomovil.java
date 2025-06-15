
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualPagooPrestamoAutomovil;

    public PrestamoAutomovil(Persona benificiario, int tiempoPrestamoMesess, String ciuddadPrestamo,
            String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        
        super(benificiario, tiempoPrestamoMesess, ciuddadPrestamo);
        
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        
        calcularValorMensualPagooPrestamoAutomovil();
        setciudadprestamo(ciuddadPrestamo);
    }

    public void calcularValorMensualPagooPrestamoAutomovil() {
        
        if (tprestamomeses > 0) {
            
            this.valorMensualPagooPrestamoAutomovil = valorAutomovil / tprestamomeses;
            
        } else {
            
            this.valorMensualPagooPrestamoAutomovil = 0;
        }
    }

    public void setciudadprestamo(String ciuddadPrestamo) {
        this.ciudadprestamo = ciuddadPrestamo.toLowerCase();
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

    public double getValorMensualPagooPrestamoAutomovil() {
        return valorMensualPagooPrestamoAutomovil;
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
        
        calcularValorMensualPagooPrestamoAutomovil();
    }

    @Override
    public String toString() {

        return String.format("%s\n"
                
                + "--- Detalles Prestamo Automovill ---\n"
                + "Tipo de Automovil: %s\n"
                + "Marca Automovil: %s\n"
                + "Garante 1:\n%s\n"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual Pago: %.2f",
                
                super.toString(),
                
                getTipoAutomovil(), getMarcaAutomovil(), getGarante1(),
                getValorAutomovil(), getValorMensualPagooPrestamoAutomovil());
    }
}