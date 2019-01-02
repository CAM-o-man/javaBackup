/*
 Connor McDermid, block A1
 */
package howtallareyou;
import java.util.Scanner;
public class Howtallareyou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How tall are you, in integer inches?");
        
        int inch = input.nextInt();
        
        int feet = inch/12;
        
        int leftover = inch%12;
        
        int metres = feet/3;
        
        System.out.println("You are " + feet + "'" + leftover + " or roughly " + metres + " metres.");
        
        
        
    }
    
}
