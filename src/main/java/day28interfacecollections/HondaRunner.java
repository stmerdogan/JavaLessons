package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic = new Civic();
        myCivic.cool();//Civic mukemmel bir sekilde sogutur
        myCivic.run();//Ac runs super
        myCivic.eco();//Uses gas less

        Engine.stop();//Stops securely

        Accord myAccord = new Accord();
        myAccord.cool();//Accord cools super
        myAccord.run();//Engine runs super

        System.out.println("AC PRICE : " + Ac.price);//2000
        System.out.println("ENGINE PRICE : " + Engine.price);//3000
        System.out.println("SECURITY PRICE : " + Security.price);//5000


    }

}
