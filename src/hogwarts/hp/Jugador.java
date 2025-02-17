package hogwarts.hp;

import java.util.ArrayList;

public class Jugador extends Personaje{
    private int energia;
    private String fraseFavorita;
    private ArrayList<Hechizo> hechizos;
    private static int hechizosLanzadosTotal = 0;

    public Jugador(String nombre, int salud, String fraseFavorita) {
        super(nombre, salud);
        this.salud = 100;
        this.energia = 50;
        this.fraseFavorita = fraseFavorita;
        this.hechizos = new ArrayList<>();

        Hechizo hec1 = new Hechizo("Expelliarmus", 10, 20);
        this.hechizos.add(hec1);

        Hechizo hec2 = new Hechizo("Stupefy", 15, 30);
        this.hechizos.add(hec2);

        Hechizo hec3 = new Hechizo("Expecto Patronum", 20, 50);
        this.hechizos.add(hec3);
    }

    @Override
    public void lanzarFraseFavorita() {

    }

    @Override
    public void atacar(Personaje enemigo, int hechizo) {
        if (hechizo < 0 && hechizo >3){
            System.out.println("El hechizo no existe tonto !");
        }
    }

    @Override
    public void recibirDanyo(int valorDanyo) {

    }
}
