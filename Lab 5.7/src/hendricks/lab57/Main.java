package hendricks.lab57;
import mcdermid.connor.database;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 * Author: Connor McDermid
 * Lab: Hendricks 5.7
 * Extra:  TBD
 */
public class Main {

    public static void main(String[] args) throws Exception{
        database D = new database();
        Scanner input = new Scanner(System.in);
        threeblindmice(); //Part 1
        threeblindmice();
        seehowtheyrun();
        seehowtheyrun();
        System.out.println("They all run after the farmer's wife");

        $(2);
        stalker();
        $(3);
        D.asterisks(); //Not critical to program function
        System.out.println("Please input your grade.");
        study(input.nextInt());
        play();

    }
    public static void threeblindmice() {
        System.out.println("Three blind mice");
    }
    public static void  seehowtheyrun() {
        System.out.println("See how they run");
    }
    //---------------------------------------------------------------------
    //---------------------------------------------------------------------

    public static void $(int x) {
        for (int i = 0; i < x; i++);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    public static void stalker() {
        System.out.println("Connor");
        System.out.println("43 REDACTED Ave.");
        System.out.println("Randolph, NJ");
        System.out.println("07869");
    }

    public static void study(int average) {
        if (average >= 65) {
            System.out.println("You're passing.");
        } else {
            System.out.println("Hook up with a smart classmate and STUDY!");
        }
    }

    //TESTING IN PROGRESS


    public static synchronized void play() throws Exception {
                try {
                    /*
                    File test = new File ("hendricks/lab57/Skyworld.wav");
                    File file = new File("findThis.txt");
                    if (file.createNewFile()) {
                        System.out.println("File creation complete. Go look for it.");
                        System.out.println(file.getAbsolutePath());
                    }
                    else {
                        System.out.println("There is dark magic preventing you from completing this task. GIve up now.");
                        System.out.println(file.getAbsolutePath());
                    }
                    */
                    //if (test.exists()) {
                    /*
                        Clip clip = AudioSystem.getClip();
                        AudioInputStream inputStream = AudioSystem.getAudioInputStream(Objects.requireNonNull(Main.class.getClass().getClassLoader().getResourceAsStream("/hendricks/lab57/Skyworld.wav")));
                        clip.open(inputStream);
                        clip.start();
                        */
                    //}
                    //else {
                        //System.out.println("File does not exist.");
                        //System.out.println("Clearly at this point it is a problem with the pathname.");
                        /*File file = new File("findThis.txt");
                        if (file.createNewFile()) {
                            System.out.println("File creation complete. Go look for it.");
                            System.out.println(file.getAbsolutePath());
                        }
                        else {
                            System.out.println("There is dark magic preventing you from completing this task. GIve up now.");
                            System.out.println(file.getAbsolutePath());
                        }*/

                    //}

                } catch (Exception e) {
                    System.out.println("Main.play");
                    e.printStackTrace();
                    System.err.println(e.getMessage());
                    //System.exit(-7);
                }
    }
}
