package lab.pkg2_josephmoscoso;
import java.util.*;
public class Lab2_JosephMoscoso {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        char r='s';
        while (r=='s'||r=='S') {
            System.out.println("¿Que desea hacer?");
            System.out.println("----------------------------------------------");
            System.out.println("1)Administración\n2)Crear Cuenta\n3)Log In");
            System.out.println("----------------------------------------------");
            System.out.println("Ingrese opcion (número): ");
            int op=sc.nextInt();
            System.out.println("----------------------------------------------");
            switch (op) {
                case 1:
                    System.out.println("Bienvenido maestro");
                    System.out.println("----------------------------------------------");
                    System.out.println("¿Que desea hacer?");
                    System.out.println("----------------------------------------------");
                    System.out.println("1)Elaborar examenes\n2)Revisar examenes\n3)Notas de alumnos");
                    System.out.println("----------------------------------------------");
                    System.out.println("Ingrese opcion (número): ");
                    int op2=sc.nextInt();
                    System.out.println("----------------------------------------------");
                    switch (op2) {
                        case 1:
                            char r2='s';
                            while (r2=='s'||r2=='S') {
                                System.out.print("Ingrese el nombre de la clase por favor: ");
                                String clase=sc.next();
                                System.out.print("Cuantas preguntas desea crear: ");
                                int l=sc.nextInt();
                                ArrayList preguntas=new ArrayList();
                                ArrayList<Examenes> e=new ArrayList();
                                //ArrayList respuestas=new ArrayList();
                                for (int i = 0; i < l; i++) {
                                    System.out.print("Ingrese pregunta: ");
                                    String p=sc.nextLine();
                                    preguntas.add(p);
                                    /*System.out.print("Ingrese respuestas: ");
                                    String re=sc.nextLine();
                                    respuestas.add(re);*/
                                }
                                e.add(new Examenes(clase, preguntas));
                            }
                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("No existe opcion");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("No existe");
            }
            System.out.println("----------------------------------------------");
            System.out.print("¿Desea volver?[S/N]: ");
            r=sc.next().charAt(0);
        }
    }
    
}
