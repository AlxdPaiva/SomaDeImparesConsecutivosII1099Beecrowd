/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadeimparesconsecutivosii1099beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class SomaDeImparesConsecutivosII1099Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        
        int c = 0;
        int X;
        int Y;
        
        
        while(c <= N-1){
            
            X = teclado.nextInt();
            Y = teclado.nextInt();
            int soma = 0;
            
            if (X > Y) {
                int temp = X;
                X = Y;
                Y = temp;
            }
            
            for (int i = X+1; i < Y; i++){                
                if (i % 2 != 0) {                    
                    soma += i;                    
                }                
            }
            
            System.out.println(soma);
            
            c++;
        }
        
        
    }
    
}
