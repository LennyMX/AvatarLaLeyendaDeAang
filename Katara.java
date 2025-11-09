package example.personajes;

import example.inter.IMaestroAgua;

public class Katara extends MaestroUnElemento implements IMaestroAgua {

    public Katara() {
        super("Katara","Agua");
    }
    @Override
    public void atacar(){
        System.out.println("Yo soy katara y te ataco");
    }
    @Override
    public void controlarAgua(){
        atacar();
        System.out.println("Yo controlo el agua");
    }
}
