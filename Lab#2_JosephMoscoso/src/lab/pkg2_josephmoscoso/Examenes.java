package lab.pkg2_josephmoscoso;

import java.util.ArrayList;

public class Examenes {
    private String clase;
    private ArrayList preguntas;
    private ArrayList respuesta;
    public Examenes(String clase, ArrayList preguntas, ArrayList respuesta){
        this.clase=clase;
        this.preguntas=preguntas;
        this.respuesta=respuesta;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ArrayList getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList preguntas) {
        this.preguntas = preguntas;
    }
    public ArrayList getRespuesta(){
        return respuesta;
    }
    public void setRespuesta(ArrayList respuesta){
        this.respuesta=respuesta;
    }
}
