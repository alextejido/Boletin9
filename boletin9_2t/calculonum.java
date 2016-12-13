package boletin9_2;

/**
 *
 * @author atejidosolla
 */
public class calculonum {
    
    public void amosar(){
        
        int acusuma=0;
        double acumul=1;
        
       for(int num= 10; num<=90; num++){
           
           acusuma= num+acusuma;
          
           acumul= num*acumul;
           
       }                 
         System.out.println("Suma: "+acusuma);
        System.out.println("Producto: "+acumul);
    
}
    
}
