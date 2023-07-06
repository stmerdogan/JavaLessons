package day10ifstatementsNestedIf;

import day20statickeywordconstructors.Student;

import java.util.Scanner;

public class IfStatements01 {

    public static void main(String[] args) {

        //Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Pozitiftir");
        } else if (num < 0) {
            System.out.println("Negatiftir");
        } else {
            System.out.println("Notr");
            input.close();
        }
    }
}
