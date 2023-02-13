import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //PUNTO 1
        Double response = puntoUno(2.0,3.0);
        System.out.println("Response =>"+response);
        PuntoUno data = new PuntoUno(2.0, 3.0);
        System.out.println("Response =>"+data.funcionCuadratica());

        //PUNTO 2
        PuntoDos puntoDos = new PuntoDos(20, 10, 4);
        System.out.println("Response =>"+puntoDos.calcular());

        //PUNTO 3 PENDIENTE DEFINICION


        //PUNTO 4
        PuntoCuatro puntoCuatro = new PuntoCuatro(1000000.0);
        System.out.println("En arriendo se gastó =>"+puntoCuatro.calcularArriendo());
        System.out.println("En comida se gastó =>"+puntoCuatro.calcularComida());
        System.out.println("Le quedó libre =>"+puntoCuatro.calcularLibre());

        //PUNTO 5
        PuntoCinco grande = new PuntoCinco(10d);
        PuntoCinco chico = new PuntoCinco(5d);
        System.out.println("Area circular directa =>"+(grande.calcularArea() - chico.calcularArea()));
        System.out.println("Area circular segun pide el punto =>"+(grande.calcularAreaCircular(chico)));

        //PUNTO 6
        System.out.println(procesarPuntoSeis());

        //PUNTO 7
        PuntoCartesiano x = preguntarPuntos( 1);
        PuntoCartesiano y = preguntarPuntos( 2);
        PuntoSiete puntoSiete = new PuntoSiete();
        double distanciaEntrePuntos = puntoSiete.distanciaEntrePuntos(x,y);
        System.out.println("La distancia entre los puntos es = "+distanciaEntrePuntos);
        double pendienteRecta = puntoSiete.pendienteRecta(x,y);
        System.out.println("La pendiente de la recta es = "+pendienteRecta);
        PuntoCartesiano puntoMedio = puntoSiete.puntoMedio(x,y);
        System.out.println("El punto medio es = ("+puntoMedio.getX()+", "+puntoMedio.getY()+")");

        //PUNTO 8
    
        PuntoOcho puntoOcho = new PuntoOcho( 40, 20 ,200);
        System.out.println("El numero de salones es "+puntoOcho.calcular());

        //PUNTO 9
        System.out.println(procesarPuntoNueve());

        //PUNTO 10
        System.out.println(puntoDiez(5,2,"+"));
        System.out.println(puntoDiez(5,2,"-"));
        System.out.println(puntoDiez(5,2,"*"));
        System.out.println(puntoDiez(5,2,"/"));
        System.out.println(puntoDiez(5,2,"%"));

        //Punto 11

        System.out.println(decenas(52));
        System.out.println(unidades(52));

//PUNTO 12
        System.out.println(siguienteDia("lunes"));
    }



    // PUNTO 8

    public  static  class PuntoOcho{
        private int salones;
        private int pisos;
        private int estudiantes;

        public PuntoOcho(int salones, int pisos, int estudiantes) {
            this.salones = salones;
            this.pisos = pisos;
            this.estudiantes = estudiantes;
        }
        public int calcular() {
            double salones = (double)((this.estudiantes * this.salones) / this.pisos);
            Double response = Math.ceil(salones);
            return response.intValue();
        }
    }

    // PUNTMO 9
    private int puntoNueve(int a, int b) {
        if (a >= b) {
            return (a);
        } else if (b >= a) {
            return (b);
        }
        return 0;
    }
    private static String procesarPuntoNueve(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero ");
            int a = scanner.nextInt();
            System.out.print("Ingrese un numero ");
            int b = scanner.nextInt();

            return ("tu numero es ") ;
    }
//PUNTO 12
    private static String siguienteDia(String dia){
        if(dia.equalsIgnoreCase("lunes")){
            return "martes";
        } else if (dia.equalsIgnoreCase("martes")) {
            return "miercoles";
        } else if (dia.equalsIgnoreCase("miercoles")) {
            return "jueves";
        } else if (dia.equalsIgnoreCase("jueves")) {
            return "viernes";
        } else if (dia.equalsIgnoreCase("viernes")) {
            return "sabado";
        } else if (dia.equalsIgnoreCase("sabado")) {
            return "domingo";
        } else {
            return "lunes";
        }
    }

    //PUNTO 11
    private static int decenas(int num){
        return  num/10;
    }

    private static int unidades(int num){
        return num%10;
    }

    //PUNTO 10
    private static  double puntoDiez(int a, int b, String operacion){
        if (operacion.equals("+")){
            return a+(b*1d);
        }
        if (operacion.equals("-")){
            return a-(b*1d);
        }
        if (operacion.equals("*")){
            return a*(b*1d);
        }
        if(operacion.equals("/")){
            return a/(b*1d);
        } else if(operacion.equals("%")){
            return a%(b*1d);
        }
        return 0;
    }

    //PUNTO 7
    private static PuntoCartesiano preguntarPuntos( int numero){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el punto numero " + numero);
        System.out.println("x:");
        double x = scanner.nextDouble();
        System.out.println("y:");
        double y = scanner.nextDouble();
        return new PuntoCartesiano(x,y);
    }
//PUNTO 6
    private static String procesarPuntoSeis(){
        String response ="";
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el valor de A = ");
            double a = scanner.nextDouble();
            System.out.print("Ingrese el valor de B = ");
            double b = scanner.nextDouble();
            System.out.print("Ingrese el valor de C = ");
            double c = scanner.nextDouble();
            if(!validarDouble(a)){
                response = "El valor ingresado de A no es válido, debe ser mayor a cero 0.0";
            } else if (!validarDouble(b)){
                response = "El valor ingresado de B no es válido, debe ser mayor a cero 0.0";
            } else if (!validarDouble(c)){
               response = "El valor ingresado de C no es válido, debe ser mayor a cero 0.0";
            } else if(c > a){
                response = "El valor ingresado de C no es válido, debe ser mayor o igual a la variable A";
            } else{
                PuntoSeis puntoSeis = new PuntoSeis(a,b,c);
                double perimetro = puntoSeis.perimetro();
                double area = puntoSeis.areaRectangulo() + puntoSeis.areaTriangulo();
                response = "El área del terreno es de "+area + " y el perimetro es de "+perimetro;
            }
        } catch (Exception e){
            e.printStackTrace();
            response = "Uno de los valores ingresado no es válido";
        }
        return response;
    }
    private static boolean validarDouble(double input){
        if (input <= 0d )
            return false;
        return true;
    }

//PUNTO 1
    public static Double puntoUno(Double x, Double y){
        return (x*x)+(2*x*y)+(y*y);
    }



}