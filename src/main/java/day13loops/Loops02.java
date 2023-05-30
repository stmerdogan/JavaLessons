package day13loops;
public class Loops02 {
    public static void main(String[] args) {

        //Ornek 1-) 21 den 180 e kadar hem 2 hem de 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 21; i < 181; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        //Ornek 2-) Size verilen kucuk harfle yazilmis Stringi index i cift olan characterleri buyuk harfle yaziniz..Ankara=>AKR

        String s = "ankara";//i<=s.length()-1===>5

        for (int i = 0; i < s.length(); i++) {//i<s.length()==>tavsiye edilir
            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());
            }
        }

        //Ornek 3-) Size verilen bir String de ilk a harfinden onceki tum characterleri consola yazdiriniz
        //"I love Java"===>"I love J"

        String s1 = "Tramway";

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == 'a') {
                break;
            }
            System.out.print(s1.charAt(i));
        }


        //Ornek 4-) Size verilen bir String de son a harfinden sonraki tum characterleri ters sirada consola yazdiriniz

        String t = "Germany";
        for (int i = t.length() - 1; i >=0 ; i--) {
            if(t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }
    }
}
