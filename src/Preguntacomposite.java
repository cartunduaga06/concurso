import java.util.ArrayList;
import java.util.List;

public class Preguntacomposite implements Preguntas {

    private String pregunta;
    private List<Respuesta> respuestas;



    public Preguntacomposite(String pregunta) {
        this.pregunta = pregunta;
        this.respuestas = new ArrayList<>();


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


    public void getName() {respuestas.forEach(Preguntas::getName);}

    public void addDepart(Respuesta pregunta) {
        respuestas.add(pregunta);
    }

    public void removeDepart(Respuesta pregunta) {
        respuestas.remove(pregunta);
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

    @Override
    public void getName() {

    }
}


