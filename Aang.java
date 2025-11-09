package example.personajes;

import example.inter.IMaestroAgua;
import example.inter.IMaestroFuego;
import example.inter.IMaestroTierra;
import example.inter.IMaestroVIento;

public class Aang extends Personaje implements IMaestroAgua, IMaestroFuego, IMaestroTierra, IMaestroVIento {
    private boolean estadoAvatar;
    public Aang(){
        super("Aang","Viento", "Feliz");
    }
    @Override
    public void controlarAgua(){
        if(estadoAvatar) {
            System.out.println("Agua control, con todoas mis vidas pasadas");
        }
        System.out.println("Controlo el agua");
    }
    @Override
    public void controlarFuego(){
        if(estadoAvatar) {
            System.out.println("Fuego control, con todoas mis vidas pasadas");
        }
        System.out.println("Controlo el fuego");
    }
    @Override
    public void controlarVIento(){
        if(estadoAvatar) {
            System.out.println("Viento control, con todoas mis vidas pasadas");
        }
        System.out.println("Controlo el viento");
    }

    @Override
    public void controlarTierra(){
        if(estadoAvatar) {
            System.out.println("Tierra control, con todoas mis vidas pasadas");
        }
        System.out.println("Controlo la tierra");
    }
    public void setEstadoAvatar(boolean estado){
        this.estadoAvatar = estado;
    }
    public boolean getEstadoAvatar(){
        return this.estadoAvatar;
    }

}
