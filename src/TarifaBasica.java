public class TarifaBasica extends Tarifa {

    public TarifaBasica(String socio, double precioMes) {
        super(socio, precioMes);
    }

    @Override
    public double precioCuota(int meses) {
        double precio = meses * getPrecioMes();
        if (meses >= 12) {
            precio = precio * 0.9;
        }
        return precio;
    }

}
