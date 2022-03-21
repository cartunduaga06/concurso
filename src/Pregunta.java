import java.util.List;

public class Pregunta {

    private String pregunta;
    private List<Respuesta> respuestas;
    private int categoria;
    private int puntos;

    public Pregunta(String pregunta, List<Respuesta> respuestas, int categoria, int puntos) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
        this.categoria = categoria;
        this.puntos = puntos;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }


    public  void mostrarPregunta() {
        System.out.println(pregunta);

        int i=0;
        while(i<respuestas.size()){
            System.out.println("\t" + (i+1) + ". " + respuestas.get(i));
                    i++;
        }
    }
     public boolean comprobarRespuesta(int respuesta) {
        Respuesta r = respuestas.get(respuesta -1);
        if(r !=null){
            return r.isCorrecta();
        }return false;


     }

}


