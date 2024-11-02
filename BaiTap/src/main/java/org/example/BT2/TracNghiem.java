package org.example.BT2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class TracNghiem {
    public static void main(String[] args) {
        TracNghiem t = new TracNghiem();

        List<String> names = t.getFileNames();
        Random r = new Random();
        int random = r.nextInt(names.size());
        t.printQuestion(names.get(random));
        System.out.println(t.isCorrectAnswer(names.get(random)));
    }

    public boolean isCorrectAnswer(String fileName) {
        File f = new File("src/main/resources/cauhoi/" + fileName);
        String userAnswer = this.getAnswer();
        String correctAnswer = "";
        try (Scanner reader = new Scanner(f)) {
            while (reader.hasNext()) {
                correctAnswer = reader.nextLine();
                System.out.println(correctAnswer);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return userAnswer.equals(correctAnswer);
    }

    public String getAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon dap an: ");
        return sc.nextLine().toUpperCase().substring(0, 1);
    }

    public void printQuestion(String fileName) {
        File f = new File("src/main/resources/cauhoi/" + fileName);
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

    public List<String> getFileNames() {
        File folder = new File("src/main/resources/cauhoi");
        File[] files = folder.listFiles();
        List<String> fileNames = new ArrayList<>();
        for (File i : files) {
            if (i.isFile()) {
                fileNames.add(i.getName());
            }
        }
        return fileNames;
    }

    public void addQuestion() {
        UUID uuid = UUID.randomUUID();
        String fileName = uuid.toString() + ".txt";
        File f = new File("src/main/resources/cauhoi/" + fileName);
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
            System.out.println(e);
        }
    }
}
