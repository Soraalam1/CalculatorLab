package tgif;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FreestyleFriday {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE); //you type the full name of the datatype to do.MAX_VALUE
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        //Variables are (DataType) identifier (name) = value ;
        //Data types, there are 2 types, primitive and reference types
        //boolean default value is false
        //now starting lab
        //Reference data types are classes, there are wrapper versions of every primitive that start with a capital
        // int is data type, x is variable name, 10 is value, this is a primitive variable
        //Types of variables, Local, Instance, Class/Static, Parameters
        //Local variables must stay within the {}
        //Instance variables are declared inside a class
        //Class/Static variables belong to the class, do not need an instance
        //For now local and parameters are most important
        //constants are variables that are declared final
        System.out.println("Above \n the rim");
        //% = modulus
        //20/3, there are 3
        //Casting is just changing one type to another
        //Widening is auto
        //Narrowing is not auto
        //syntax for narrowing is (smaller datatype)variablename;
        //System.out.println(prints with new line);
        //System.out.print(prints without making new line);
        //Strings are Immutable
        //equals method vs equalsIgnoreCase
        ///System.out.printf() First you give the string you want to format as the first attribute
        System.out.printf("My Name is %s. I was born in %d", "Mike", 1998);
        //String format method, the format() method has you need to store what you need into a variable, then print.
        int age = 22;
        String str = String.format("My age is %d", age);
        System.out.println(str);

        //String Builder, lets you combine strings with .append
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sean ");
        stringBuilder.append("Price");
        System.out.println(stringBuilder);

        //Scanner is here
        Scanner userInput = new Scanner(System.in);

        System.out.println("What's your name?");

        String userName = userInput.nextLine();
        System.out.println("Welcome to Wakanda, " + userName);

        int dogs = 15;
        if (dogs > 10) {
            System.out.println("Let the Dogs Out");
        } else System.out.println("Keep the Dogs In");



        //Loops
        //While Loop
        int x = 1;

        while(x < 6){
            System.out.println("Serve the Customer" + x);
            x++;
        }
        //Do While Loop
        do{
            System.out.println("serving customer number " + x);
            x++;
        }while(x<5);
        String[] rides = {"Tesla", "BMW", "Benz"};

        for(String currentCar : rides);
        //
        for(int p = 1; p < 6; p++) {
            if (p == 4) {
                break;
            }
        }
        String[][] GoalDiggers = {
                {"Black Excellence", "O'l dirty Bastard","1st Lady", "Vanilla Ice", "Davido"},
                {"Biscuit", "DeanDaDream", "SeaBass", "French Onion", "Escobar"},
                {"RubyRed", "Yaaaazzzzzz", "BarryWhite", "AyDon", "Evil Genius"}
        };
        System.out.println(GoalDiggers[1][4]);
    }


}
