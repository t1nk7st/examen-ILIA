public class TarifaBasica extends Tarifa {

    public TarifaBasica(String socio, double precioMes) {
        super(socio, precioMes);
    }

    @Override
    public double precioCuota(int meses) {
        return meses * getPrecioMes();
    }
}
