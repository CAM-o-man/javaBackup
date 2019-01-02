package com.company;
        import java.io.IOException;
        import java.util.Scanner;
        import java.awt.Desktop;
        import java.net.URI;
        import java.net.URISyntaxException;
        import java.io.IOException;
public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("HALT! This is a password-protected program. Please input your password.");
        String password = "fortheemperor";
        String userpass = input.nextLine();
        input.nextLine();
        if (userpass.equals(password)) {
            System.out.println("OK, you're verified.");
        }
        else {
            System.out.println("That password is incorrect! Would you like to reset it?");
            System.out.println("Y/N");
            String usrchoice = input.nextLine();
            input.nextLine();
            if (usrchoice.equals("Y")) {
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("connor.mcdermid@mcvts.org?subject=Password%20Reset&body=Your%20password%20has%20been%20reset%20to%20'fortheemperor'"));

            }
            else {
                System.out.println("Leave then.");
                System.exit(0);
            }
        }
        Movie();
        TV();
    }
    public static void Movie() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = input.nextLine();
        input.nextLine();
        System.out.println("Please enter your age.");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Welcome to the movie! We know you lied about your age, but we don't care!");
        }
        else {
            System.out.println("You are underage, " + name + ". This movie is rated R. Security will escort you away.");
        }
    }
    public static void TV() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your favourite cable channel.");
        int channelnum = input.nextInt();
        switch (channelnum) {
            case 2:
                System.out.println("Channel 2 got top ratings last week!");
                break;
            case 4:
                System.out.println("Channel 4 shows primarily news!");
                break;
            case 6:
                System.out.println("Channel 6 shows old movies!");
                break;
            case 8:
                System.out.println("Channel 8 covers local events!");
                break;
            case 11:
                System.out.println("Channel 11 is public broadcasting!");
                break;
            default:
                System.out.println("Yeah, no, that's not a channel.");

        }
    }
}
