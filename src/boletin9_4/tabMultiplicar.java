/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class tabMultiplicar {
    
    public void amosarTabla(){
        
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        while(num!=0){
        for(int i = 1; i<10 ;i++ )
            System.out.println(+i+"*"+num+" = "+i*num);
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));    
                
        
       }    
    }
    
    
}

    

