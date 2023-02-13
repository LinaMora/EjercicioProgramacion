public class PuntoSeis {

    private Double a;
    private Double b;
    private Double c;


    public PuntoSeis(Double a, Double b, Double c){
        this.a = a ;
        this.b = b;
        this.c = c;
    }

    public Double areaRectangulo(){
        return this.b*this.c;
    }

    public double hipotenusa(){
        return Math.sqrt((this.b*this.b) + ( (this.a-this.c)*(this.a - this.c) ));
    }

    public double areaTriangulo(){
        return ((this.a-this.c)*this.b)/2;
    }

    public double perimetro(){
        return hipotenusa()+ this.a + this.b +this.c;
    }


}
