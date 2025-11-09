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

//Polimorfismo: ¿Por qué fue posible añadir objetos de tipos tan diferentes (Aang, Sokka, Iroh) a la misma lista ArrayList<Personaje>?
//Porque todas las clases heredan de la misma clase padre que es Personajes, por lo que serian todos personajes

//instanceof y Casting: En la Parte 2, ¿por qué fue necesario usar instanceof antes de llamar a planearBatalla()? 
//porque la variable p es de tipo personaje y esta clase no creo este metodo
//¿Qué error habría ocurrido si intentaras llamar p.planearBatalla() directamente en la variable p (que es de tipo Personaje)?
//marcaria error ya que personaje no hizo este metodo por lo que no podria implementarlo


//Diseño de Iroh: ¿Qué dos "tipos" (o contratos) combina la clase Iroh? 
//usa la interfaz IMaestroFuego y ISabio ya que en la serie estos dos elementos aplican sobre este personaje
//implementando lo que puede llegar a hacer dentro de la serie

//¿Cómo demuestra esto la flexibilidad de las interfaces sobre la herencia?
//muestra que las clases solo pueden heredar de 1 pero puede implementar multiples interfaces

//Desafío Futuro (Opcional): ¿Cómo modelarías a un Maestro-Lava (como Bolin de "La Leyenda de Korra")? Un Maestro-Lava es, fundamentalmente, 
//un Maestro Tierra que ha desbloqueado una habilidad especial. ¿Usarías herencia, una interfaz, o ambas? Justifica tu diseño.
//aplicaria una herencia hacia MaestroUnElemento eh implementaria las 2 interfaces de tierra y fuego para combinar los elementos 
