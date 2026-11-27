public class TarifaPiscina extends Tarifa {

    private static final double PISCINA_MES = 5.0;

    public TarifaPiscina(String socio, double precioMes) {
        super(socio, precioMes);
    }

    @Override
    public double precioCuota(int meses) {
        return meses * (getPrecioMes() + PISCINA_MES);
    }
}
