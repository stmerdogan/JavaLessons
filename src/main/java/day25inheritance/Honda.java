package day25inheritance;

public class Honda extends Car {
    public Honda() {
        super();
        System.out.println("Honda 1");
    }

    public Honda(String model, int year) {
        System.out.println("this.model = " + this.model);
        System.out.println("this.km = " + this.km);
        System.out.println("super.km = " + super.km);
        System.out.println("super.model = " + super.model);
        System.out.println("Honda 2");
    }
    public String model="Civic";
    public int km = 10000;
}