package example.personajes;

import example.inter.IEstratega;

public class Soka extends Personaje implements IEstratega {
    private boolean tengoBoomeran;
    public Soka() {
        super("Soka", "agua");
        tengoBoomeran = true;
    }
    public void setTengoBoomeran(boolean tengoBoomeran) {
        this.tengoBoomeran = tengoBoomeran;
    }
    public boolean getTengoBoomeran() {
        return tengoBoomeran;
    }
    @Override
    public String toString() {
        return "Yo soy "+nombre+" "+nacion+" "+estadoAnimo;
    }
    @Override
    public void planearBatalla() {
        System.out.println("Sokka esta haciendo un plan para la batalla");
    }

}
