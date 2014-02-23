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

//declaracion de clase NombreComparator1 implementa de comparator 
public class NombreComparator1 implements Comparator {

       public int compare(Object o1, Object o2){
   
   Persona p1 = (Persona) o1;
   Persona p2 = (Persona) o2;
   return p1.getNombre().compareTo(p2.getNombre());
   
   
   }
   //Compara el objeto o con el entero actual y devuelve true si son iguales
    public boolean equals(Object o) {
    return this == o;
  }
}