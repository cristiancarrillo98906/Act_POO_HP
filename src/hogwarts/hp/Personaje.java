package hogwarts.hp;

public abstract class Personaje implements Atacante {

    protected String nombre;
    protected int salud;

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public String getNombre() {
        return this.nombre;
    }

    public final boolean estaVivo(){
        if (this.salud > 0){
            return true;
        } else {
            return false;
        }
    }
    public abstract void lanzarFraseFavorita();


    @Override
    public String toString(){
        return this.nombre + " [Salud: " + this.salud + "]";
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
