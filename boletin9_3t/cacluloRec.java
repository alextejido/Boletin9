package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class cacluloRec {
    
    float base;
    float altura;
    
 public void amosarRec(){   
    
     do{
     base=Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
     altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
     }while(base<0 | altura<0);
             
      System.out.println("El área es: "+base*altura);
     
                 
    
 }
    
}
