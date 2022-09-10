
import java.io.Serializable;


public class SerViv implements Serializable {

    private String Nombre;
    private int ID;
    private int Poder;
    private int Años;
    private Universo Universo;
    private String Raza;

    public SerViv() {
    }

    public SerViv(String Nombre, int ID, int Poder, int Años, Universo Universo, String Raza) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Poder = Poder;
        this.Años = Años;
        this.Universo = Universo;
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public int getAños() {
        return Años;
    }

    public void setAños(int Años) {
        this.Años = Años;
    }

    public Universo getUniverso() {
        return Universo;
    }

    public void setUniverso(Universo Universo) {
        this.Universo = Universo;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return Nombre + " - " + ID;
    }



    
}
