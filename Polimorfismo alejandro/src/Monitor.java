public class Monitor  extends Alquilable{
    private String resolucionMaxima;

    public Monitor(String codigo, String modelo, double precioHora, String resolucionMaxima) {
        super(codigo, modelo, precioHora);
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "precioHora=" + precioHora +
                ", resolucionMaxima='" + resolucionMaxima + '\'' +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
