package org.example.BT2;

import java.util.Scanner;

public class DoanThang {
	private Diem a, b;

	public static void main(String[] args) {
		DoanThang line = DoanThang.createDoanThang();
		System.out.println("Doan thang: " + line.toString());
		System.out.printf("Do dai doan thang: %.2f\n", line.calculateLength());
		System.out.println("Trung diem cua doan thang: " + line.findMidpoint().toString());
	}

	@Override
	public String toString() {
		return "[" + a.toString() + ", " + b.toString() + "]";
	}

	public double calculateLength() {
		return a.calculateDistance(b);
	}

	public Diem findMidpoint() {
		Diem midpoint = new Diem((a.getX() + b.getX()) / 2, (a.getY() + b.getY()) / 2);
		return midpoint;
	}

	public static DoanThang createDoanThang() {
		Diem a = Diem.createDiem();
		Diem b = Diem.createDiem();
		DoanThang line = new DoanThang(a, b);
		return line;
	}

	public DoanThang(Diem a, Diem b) {
		this.a = a;
		this.b = b;
	}

	public Diem getA() {
		return a;
	}

	public void setA(Diem a) {
		this.a = a;
	}

	public Diem getB() {
		return b;
	}

	public void setB(Diem b) {
		this.b = b;
	}
}
