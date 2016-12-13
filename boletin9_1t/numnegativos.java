package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class numnegativos {
    
public void amosar(){
  
        int num1;
    for(int n =1;n<=10; n++) 
        num1=Integer.parseInt(JOptionPane.showInputDialog("introduce un número"));
    
    if(num1>0)
        System.out.println("O número é positivo");
    else if(num1==0)
        System.out.println("O número é cero");
    else
        System.out.println("O número é negativo");
    
}    

    
}
