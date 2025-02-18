package hogwarts.hp;

public class Enemigo extends Personaje{
    private int fuerza;
    private static int enemigosDerrotados = 0;


    public Enemigo(String nombre, int salud, int fuerza) {
        super(nombre, salud);
        this.fuerza = fuerza;
    }

    @Override
    public void lanzarFraseFavorita() {
        System.out.println("Buuaajajajajajajajajajajaja");
    }

    public static void  mostrarEnemigosDerrotados(){
        System.out.println("- - - - - - - - - - - - - - - ");
        System.out.println("Se han derrotado un total de " + enemigosDerrotados + " enemigos");
        System.out.println("- - - - - - - - - - - - - - - ");
    }

    @Override
    public void atacar(Personaje enemigo, int fuerza) {
        System.out.println(this.nombre + " lanza a " + enemigo.nombre + " causando " + this.fuerza + " de daño");

    }

    @Override
    public void recibirDanyo(int valorDanyo) {

    }
}
