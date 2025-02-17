package hogwarts.hp;

import javax.print.DocFlavor;

public class Hechizo {
    private String nombre;
    private int energia;
    private int danyo;

    public Hechizo(String nombre, int energia, int danyo) {
        this.nombre = nombre;
        this.energia = energia;
        this.danyo = danyo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getDanyo() {
        return this.danyo;
    }

    @Override
    public String toString(){
        return this.nombre + " [Energía: " + this.energia + "]" + " [Daño: " + this.danyo + "]";
    }
}
