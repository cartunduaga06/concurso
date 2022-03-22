import java.util.List;

public class Test {
    private List<Pregunta> preguntas;
    private int puntosTotales;
    private int preguntaActual;

    public Test(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public int getPreguntaActual() {
        return preguntaActual;
    }

    public void setPreguntaActual(int preguntaActual) {
        this.preguntaActual = preguntaActual;
    }


}
