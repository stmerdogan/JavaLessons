package homeworks;

import java.util.Arrays;
import java.util.HashMap;

public class Homework07 {
    public static void main(String[] args) {

        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String m = "Hello Henry!";
        m = m.replaceAll("[^a-zA-Z]", "");
        System.out.println(m);
        String[] idx = m.split("");
        System.out.println(Arrays.toString(idx));//[H, e, l, l, o, H, e, n, r, y
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : idx) {
            Integer numberOfLetters = map.get(w);
            if (numberOfLetters == null) {
                map.put(w, 1);
            } else {
                map.put(w, numberOfLetters + 1);

            }
        }System.out.println(map);//{r=1, e=2, H=2, y=1, l=2, n=1, o=1
    }
}