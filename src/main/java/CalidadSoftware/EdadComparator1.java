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

public class EdadComparator1 implements Comparator {

    public int compare(Object o1, Object o2){
   
   Persona p1 = (Persona) o1;
   Persona p2 = (Persona) o2;
   
   return p1.getEdad() - p2.getEdad();
   
   
   }
    public boolean equals(Object o) {
    return this == o;
  }
    
    
}