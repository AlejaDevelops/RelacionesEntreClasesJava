/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package E1AdopcionPerrosService;

import E1AdopcionPerro.Perro;
import E1AdopcionPerro.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Persona> crearPersonas() {
        ArrayList<Persona> listaPersonas = new ArrayList();
        String[] nombresP = {"Juan", "María", "Pedro", "Laura", "Carlos", "Ana", "Luis", "Marta", "Diego", "Sofía"};
        String[] apellidos = {"González", "Rodríguez", "López", "Martínez", "Gómez", "Fernández", "Pérez", "Sánchez", "Torres", "Ramírez"};        
        Random random = new Random();

        for (String string : nombresP) {
            Persona p = new Persona();
            p.setNombreP(nombresP[random.nextInt(apellidos.length)]);
            p.setApellido(apellidos[random.nextInt(apellidos.length)]);
            p.setEdadP(random.nextInt(50) + 18);
            p.setDocumento(random.nextLong());
            listaPersonas.add(p);
        }
        return listaPersonas;
    }

    public void adoptandoPerrito(ArrayList<Persona> personas, ArrayList<Perro> perritos) {

        for (Persona persona : personas) {
            System.out.println("Hola "+persona.getNombreP()+" "+persona.getApellido());
            System.out.println("Esta es la lista de perritos que buscan hogar: " + perritos.toString());
            System.out.println("************");
            System.out.println("Ingresa el nombre del perrito que deseas adoptar ");
            String nombrePerrito = leer.next();
            Iterator<Perro> it = perritos.iterator();
              
            while (it.hasNext()) {
                Perro next = it.next();
                if (next.getNombre().equalsIgnoreCase(nombrePerrito)) {
                    System.out.println("Felicitaciones! Has adoptado a " +next.toString());
                    System.out.println("----------------------------------------");
                    it.remove();
                    break;
                }
            }
            
            
            
            
        }

    }

}
