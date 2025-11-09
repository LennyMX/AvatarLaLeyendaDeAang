package example.personajes;

public abstract class MaestroUnElemento extends Personaje{
    public MaestroUnElemento(String nombre, String nacion){
        super(nombre,nacion);
    }
    public abstract void atacar();
}
