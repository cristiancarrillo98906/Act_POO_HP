package hogwarts.hp;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Jugador harry = new Jugador("Harry Potter", "Soy el hechiero de la profecia ");

        ArrayList<Enemigo> enemigos = new ArrayList();

        Enemigo voldemort = new Enemigo("Voldemort", 80, 15);
        enemigos.add(voldemort);

        Enemigo dementor = new Enemigo("Dementor", 60, 10);
        enemigos.add(dementor);

        Enemigo mortifago = new Enemigo("Mortifago", 50, 12);
        enemigos.add(mortifago);

        System.out.println("¡Bienvenido al duelo mágico, " + harry.getNombre() + "!");

        Scanner scn = new Scanner(System.in);

        for (Enemigo enemigo : enemigos){
            if (harry.estaVivo()){
                System.out.println("¡Un "+ enemigo.getNombre() + " aparece!");

            while (harry.estaVivo() && enemigo.estaVivo()){
                System.out.println(harry);
                System.out.println(enemigo);
                System.out.println(" - - - - Elige la acción a realizar - - - - ");
                System.out.println("1 - Lanzar un hechizo");
                System.out.println("2 - Recuperar energía");

                int opcion = scn.nextInt();

                if (opcion == 1){
                    harry.mostrarHechizos();
                    System.out.println(" - - - - - Selecciona un hechizo - - - - -");
                    int hechizo = scn.nextInt() -1;
                    harry.atacar(enemigo, hechizo);
                    enemigo.toString();
                    } else if (opcion == 2){
                    harry.recuperarEnergia();
                    }

                    if (enemigo.estaVivo()){
                        enemigo.atacar(harry, enemigo.getFuerza());
                    }
                } // fin while

                if(harry.estaVivo()){
                    System.out.println("¡Has derrotado al " + enemigo.getNombre() + "!");
                } else {
                    System.out.println("¡Has sido derrotado! Fin del juego.");
                    enemigo.lanzarFraseFavorita();
                }
            }
        } // fin for principal

        if (harry.estaVivo()){
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("Has derrotado a todos los enemigos, ¿acaso eres el de la profecía ? ");
            harry.lanzarFraseFavorita();
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        }

        System.out.println(" - - - - - Estadísticas de tu increíble batalla - - - - - ");
        Enemigo.mostrarEnemigosDerrotados();
        Jugador.mostrarHechizosLanzados();

    } // Fin del main

} //Fin de la clase
