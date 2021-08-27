public class DiscoDuro extends Alquilable{
    private int capacidad;

    public DiscoDuro(String codigo, String modelo, double precioHora, int capacidad) {
        super(codigo, modelo, precioHora);
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "precioHora=" + precioHora +
                ", capacidad=" + capacidad +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
