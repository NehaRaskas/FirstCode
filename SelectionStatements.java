package org.apache.maven;

public class SelectionStatements {
    public static void main(String args[])
    {
        // if, switch , ternary operator..these are few selection statements

        //if , if else, else if , nested if else statements
        int n = 7;// given input as even or odd
        if(n==0) {
            System.out.println("Nothing");
            System.out.println("Bye");
        }
        else if(n%2==0) {
            System.out.println("Even");
        }
            else {
            System.out.println("Odd");
        }

        // ternary operator
            int i= 5;
            int j=0;
//            if(i >6)
//                j=1;
//            else
//                j=2;
            j = i>6?1:2; //the if else statement given can be written in one line
            System.out.println(j);

        // switch statement
        int a = 5;//using if else statement

        if(a==1)
        System.out.println("One");
        else if(a==2)
        System.out.println("Two");
        else if(a==3)
        System.out.println("Three");
        else if(a==4)
        System.out.println("Four");
        else if(a==5)
        System.out.println("Five");

        int b = 3;//using switch statement

        switch(b) {
            case 1:
            System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            case 4:
                System.out.println("Four");
            case 5:
                System.out.println("Five");
                //if we write code in this manner switch will continue

        }
                String c = "C";
                //using switch statement with break

                switch(c) {
                    // switch supports byte,short,int,char
                    // switch doesn't support long,float,double,String(for version above java 1.8);
                    case "A":
                        System.out.println("One");
                        break;
                    case "B":
                        System.out.println("Two");
                        break;
                    case "C":
                        System.out.println("Three");
                        break;
                    case "D":
                        System.out.println("Four");
                        break;
                    case "E":
                        System.out.println("Five");
                        break;
                    default:
                        //default is used for values which does not have case in switch block
                        System.out.println("No Match");
                }
    }
}
