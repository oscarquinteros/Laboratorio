
package javaapplication9;

import java.util.ArrayList;
import java.util.LinkedList;


public class JavaApplication9 {

    public static void main(String[] args) {
        
        ArrayList<Persona> lista = new ArrayList<Persona>();
        
        LinkedList lista2 = new LinkedList();
        Persona p1 =new Persona("Juan");
        lista.add(p1);
        lista.add(new Persona("Pedro"));
        for (Persona object : lista) {
            System.out.println(object);
        }        
        lista.remove(p1);
        System.out.println("Despues de remover:");
        for (Persona object : lista) {
            System.out.println(object);
        }        
        
        
        
        
    }
    
}
