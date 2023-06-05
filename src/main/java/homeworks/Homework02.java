package homeworks;

public class Homework02 {

    //1) Create a new method that finds a rectangular's area.
    //2) Create a new method that finds a rectangular's perimeter.
    public static void main(String[] args) {

        int solution = rectangularArea(5, 7);
        System.out.println(solution);//35

        int solution2 = rectangularPerimeter(6, 8);
        System.out.println(solution2);//28

    }

    public static int rectangularArea(int a, int b) {
        return a * b;
    }

    public static int rectangularPerimeter(int a, int b) {
        return 2 * (a + b);
    }


}