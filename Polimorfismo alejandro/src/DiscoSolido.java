import java.util.Date;

public class DiscoSolido extends Tecnologico{
    private int capacidad;

    public DiscoSolido(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int capacidad) {
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);
        this.capacidad = capacidad;
    }

}
