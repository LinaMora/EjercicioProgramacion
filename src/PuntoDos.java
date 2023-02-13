
public class PuntoDos {

    private int estudiantesGordos;
    private int estudiantesFlacos;
    private int sillasPorBus;

    public PuntoDos(int estudiantesFlacos, int estudiantesGordos, int sillasPorBus){
        this.estudiantesFlacos = estudiantesFlacos;
        this.estudiantesGordos = estudiantesGordos;
        this.sillasPorBus = sillasPorBus;
    }

    public int calcular(){
        double buses = (double) ((this.estudiantesGordos * 2 + this.estudiantesFlacos)/ this.sillasPorBus );
        Double response = Math.ceil(buses);
        return response.intValue();

    }
}

