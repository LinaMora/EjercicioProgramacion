public class PuntoCuatro {

    private Double sueldo;


    public PuntoCuatro(Double sueldo){
        this.sueldo = sueldo;
    }

    public Double calcularArriendo(){
        return this.sueldo * 40 / 100;
    }

    public Double calcularComida(){
        return this.sueldo * 15 / 100;
    }

    public Double calcularLibre(){
        return this.sueldo - (this.calcularArriendo() + this.calcularComida() ) ;
    }
}
