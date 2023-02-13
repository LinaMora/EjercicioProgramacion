public class PuntoSiete {

    public PuntoSiete(){
    }

    public static double distanciaEntrePuntos(PuntoCartesiano x, PuntoCartesiano y){

        return Math.sqrt(Math.pow(x.getY()-y.getY(), 2) + Math.pow(x.getX() - y.getX() , 2) );
    }

    public double pendienteRecta(PuntoCartesiano x, PuntoCartesiano y){
        return (x.getY()- y.getY())/ (x.getX()- y.getX());
    }

    public PuntoCartesiano puntoMedio(PuntoCartesiano x, PuntoCartesiano y){
        double xm=(y.getX()+x.getX())/2;
        double ym=(y.getY())+x.getY()/2;

        PuntoCartesiano respuesta = new PuntoCartesiano(xm,ym);
        return respuesta;
    }

}
