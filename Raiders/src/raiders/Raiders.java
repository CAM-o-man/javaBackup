/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiders;
import java.util.Scanner;
/**
 *
 * @author Connor McDermid, block A1
 */
public class Raiders {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("You know that movie Raiders of the Lost Ark? Yeah,"
                + " I don't either. In the opening scenes, Indiana Jones or "
                + "someone like \n"
                + "that takes a golden figurine from some dungeon or other"
                + " place. Guess the weight of that figurine."
                + " In pounds please.");
        
        int pounds = input.nextInt();
        
        int ounces = pounds * 16;
        
        int kilogrammes = pounds / 3;
        
        System.out.println("Although I'm sure you don't care, your answer was"
                + " also " + ounces + " ounces and " 
                + kilogrammes + " kilogrammes.");
        
    }
    
}
