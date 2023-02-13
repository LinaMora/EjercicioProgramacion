public class PuntoCinco {

    private Double radio;


    public PuntoCinco(Double radio){
        this.radio = radio;
    }

    public Double calcularArea(){
        return Math.PI*this.radio*this.radio;
    }

    public Double calcularAreaCircular(PuntoCinco interno){
        return this.calcularArea() - interno.calcularArea();
    }
}
