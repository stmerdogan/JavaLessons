package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //1.Kullanicidan alinan bir sayinin tek mi cift mi oldugunu konsola yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        //1.yol
        if(num%2==0){
            System.out.println("Cift sayidir");
        }

        if(num%2!=0){
            System.out.println("Tek sayidir");
        }

        //2.yol ; kontrol edilen condition sayisi az oldugundan dolayi tavsiye edilir.
        if(num%2==0){
            System.out.println("Cift sayidir");

        }else{
            System.out.println("Tek sayidir");
            input.close();
        }
    }
}
