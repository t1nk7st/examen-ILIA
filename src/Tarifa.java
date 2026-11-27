public abstract class Tarifa {

    private final String socio;
    private final double precioMes;

    public Tarifa(String socio, double precioMes) {
        this.socio = socio;
        this.precioMes = precioMes;
    }

    public String getSocio() {
        return socio;
    }

    public double getPrecioMes() {
        return precioMes;
    }

    public abstract double precioCuota(int meses);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + socio;
    }
}
