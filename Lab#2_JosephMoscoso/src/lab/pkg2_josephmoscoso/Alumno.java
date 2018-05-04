package lab.pkg2_josephmoscoso;
import java.util.*;
public class Alumno {
    private String name;
    private String account;
    private int edad;
    private String Ciudad;
    private String Nacion;
    private String Id;
    private String User;
    private String password;
    private int nota;

    public Alumno(String name, String account, int edad, String Ciudad, String Nacion, String Id, String User, String password, int nota) {
        this.name = name;
        this.account = account;
        this.edad = edad;
        this.Ciudad = Ciudad;
        this.Nacion = Nacion;
        this.Id = Id;
        this.User = User;
        this.password = password;
        this.nota = nota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getNacion() {
        return Nacion;
    }

    public void setNacion(String Nacion) {
        this.Nacion = Nacion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
