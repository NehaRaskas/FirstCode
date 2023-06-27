package org.apache.maven;

public class IterationDemo {
    public static void main(String[] args) {

        //while, do while, for, for-each

//       while loop [Infinite Loop]
//        while(true)
//        {
//            System.out.println("Hey!!");//when we write true in while loop then the statement will repeat infinite times.
//        }  //we can click on stop to end infinite loop

//        while loop [Finite Loop]
        int i = 1; // i=5 //Initialization
        while (i <= 5) { //i>=5 //Condition
            System.out.println("Hello");
            i++; //i-- //Increment or Decrement Operator
        }

//        do while loop
        char a = 'A';
        do {
            System.out.println(a + "");
            a++;
        } while (a <= 'E');

        int b = 10;
        do {
            System.out.println("hey!!");
            b--;
        } while (b >= 6);


//        for loop

        for (short s = 1; s <= 5; s++) {
            System.out.println("Hello Jam");
        }
    }
}