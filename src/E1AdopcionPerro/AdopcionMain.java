/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase. 
Persona con atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package E1AdopcionPerro;

/**
 *
 * @author AlejaDevelops
 */
public class AdopcionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Bruno","Dalmata",1.5,"mediano");
        Persona p1 = new Persona("Aleja", "Orjuela",37,1088236726,perro1);
        
        Perro perro2 = new Perro("Drack","Fila", 0.5,"grande");
        Persona p2 = new Persona("Juan","Rios",35,1087998037,perro2);
        
        System.out.println("Persona 1 "
                + "\n Nombre: "+p1.getNombreP()
                + "\n Apellido: "+p1.getApellido()
                + "\n Edad: "+p1.getEdadP()
                + "\n Documento: "+p1.getDocumento()
                + "\n Perro: "+p1.getPerro().toString());
        System.out.println("");
        System.out.println("Persona 2 "
                + "\n Nombre: "+p2.getNombreP()
                + "\n Apellido: "+p2.getApellido()
                + "\n Edad: "+p2.getEdadP()
                + "\n Documento: "+p2.getDocumento()
                + "\n Perro: "+p2.getPerro().toString());
        
    }
    
}
