package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Series {
    
      public void serieA(){  
        int num = Integer.parseInt(JOptionPane.showInputDialog("Serie A:"));
        int num2 =0;
      
        for(int i=0; i<num; i++){
            System.out.print( (num2+=2) + ", ");
                    }
      }
       public void serieB(){
           
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Serie B:"));
        int cont =0;
        
        for(int i=1; i<=num3; i++){
            if(cont==0){
            System.out.print( "+"+i+", " );
            cont++;
            }
            else if(cont==1){
                System.out.print(-i+", ");
                cont--;
                    }
                }
       }

            
           public void serieC(){
           
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Serie C:"));
        int num5 = 0;
       int num6= 1;
       int num7= 0;
            for(int i=0; i<=num4; i++){
            System.out.print(num5 + ", ");
            num5 = num5+num6;
            num7=num5-num6;
            num6 = num7;
                    }
    }
    
}
