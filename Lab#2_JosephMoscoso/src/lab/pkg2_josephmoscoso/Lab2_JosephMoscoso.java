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
                    System.out.print("Ingrese opcion (número): ");
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
                            cuenta();
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
    public static void cuenta(){
        char r3='s';
        ArrayList<Alumno> a=new ArrayList();
        while (r3=='s'||r3=='S') {
            System.out.print("Buen dia, por favor ingrese el nombre: ");
            String name=sc.nextLine();
            //name=sc.nextLine();
            System.out.print("Escriba numero de cuenta: ");
            String account=sc.next();
            //account=sc.next();
            System.out.print("Ingrese la edad: ");
            int edad=sc.nextInt();
            System.out.print("Ingrese la ciudad: ");
            String city=sc.next();
            //city=sc.next();
            System.out.print("Ingrese la nacion: ");
            String nation=sc.next();
            System.out.print("Ingrese el ID: ");
            String id=sc.next();
            System.out.print("Ingrese el user: ");
            String user=sc.next();
            System.out.print("Ingrese password: ");
            String pass=sc.next();
            a.add(new Alumno(name, account, edad, city, nation, id, user, pass, 0));
            System.out.print("¿Desea ingresar otro alumno?[S/N]: ");
            r3=sc.next().charAt(0);
        }
    }
}
