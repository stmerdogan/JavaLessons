package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        //1.Sayi uc basamakli ise, sayi uc basamaklidir yazdiralim.

        int num = -123;
        num = Math.abs(num);

        if (num > 99 && num < 1000) {
            System.out.println("Sayi uc basamaklidir");
        }

        //2.Bir String deki tekrarsiz characterleri ekrana yazdiriniz==>abbccdc==>ad

        String str = "aac";

        char ch1 = str.charAt(0);
        if(str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);
        if(str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = str.charAt(2);
        if(str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
    }

}
