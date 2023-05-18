/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package E2RuletaRusaAguaService;

import E2RuletaRusaAgua.Juego;
import E2RuletaRusaAgua.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class JuegoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Juego llenarJuego(){
        Jugador j = new Jugador();
        ArrayList<Jugador> listaJ = new ArrayList();
        RevolverService rs = new RevolverService();
        Juego juego = new Juego();
        System.out.println("------------------------------");
        System.out.println("*** Registro de jugadores *** ");
        System.out.println("Indica la cantidad de jugadores");
        int n = leer.nextInt();
        if (n<1 && n>6) {
            n=6;
            System.out.println("Número inválido. Se asignarán 6 jugadores");
        }
        
        for (int i = 0; i < n; i++) {
           System.out.println("Ingresa el nombre del jugador");
            j.setNombre(leer.next());
            System.out.println("El número del jugador es "+(i+1));
            j.setId(i+1);
            listaJ.add(j);
        }
        juego.setJugadores(listaJ);
        juego.setR(rs.llenarRevolver());  //Llenado inicial, ocurre solo una vez, al inicio del juego         
        return juego;
    }
    
    public void ronda(){
        
    }
}
