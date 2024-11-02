package org.example.BT2;

import org.example.BT2.CauHoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class TracNghiem {
    private List<CauHoi> dsCauHoi = new ArrayList<>();

    public static void main(String[] args) {
        TracNghiem tracNghiem = new TracNghiem();
        tracNghiem.addQuestion();
        tracNghiem.addQuestion();
        for (CauHoi i : tracNghiem.getDsCauHoi()) {
            i.printQuestion();
            System.out.println(i.isCorrectAnswer());
        }
        tracNghiem.getRandomQuestion().printQuestion();
    }

    public CauHoi getRandomQuestion() {
        Random r = new Random();
        return this.getDsCauHoi().get(r.nextInt(this.getDsCauHoi().size()));
    }

    public void addQuestion() {
        CauHoi question = new CauHoi();
        this.getDsCauHoi().add(question);
    }

    public List<CauHoi> getDsCauHoi() {
        return dsCauHoi;
    }

    public void setDsCauHoi(List<CauHoi> dsCauHoi) {
        this.dsCauHoi = dsCauHoi;
    }
}
