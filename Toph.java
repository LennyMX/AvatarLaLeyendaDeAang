package example.personajes;

import example.inter.IMaestroTierra;

public class Toph extends MaestroUnElemento implements IMaestroTierra {
    public Toph(){
        super("Toph","Tierra");
    }
    @Override
    public void atacar(){
        System.out.println("Yo soy toph y te ataco");
    }
    @Override
    public void controlarTierra(){
        atacar();
        System.out.println("Yo controlo la tierra");
    }
}
