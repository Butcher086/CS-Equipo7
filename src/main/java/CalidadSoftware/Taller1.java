/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CalidadSoftware;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
import CalidadSoftware.Persona;
import CalidadSoftware.EdadComparator1;
import CalidadSoftware.NombreComparator1;
import CalidadSoftware.CedulaComparator;

/**
 *
 * @author Noemi
 */
public class Taller1 {


private List <String>lista=new LinkedList <String>();
private List <Persona>listapersona=new LinkedList<Persona>();


public static void main (String arg[]){
	   	
    	Taller1 t=new Taller1();
    	t.init();
    	
    	
    }	
   private void init(){
   	lista.add("Ana");
   	lista.add("Andrea");
   	lista.add("Adrian");
   	lista.add("Alfonso");
   	lista.add("Jose");
   	
   	System.out.println(lista);
  
   	Collections.sort(lista);//  esta interface collection tiene un metodo sort el cual ordena alfabeticamente u en orden cualquier tipo de valor
   	System.out.println(lista);
   	
   	Persona p1 = new Persona();
   	p1.setCedula("04");
   	p1.setNombre("Juan");
   	p1.setEdad(18);
   	
   
    
    Persona p2 = new Persona();
   	p2.setCedula("100");
   	p2.setNombre("Miguel");
   	p2.setEdad(520);
   	
   
   
   Persona p3 = new Persona();
   	p3.setCedula("02254");
   	p3.setNombre("Carlos");
   	p3.setEdad(01);
   	
   	listapersona.add(p1);
   	listapersona.add(p2);
   	listapersona.add(p3);
   	System.out.println(listapersona);
   	
   	
    
    //Observa que se ordenan en la cedula
    System.out.println("\n y ahora ordenados por Cedula...");
    Collections.sort(listapersona, new CedulaComparator());						
    System.out.print(listapersona);
    
    
   	System.out.println("\n Ahora ordenados por nombre...");
     Collections.sort(listapersona, new NombreComparator1());
    System.out.print(listapersona);
    
    //Observa que se ordenan en la edad
    System.out.println("\n y ahora ordenados por edad...");
    Collections.sort(listapersona, new EdadComparator1());					
    System.out.print(listapersona);
   }    

}

    
