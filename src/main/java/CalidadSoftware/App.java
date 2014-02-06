package CalidadSoftware;

import java.util.Scanner;

public class App 
{

public class Combinacion {
        
        private final String VALIDOS= new String("AaBbNnRrVvMm");
        private char [] color = new char [4];
        
        
        public Combinacion(){
            for(int i=0; i< this.color.length; i++) {
                int azar= (int)(Math.random()*6);
                switch (azar){
                       case 0: this.color[i]='A';
                        break;
                       case 1: this.color[i]='B';
                        break;
                       case 2: this.color[i]='N';
                        break;
                       case 3: this.color[i]='R';
                        break;
                       case 4: this.color[i]='V';
                        break;
                       case 5: this.color[i]='M';
                        break;            
                
            }       
        }
     } //DE FORMA ALEATORIA
        public Combinacion(char a, char b, char c, char d){
            String aux = new String();
            aux += a;
            aux += b;
            aux += c;
            aux += d;
            if (VALIDOS.contains(aux)){
                this.color[0]= a;
                this.color[1]= b;
                this.color[2]= c;
                this.color[3]= d;
            }else{
                System.err.println(" No es una combinacion valida");
            }
        }

        public char[] getColor() {
            return color;
        }

  
        public void setColor(char[] color) {
            this.color = color;
        }
        
        
        
        public void generarAleatorio(){
            Combinacion comb = new Combinacion();
            this.color = comb.color;
            
        }
        
        public void generarCombinacion(){
            Scanner in = new Scanner(System.in);
            int contador = 0;
            System.out.println(" Introduzca la combinacion");
            Combinacion comb = new Combinacion();
            String letrax;
            do{
                letrax = in.nextLine();
                if(!VALIDOS.contains(letrax)){
                    System.out.println(" Introduzca color valido");
                }else{
                    char[] aux;
                    aux = letrax.toCharArray();
                    char auc =aux[0];
                    comb.color[contador] = auc; 
                    contador++;
                }
            }while(!(contador == 4));
            this.color = comb.color;
            }
        
        public void mostrar(){
            String aux = new String();
            aux+="["+this.color[0]+",";
            aux+=this.color[1]+",";
            aux+=this.color[2]+",";
            aux+=this.color[3]+"]";
            System.out.println(aux);
        }
       
    }
                   
           
           
   
    public static void main( String[] args )
    {
        Combinacion A;
        Scanner ficha= new Scanner(System.in);
        String clave;
        System.out.println("¿Quiere que la combinacion clave se genere de forma aleatoria?(s/n)");
        clave= ficha.nextLine();
        if (clave.equalsIgnoreCase("s")){
            Combinacion comb = null;
            comb.generarAleatorio();
        }else if (clave.equalsIgnoreCase("n")){
            Combinacion comb = null;
            comb.generarCombinacion();
        }else{
            System.err.println(" Error");
        }    }
}
