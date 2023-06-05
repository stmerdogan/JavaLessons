package homeworks;

public class Homework03 {

    public static void main(String[] args) {
        //Create a method that find a circle's perimeter.
        double num3 = 3.14;
        double num4 = 5;
        circlePerimeter(num3, num4);

        //Create a method that find a circle's square.
        double num1 = 3.14;
        double num2 = 5;
        circleArea(num1, num2);
    }

    private static void circlePerimeter(double num3, double num4) {
        System.out.println(2 * num3 * num4);
    }

    private static void circleArea(double num1, double num2) {
        System.out.println(num1 * (num2 * num2));
    }

}
