package lab.pkg2_josephmoscoso;
import java.util.*;
public class Lab2_JosephMoscoso {
static Scanner sc=new Scanner(System.in);
static ArrayList preguntas=new ArrayList();
static ArrayList respuesta=new ArrayList();
static ArrayList<Examenes> e=new ArrayList();
static ArrayList<Alumno> a=new ArrayList();
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
                                /*ArrayList preguntas=new ArrayList();
                                ArrayList<Examenes> e=new ArrayList();*/
                                //ArrayList respuestas=new ArrayList();
                                for (int i = 0; i < l; i++) {
                                    System.out.print("Ingrese pregunta: ");
                                    String p=sc.nextLine();
                                    preguntas.add(p);
                                    /*System.out.print("Ingrese respuestas: ");
                                    String re=sc.nextLine();
                                    respuestas.add(re);*/
                                }
                                e.add(new Examenes(clase, preguntas, respuesta));
                                System.out.println("----------------------------------------------");
                                System.out.print("¿Desea crear otro examen?[S/N]: ");
                                r2=sc.next().charAt(0);
                            }
                            break;
                        case 2:
                            revisar();                        
                            break;
                        case 3:
                            char resp='s', r4='s';
                            while(r4=='s'||r4=='S'){
                                System.out.println("Notas totales de los estudiantes: ");
                                System.out.println("----------------------------------------------");
                                for (int i = 0; i < a.size(); i++) {
                                    System.out.println("Nombre: "+a.get(i).getName());
                                    System.out.println("Nombre: "+a.get(i).getNota());
                                }
                                System.out.println("----------------------------------------------");
                                System.out.print("¿Desea modificar alguna nota?[S/N]: ");
                                resp=sc.next().charAt(0);
                                System.out.println("----------------------------------------------");
                                if (resp=='s'||resp=='S') {
                                    System.out.print("Ingrese el número de estudiante: ");
                                    int nn=sc.nextInt();
                                    System.out.print("Que nota desea ponerle: ");
                                    int nnn=sc.nextInt();
                                    a.get(nn).setNota(nnn);
                                }
                                System.out.println("----------------------------------------------");
                                System.out.print("¿Desea ver las notas de nuevo?[S/N]: ");
                                r4=sc.next().charAt(0);
                            }
                            break;
                        default:
                            System.out.println("No existe opcion");
                    }
                    break;
                case 2:
                    cuenta();
                    break;
                case 3:
                    login();
                    break;
                default:
                    System.out.println("No existe");
            }
            System.out.println("----------------------------------------------");
            System.out.print("¿Desea volver?[S/N]: ");
            r=sc.next().charAt(0);
        }
    }
    public static void revisar(){
        char resp='s';
        for (int i = 0; i < e.size(); i++) {
            System.out.println(i+")Examen de "+e.get(i).getClase());
            System.out.print("¿Desea revisar este examen?[S/N]: ");
            resp=sc.next().charAt(0);
            if (resp=='s'||resp=='S') {
                for (int j = 0; j < a.size(); j++) {
                    System.out.println("Alumno: "+a.get(i).getName());
                    for (int k = 0; k < e.get(i).getPreguntas().size(); k++) {
                        System.out.println(e.get(i).getPreguntas());
                        System.out.println(e.get(i).getRespuesta());
                    }
                    System.out.println("----------------------------------------------");
                    System.out.print("¿Que calificación desea dar?: ");
                    int n=sc.nextInt();
                    a.get(i).setNota(n);
                }
            }
        }
    }
    public static void login(){
        boolean log = false;
        int pos = 0;
        char r='s', r2='s';
        while(r=='s'||r=='S'){
            System.out.print("Bienvenido, por favor ingrese un username: ");
            String user=sc.next();
            System.out.print("Ingrese password: ");
            String pass=sc.next();
            for (int i = 0; i < a.size(); i++) {
                if (user.equals(a.get(i).getUser()) && pass.equals(a.get(i).getPassword())) {
                    log=true;
                    pos=i;
                }else{
                    log=false;
                }
            }
            System.out.println("----------------------------------------------");
            if (log==true) {
                System.out.println("Los datos del estudiante son: ");
                System.out.println("----------------------------------------------");
                System.out.println("Nombre: "+a.get(pos).getName());
                System.out.println("Cuenta: "+a.get(pos).getAccount());
                System.out.println("Edad: "+a.get(pos).getEdad());
                System.out.println("Ciudad: "+a.get(pos).getCiudad());
                System.out.println("Nacion: "+a.get(pos).getNacion());
                System.out.println("ID: "+a.get(pos).getId());
                System.out.println("Username: "+a.get(pos).getUser());
                System.out.println("Password: "+a.get(pos).getPassword());
                System.out.println("Califición: "+a.get(pos).getNota());
                System.out.println("----------------------------------------------");
                System.out.print("¿Desea modificar datos de usuario?[S/N]: ");
                r2=sc.next().charAt(0);
                if (r2=='s'||r2=='S') {
                    System.out.print("Buen dia, por favor ingrese el nombre: ");
                    String name=sc.nextLine();
                    name=sc.nextLine();
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
                    String user2=sc.next();
                    System.out.print("Ingrese password: ");
                    String pass2=sc.next();
                    System.out.println("----------------------------------------------");
                    a.add(new Alumno(name, account, edad, city, nation, id, user2, pass2, 0));
                    System.out.println("Los nuevos datos del estudiante son: ");
                    System.out.println("----------------------------------------------");
                    System.out.println("Nombre: "+a.get(pos).getName());
                    System.out.println("Cuenta: "+a.get(pos).getAccount());
                    System.out.println("Edad: "+a.get(pos).getEdad());
                    System.out.println("Ciudad: "+a.get(pos).getCiudad());
                    System.out.println("Nacion: "+a.get(pos).getNacion());
                    System.out.println("ID: "+a.get(pos).getId());
                    System.out.println("Username: "+a.get(pos).getUser());
                    System.out.println("Password: "+a.get(pos).getPassword());
                    System.out.println("Califición: "+a.get(pos).getNota());
                }
                System.out.println("----------------------------------------------");
                System.out.println("Ahora empieza la realizacion de examenes ¡Buena suerte!: ");
                for (int i = 0; i < e.size(); i++) {
                    System.out.println("Examen de: "+e.get(i).getClase());
                    for (int j = 0; j < e.get(i).getPreguntas().size(); j++) {
                        System.out.println(e.get(i).getPreguntas());
                        System.out.print("R//");
                        String resp=sc.nextLine();
                        respuesta.add(resp);
                    }
                }
                System.out.println("----------------------------------------------");
                System.out.println("Examenes terminados");
            }else{
                System.out.println("Error, user o password mal ingresados");
            }
            System.out.println("----------------------------------------------");
            System.out.print("¿Desea volver ingresar?[S/N]: ");
            r=sc.next().charAt(0);
        }
    }
    public static void cuenta(){
        char r3='s';
        //ArrayList<Alumno> a=new ArrayList();
        while (r3=='s'||r3=='S') {
            System.out.print("Buen dia, por favor ingrese el nombre: ");
            String name=sc.nextLine();
            name=sc.nextLine();
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
            System.out.println("----------------------------------------------");
            System.out.print("¿Desea ingresar otro alumno?[S/N]: ");
            r3=sc.next().charAt(0);
        }
    }
}
