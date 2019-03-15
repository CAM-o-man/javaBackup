package hendricks.lab74;

import java.net.URISyntaxException;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import mcdermid.connor.database;

/**
 * @author: Connor McDermid
 * Lab: 7.4
 * Extra: Random questions from question bank
 */
public class Main {
    /**
     * This will serve as the user interface method. All user interaction will occur here.
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        database data = new database();
        Scanner input = new Scanner(System.in);
        File questionBank = new File("questionBank.txt");
        FileOutputStream appendstream = new FileOutputStream(questionBank, true);
        int score = 0;

        System.out.println("Welcome to Trivial Pursuit!");
        System.out.println("You will be asked 5 multiple-choice questions.");
        System.out.println("You will have 60 seconds to answer them all.");
        System.out.println("Ready? [Y|N]");
        String ready = input.nextLine();
        if (ready.equalsIgnoreCase("Y")) {
            System.out.println("Executing.");
        } else {
            System.exit(0);
        }
        Thread.sleep(1000);
        System.out.println(3);
        Thread.sleep(1000);
        System.out.println(2);
        Thread.sleep(1000);
        System.out.println(1);
        Thread.sleep(1000);
        System.out.println("Here we go!");
        String[] questions = pickQuestion(questionBank);
        //____________________________________________________________________________________
        String correctAnswer;
        String userAnswer;
        long start = System.currentTimeMillis();
        long end = start + (60 * 1000);
        int questionsAttempted = 0;
        while (System.currentTimeMillis() < end && questionsAttempted < 5) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(questions[i].substring(0, questions[i].indexOf('|')));
                    correctAnswer = questions[i].substring(questions[i].indexOf('|') + 1);
                    userAnswer = input.nextLine().toUpperCase();
                } catch (StringIndexOutOfBoundsException e) {
                    e.printStackTrace();
                    i--;
                    continue;
                }
                if (userAnswer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                    score++;
                    questionsAttempted++;
                } else {
                    System.out.println("Sorry, the correct answer was " + correctAnswer);
                    questionsAttempted++;
                }
            }
            System.out.println("That's all the questions! Your score was " + score + " out of 5!");
            System.out.println("Would you like to see the source of all trivia questions here? [Y|N]");
            String user = input.nextLine();
            if (user.equalsIgnoreCase("Y")) {
                data.navWeb("https://chartcons.com/100-good-trivia-questions-and-answers/");
            } else {
                System.exit(0);
            }
        }
    }
    /**
     * This file will read our question bank and generate a list of all questions.
     */
    private static ArrayList<String> getQuestion(File file) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        ArrayList<String> questions = new ArrayList<String>();
        boolean lines;
        String temp;
        do {
            temp = reader.readLine();
            if (temp != null) {
                lines = true;
                questions.add(temp);

            } else {
                lines = false;
            }
        } while(lines);

        return questions;
    }
    /**
     * This file will receive a list of all questions and pick 5.
     * No questions will be repeated.
     */
    private static String[] pickQuestion(File file) throws IOException {

        ArrayList<String> list = getQuestion(file);
        int insurance;
        String[] questions = new String[5];
        for (int i = 0; i < 5; i++) {
            insurance = ThreadLocalRandom.current().nextInt(0, 24);
            try {
                questions[i] = list.get(insurance);
            } catch (IndexOutOfBoundsException e) {
                i--; //Our array must always be fully populated.
                continue;
            }
            list.remove(insurance);

        }
        return questions;
    }
}
