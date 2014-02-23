/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CalidadSoftware;

/**
 *
 * @author Noemi
 */
import java.util.*;
import CalidadSoftware.Persona;

public class CedulaComparator implements Comparator {

   public int compare(Object o1, Object o2){
   
   //Se asignan referencias (Persona) a los dos nombres de los objetos p1 y p2
   Persona p1 = (Persona) o1;
   Persona p2 = (Persona) o2;
   
   //El metodo compare realiza comparaciones entre la llamada a cada una de las cedulas
   return p1.getCedula().compareTo(p2.getCedula());
   
   
   }
    public boolean equals(Object o) {
    return this == o;
  }
    
    
}