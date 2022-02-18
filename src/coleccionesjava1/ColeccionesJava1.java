
package coleccionesjava1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ColeccionesJava1 {

    public static void main(String[] args) {
        //EJERCICIO 1:
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> raza = new ArrayList();
        String option = " ";
        do {
            System.out.println("Ingrese raza de perro");
            raza.add(leer.next());
            System.out.println("Desea agregar otra raza S/N");
            option = leer.next();
        } while (!option.equalsIgnoreCase("N"));
        
        for (String aux : raza) {
            System.out.println(aux);
        }
        System.out.println("La cantidad de razas ingresadas es: "+raza.size());
        
        
        //EJERCICIO 2:
        System.out.println("Ingrese otra raza por favor:");
        String otra= leer.next();
        Iterator <String> it = raza.iterator();        
        int contador = 0;
        while (it.hasNext()) { //recorremos con el iterator la lista de la raza
            if (it.next().equals(otra)) { // Borramos si está la raza ingresada al final
                 it.remove();
                 contador++; 
            }   
        }
        if (contador == 0){  //si el contador siguio en 0, entonces no se encontro la raza ingresada en la lista
                System.out.println("No se encontro esa raza!");
            }
        Collections.sort(raza); //ordenamos la lista de la raza de perros por orden alfabetico
        for (String aux : raza) {
            System.out.println(aux); //mostramos como quedo la lista ordenada y con la raza eliminada si es que se encontro
        }
        System.out.println("Gracias por su colaboracion!");
    }
}