package example.personajes;

import example.inter.IMaestroFuego;

public class Zuko extends MaestroUnElemento implements IMaestroFuego {
    public Zuko(){
        super("Zuko", "Fuego");
    }
    @Override
    public void atacar(){
    }
    @Override
    public void controlarFuego(){
        atacar();
        System.out.println("Yo controlo el Fuego");
    }
}
