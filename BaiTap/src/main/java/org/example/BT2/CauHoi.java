package org.example.BT2;

import java.util.UUID;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CauHoi {
    public static final String questionDir = "src/main/resources/cauhoi/";
    private File question;

    public void checkAnswer() throws FileNotFoundException {
        String userAnswer = this.getAnswer();
        String correctAnswer = "";
        try (Scanner reader = new Scanner(this.getQuestion())) {
            while (reader.hasNext()) {
                correctAnswer = reader.nextLine();
            }
        }
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Tra loi dung!");
        } else {
            System.out.println("Tra loi sai! --> Dap an: " + correctAnswer);
        }
    }

    private String getAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon dap an: ");
        return sc.nextLine().toUpperCase().substring(0, 1);
    }

    public void printQuestion() throws FileNotFoundException {
        try (Scanner reader = new Scanner(this.getQuestion())) {
            System.out.println("Cau hoi: " + reader.nextLine());
            for (char i = 'A'; i <= 'D'; i++) {
                System.out.println(i + ": " + reader.nextLine());
            }
        }
    }

    public CauHoi(File f) {
        this.setQuestion(f);
    }

    public CauHoi() throws FileNotFoundException {
        UUID uuid = UUID.randomUUID();
        this.question = new File(questionDir + uuid.toString() + ".txt");
        try (PrintWriter writer = new PrintWriter(this.getQuestion())) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap cau hoi: ");
            String question = sc.nextLine();
            writer.println(question);

            for (char i = 'A'; i <= 'D'; i++) {
                System.out.print("Nhap dap an " + i + ": ");
                String answer = sc.nextLine();
                writer.println(answer);
            }
            System.out.print("Nhap dap an dung: ");
            String answer = sc.nextLine();
            writer.print(answer);
        }
    }

    public File getQuestion() {
        return question;
    }

    public void setQuestion(File question) {
        this.question = question;
    }
}
