package example.personajes;

public class Personaje {
    protected String nombre;
    protected String nacion;
    protected String estadoAnimo;

    public Personaje(String nombre, String nacion,  String estadoAnimo) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.estadoAnimo = estadoAnimo;
    }
    public Personaje(String nombre, String nacion) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.estadoAnimo = "Feliz";
    }
    public Personaje(){
        nacion="Tierra";
        nombre="desconocido";
        estadoAnimo="enojado";
    }

    public String  getNombre() {
        return nombre;
    }
    public String getNacion() {
        return nacion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacion(String nacion) {
        this.nacion = nacion;
    }
    public void presentacion(){
        System.out.println("Hola, soy "+ nombre+" de la nacion "+nacion+" y estoy " +estadoAnimo);
    }
    public String toString() {
        return nombre+" : "+nacion;
    }
}
