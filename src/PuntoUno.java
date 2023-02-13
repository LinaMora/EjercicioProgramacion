public class PuntoUno {

    private Double x;
    private Double y;


    public PuntoUno(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public Double funcionCuadratica(){
        return (x*x)+(2*x*y)+(y*y);
    }
}
