package day01variables;

public class Variables01 {
    public static void main(String[] args) {

        // Java doesn't read this line,this is an explanation for us
        /*
        Java also doesn't read these lines.
         */
        //Variables:Reserved areas.But how can we create variables?

        //Data types    +   variables names     +       Assignment operator    +    variables   values  +   semicolons

        int age = 13;
        System.out.println(age);


        //Statements=java  sentences
        //When we are writing a normal sentence we put a full stop at the end of the sentence;
        //but in java we put semicolons at the end of a statement
        //if you make a declaration but don't make an assignment, java puts its own default value: '0'
        //when java sees  '=' assignment operator, first it starts with right wing.
        //Then it puts the value in the variable box in the left.
        //Data types    +   VariableName====>  Variable Declaration.
        //Assignment operator  (=)  +  Variable value===> Assignment.


        //DATA TYPES:We have two types  of data types in JAVA.
        // 1.PRIMITIVE DATA TYPES
        // char,boolean,byte,short,int,long,float,double

        //char data type:It is used for single characters.Number,symbols,letters etc
        //Example:A,x,4,?,
        // Example2:In char data type create a name variable with the first letter of the name.

        char firstLetter = 'A';
        System.out.println(firstLetter);
        //Note: We put all values in char data type in single quotes.

        //boolean data type:They can take only two different values.True or False
        //Example3:In boolean data type write a variable 'isRetired' and give false value

        boolean isRetired = false;
        System.out.println(isRetired);

        //byte data type:It is used for numbers.It reserves 1 byte in memory.
        //They start from -128 to -127.It is an integer number not decimal.
        //Example4:In byte data type write a variable 'studentAge' and then assign  a value.

        byte studentAge = 27;
        System.out.println(studentAge);

        //short data type:It is used for numbers.It reserves 2 bytes in memory.
        //They start from -32768 to -32767.It is an integer number not decimal.
        //Example5:In short data type write a variable 'sitePopulation' and then assign  a value.

        short sitePopulation = 1550;
        System.out.println(sitePopulation);

        //int data type:It is used for numbers.It reserves 4 bytes in memory.
        //They start from -2147483648 to -2147483647.It is an integer number not decimal.
        //Example6:In int data type write a variable 'countryPopulation' and then assign  a value.

        int countryPopulation = 1313131313;
        System.out.println(countryPopulation);

        //long data type:It is used for numbers.It reserves 8 bytes in memory.
        //They start from -9223372036854775808 to -9223372036854775807.It is an integer number not decimal.
        //It is advised to put 'L' at the end of Long value if the value is between integer values.
        //Example7:In long data type write a variable 'numberOfCell' and then assign  a value.

        long numberOfCell = 92233720368547L;
        System.out.println(numberOfCell);

        //float data type:It is used for decimal numbers.It reserves 4 bytes in memory.
        //They start from -3.4028234663852886E38 to -3.4028234663852886E38.It is a decimal number.
        //Java accepts decimal numbers automatically double.
        //Example8:In float data type write a variable 'shirtPrice'  then assign  a value.

        float shirtPrice = 12.99f;
        System.out.println(shirtPrice);

        //double data type:It is used for decimal numbers.It reserves 8 bytes in memory.
        //They start from -1.7976931348623157E308 to -1.7976931348623157E308.It is a decimal number.
        //Example9:In double data type write a variable 'weightOfCell' and then assign  a value.

        double weightOfCell = 0.000000000000000000000000000113;
        System.out.println(weightOfCell);

        //More examples

        byte note1 = 70;
        byte note2 = 85;
        System.out.println(note1 + note2);

        //2.NON-PRIMITIVE DATA TYPES
        //String,array,Float
        //Example:Create a variable and assign Ali Can to it.

        String studentName = "Ali Can";
        System.out.println(studentName);

        //All values given to a String should be in double quotes.
        //Default value for a String is null.
        //null doesn't mean zero.It means that there is neither variable nor method in a String.

    }
}
