import java.util.Date;

 class Tecnologico extends Producto {
    protected String PaisOrigen;
    protected Date FechaFabricacion;
    protected Empresa Fabricante;

     public Tecnologico(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante) {
         super(codigo, modelo);
         PaisOrigen = paisOrigen;
         FechaFabricacion = fechaFabricacion;
         Fabricante = fabricante;
     }

     @Override
     public String toString() {
         return "Tecnologico{" +
                 "codigo='" + codigo + '\'' +
                 ", modelo='" + modelo + '\'' +
                 ", PaisOrigen='" + PaisOrigen + '\'' +
                 ", FechaFabricacion=" + FechaFabricacion +
                 ", Fabricante=" + Fabricante +
                 '}';
     }
 }
