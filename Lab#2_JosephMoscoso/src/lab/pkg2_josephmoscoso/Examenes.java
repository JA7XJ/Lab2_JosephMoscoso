package lab.pkg2_josephmoscoso;

import java.util.ArrayList;

public class Examenes {
    private String clase;
    private ArrayList preguntas;
    
    public Examenes(String clase, ArrayList preguntas){
        this.clase=clase;
        this.preguntas=preguntas;
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
    
}
