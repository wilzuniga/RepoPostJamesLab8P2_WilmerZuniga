
import java.io.Serializable;
import java.util.ArrayList;

public class Universo implements Serializable {
    public String Nombre;
    public int Cantidad;
    public ArrayList <SerViv> Seres = new ArrayList();

    public Universo() {
    }
    
    public Universo(String Nombre){
        this.Nombre = Nombre;
    }

    public Universo(String Nombre, int Cantidad) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public ArrayList<SerViv> getSeres() {
        return Seres;
    }

    public void setSeres(ArrayList<SerViv> Seres) {
        this.Seres = Seres;
    }
    
     public void setSeresL(SerViv Seres) {
        this.Seres.add(Seres);
    }

    @Override
    public String toString() {
        return  Nombre;
    }
    
    
}
