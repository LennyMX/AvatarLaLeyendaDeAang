package example.personajes;

import example.inter.IMaestroFuego;
import example.inter.ISabio;

public class Iroh extends MaestroUnElemento implements IMaestroFuego, ISabio {
    public Iroh() {
        super("Iroh", "Fuego");
    }
    @Override
    public void atacar() {
        System.out.println("Atacando el Fuego");
    }
    @Override
    public void controlarFuego() {
        System.out.println("Controlando el Fuego");
    }
    @Override
    public void darConsejoFilosofico(){
        System.out.println("Escucha el siguiente consejo");
    }
}
