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
        }
    }
    
}
