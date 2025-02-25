package hogwarts.hp;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class Jugador extends Personaje implements Atacante{
    private int energia;
    private String fraseFavorita;
    private ArrayList<Hechizo> hechizos;
    private static int hechizosLanzadosTotal = 0;

    public Jugador(String nombre, String fraseFavorita) {
        super(nombre, 100);
        //this.salud = 100;
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
        System.out.println(this.fraseFavorita);
    }

    @Override
    public void atacar(Personaje enemigo, int hechizo) {
        Scanner scan = new Scanner(System.in);
        while (hechizo < 0 || hechizo >= hechizos.size()){
            System.out.println("El hechizo no existe, muggle!");
            hechizo = scan.nextInt() -1 ;
        }

        Hechizo hechizoSeleccionado = hechizos.get(hechizo);

        if (hechizoSeleccionado.getEnergia() > this.energia){
            System.out.println("No tienes suficiente energía para usar " + hechizoSeleccionado.getNombre() + ", sangre sucia");
        } else {
            this.energia = this.energia - hechizoSeleccionado.getEnergia();
            enemigo.recibirDanyo(hechizoSeleccionado.getDanyo());
            System.out.println(this.nombre + " realiza " + hechizoSeleccionado.getNombre() + " haciendo un daño de " + hechizoSeleccionado.getDanyo() + " a " + enemigo.nombre);
            hechizosLanzadosTotal++;
        }
    }

    public void recibirDanyo(int valorDanyo) {
    this.salud = this.salud - valorDanyo;
    if (this.salud < 0){
        this.salud = 0;
        }
    }

    public void recuperarEnergia() {
        this.energia = this.energia + 15;
        System.out.println(this.nombre + " recupera " + 15 + " puntos de energía");
    }

    public String toString(){
        return this.nombre + " [Salud: " + this.salud + "] [Energía: " + this.energia + "]";
    }

    public void mostrarHechizos() {
        System.out.println(" - - - - - - - Hechizos Disponibles - - - - - - - ");
        for (int i = 0; i < hechizos.size(); i++){
            System.out.println((i + 1) + " - " + hechizos.get(i).toString());
        }
    }

    public static void mostrarHechizosLanzados() {
        System.out.println("Se lanzaron un total de " + hechizosLanzadosTotal + " hechizos.");
    }

}
