package example;
import example.inter.*;
import example.personajes.Personaje;
import example.personajes.Soka;
import example.personajes.Katara;
import example.personajes.Toph;
import example.personajes.Zuko;
import example.personajes.Iroh;
import example.personajes.Aang;


import java.util.ArrayList;
import java.util.List;

public class ReunionEquipoAvatar {
    public static void main(String[] args) {
        List<Personaje> equipoAvatar=new ArrayList<>();
        Aang aang= new Aang();
        Toph toph= new Toph();
        Zuko zuko= new Zuko();
        Iroh iroh= new Iroh();
        Katara katara= new Katara();
        Soka soka= new Soka();

        equipoAvatar.add(aang);
        equipoAvatar.add(toph);
        equipoAvatar.add(zuko);
        equipoAvatar.add(iroh);
        equipoAvatar.add(katara);
        equipoAvatar.add(soka);

        System.out.println("Reunion del equipo avatar");
        for(Personaje p:equipoAvatar){
            p.presentacion();
            if(p instanceof IMaestroFuego){
                ((IMaestroFuego) p).controlarFuego();
            }
            if(p instanceof IMaestroAgua){
                ((IMaestroAgua) p).controlarAgua();
            }
            if(p instanceof IMaestroTierra){
                ((IMaestroTierra) p).controlarTierra();
            }
            if(p instanceof IMaestroVIento){
                ((IMaestroVIento) p).controlarVIento();
            }
            if(p instanceof IEstratega) {
                ((IEstratega)p).planearBatalla();
            }
            if(p instanceof ISabio) {
                ((ISabio)p).darConsejoFilosofico();
            }
            System.out.println();
        }
        System.out.println("Terminamos la reunion");
    }
}
