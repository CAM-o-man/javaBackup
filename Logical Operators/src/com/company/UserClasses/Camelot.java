/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camelot;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
/**
 *
 * @author Connor McDermid
 * @block 1A
 * @assignment 2.2
 */
public class Camelot {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * Required to throw InterruptedException due to Thread.sleep
     * @throws java.net.URISyntaxException
     * @throws java.io.IOException
     * 
     * Both of those are for Caption()
     */
    public static void main(String[] args) /*throws IOException,*/ throws InterruptedException, URISyntaxException, IOException {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input your last name.");
        String lName =  input.nextLine();
        lName += "@camelot.com";
        System.out.println(lName);
        
        Thread.sleep(2000);
        
        rudimentaryCLS();
        
        roundTable();
        
        address();
        
        Pendragon();
        
        Caption();
        
        //clearScreen();
    }
    public static void clearScreen() throws IOException, InterruptedException {
        final String OS = System.getProperty("os.name");
        for(int i = 1; i != 1; i++){
            if( OS.equals("Windows")) {
                Runtime.getRuntime().exec("cmd");
                Runtime.getRuntime().exec("java -jar C:/Users/cam-o/Documents/NetBeansProjects/Camelot/dist/Camelot.jar");
            
            }
        }
        Runtime.getRuntime().exec("cls");
    }
    public static void rudimentaryCLS() {
        //This function should wipe the screen because I can no longer stand it.
        //There are better ways to do it, but NetBeans apparently doesn't like ANSI escape codes, so this is how it is.
        //I'll use Thread.sleep so the screen isn't wiped too quickly, and that'll throw InterruptedException every time.
        System.out.println("\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n");
    }
    public static void roundTable() throws InterruptedException {
        String person = "King Arthur";
        //person.append("Guinivere"); Find a way to append strings. 
        person += " Guinivere";
        
        System.out.println(person);
        
        Thread.sleep(2000);
        
        rudimentaryCLS();
        
    }
    
    public static void address() throws InterruptedException {
        System.out.println("Enter your name, street, city, state, and zip code below.");
        
        Scanner input = new Scanner(System.in);
        
        String address = input.nextLine();
        
        String Namecheck;
        
        Namecheck = address.substring(address.indexOf(","), address.length());
        System.out.println("Namecheck defined");
        
        
        String Streetcheck;
        
        Streetcheck = Namecheck.substring( Namecheck.indexOf(" "), Namecheck.length());
        System.out.println(Streetcheck);
        System.out.println("Streetcheck defined");
        
        String City;
        
        City = Streetcheck.substring(Streetcheck.indexOf(","), Streetcheck.indexOf(","));
        System.out.println("City defined");
        System.out.println(City);
        System.out.println("The city you live in has " + (City.length() - 1) + " characters");
        
        Thread.sleep(2000);
        
        rudimentaryCLS();
    }
    public static void Pendragon() throws InterruptedException{
        String Father = "Pendragon, Uther";
        
        String FatherLast = Father.substring(0, Father.indexOf(","));
        
        String FatherFirst = Father.substring(Father.indexOf(","));
        
        System.out.println("King Arthur's father's name is " + FatherFirst + " " + FatherLast);
        
        Thread.sleep(2000);
        
        rudimentaryCLS();
    }
    public static void Caption() throws InterruptedException, URISyntaxException, IOException {
        Scanner input = new Scanner(System.in);
        
        Desktop d = Desktop.getDesktop();
        
        System.out.println("Enter a caption for this picture: ");
        Thread.sleep(1000);
        d.browse(new URI("https://classroom.google.com/u/1/c/MTc2MjIyNTcxNjNa/a/MTc4ODEyNTc5MzVa/details"));
        
        String capt = input.nextLine();
        
        System.out.println(capt + " " + capt.length() + " " + capt.substring(3, 4));
    }
}