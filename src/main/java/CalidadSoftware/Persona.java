package CalidadSoftware;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noemi
 */
import java.io.*;
public class Persona implements Serializable {/*Serializacion: es una tecnica para convertir cualquier objeto en un flujo de bit de 0  y  1 para que sea guarda en un 
archivo  */

  private String cedula;
  private String nombre;
  private int edad;
  
  
  public String getCedula(){
  	return cedula;
  }
  
  
  public String getNombre(){
  	return nombre;
  }
  
  
  public int getEdad(){
  	return edad;
  }
  
  public void setCedula(String cedula){
  	this.cedula=cedula;
  }
    
    
    
  public void setNombre(String nombre){
  	this.nombre=nombre;
  }
  
  
  public void setEdad(int edad){
  	this.edad=edad;
  }
  
  
  public String toString(){
  	
  	return "\n\t Cedula = " + cedula + "\n" +"\t Nombre = " + nombre + "\n" +"\t Edad = " + edad +"\n-----------------------------\n";
  	       	
  }
  
}
