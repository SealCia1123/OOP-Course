package org.example.BT2;

import java.util.UUID;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CauHoi {
    public static final String questionDirectory = "src/main/resources/cauhoi/";
    private String pathToFile;

    public boolean isCorrectAnswer() {
        File f = new File(this.getPathToFile());
        String userAnswer = this.getAnswer();
        String correctAnswer = "";
        try (Scanner reader = new Scanner(f)) {
            while (reader.hasNext()) {
                correctAnswer = reader.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return userAnswer.equals(correctAnswer);
    }

    private String getAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon dap an: ");
        return sc.nextLine().toUpperCase().substring(0, 1);
    }

    public void printQuestion() {
        File f = new File(this.getPathToFile());
        try (Scanner reader = new Scanner(f)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cau hoi: " + reader.nextLine());
            for (char i = 'A'; i <= 'D'; i++) {
                System.out.println(i + ": " + reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public CauHoi() {
        UUID uuid = UUID.randomUUID();
        this.setPathToFile(questionDirectory + uuid.toString() + ".txt");
        File f = new File(this.getPathToFile());
        try (PrintWriter writer = new PrintWriter(f)) {
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
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        }
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }
}
