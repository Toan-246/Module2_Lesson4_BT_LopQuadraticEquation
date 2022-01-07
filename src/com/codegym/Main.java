package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();

        QuadraticEquation phuongTrinhB2 = new QuadraticEquation(a, b, c);

        if (phuongTrinhB2.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        else if (phuongTrinhB2.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + phuongTrinhB2.getRoot1());
        }
        else {
            System.out.println("Phương trình có 2 nghiệm x1 = " + phuongTrinhB2.getRoot1() + " và x2 = " +phuongTrinhB2.getRoot2());
        }
    }
}
