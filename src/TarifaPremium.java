public class TarifaPremium extends Tarifa {

    private static final double MATRICULA = 20.0;

    public TarifaPremium(String socio, double precioMes) {
        super(socio, precioMes);
    }

    @Override
    public double precioCuota(int meses) {
        return meses * getPrecioMes() + MATRICULA;
    }
}
