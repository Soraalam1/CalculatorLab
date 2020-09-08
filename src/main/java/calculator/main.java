package calculator;
public class main{
    //create static methods
    //static means it runs automatically
    //methods must have access modifier | return data type | methodName(parameter){
    static double display = 600; //default value is 0 when you don't define the double? YES
    public static double clear(){
        return display = 0;
    }
    public static double add(double input){
        //also could write display = display + input;
        return display = display + input;
        //+= just a shortcut for something = something1 + something2
    }
    public static double subtract(double input){
        return display -= input;
    }
    public static double multiply(double input){
        return display = display * input;
        //     new overwrite display = what display was * input
    }
    public static double divide(double input){
        return display = display/input;
    }
    public static double squared(){
        return display = Math.pow(display, 2);
    }
    public static double root(){
        return display = Math.sqrt(display);
    }
    public static double power(double input) {
        return display = Math.pow(display,input);
    }
    public static double inverse(){
        return display = 1 / display;
    }


    public static double flip()
    {
        return display = display * -1;
    }


    public static void main(String[] args){
        //use or "invoke" the method in here
        System.out.println("Our Starting Display = " + display);
        System.out.println("We need to [CLEAR] the Display = " + clear());
        System.out.println("0 + 1000 = " + add(100.0));
        System.out.println("100 - 3 = " + subtract(3.0));
        System.out.println("97 * 5 - " + multiply(5));
        System.out.println("485 / 5 = " + divide(5));
        System.out.println("97 squared = " + squared());
        System.out.println("Square Root of 9409 = " + root());
        System.out.println("97^3 = " + power(3));
        System.out.println("Let's reset the display " + clear());
        System.out.println("Add a simple number like 1000 + 0 = " + add(1000));
        System.out.println("The inverse of 1000 = " + inverse());
        System.out.println("Let's change the positive number to a negative now = " + flip());
        }
}
