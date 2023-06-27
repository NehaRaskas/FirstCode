package org.apache.maven;

public class ArithematicOperators
{
    /*
     *  Arithmetic +,-,*,/,%
     *  Bitwise
     *  Relational
     *  Logical
     */

    public static void main(String args[])
    {
       int m = 6, n = 4;
       int r = m+n;   //10
       int R = m-n;   //2
       int r1 = m*n;  //24
       double R1 = (double)m/n;  //1.5
       int r2 = m%n;  //2 [it finds the reminder of given numbers]
       System.out.println(r);
       System.out.println(R);
       System.out.println(r1);
       System.out.println(R1);
       System.out.println(r2);

       int p = 4;
       int q = 5;
       q += 3; //q += p; //q = q+p;[all three statements are same]
        q++;//increment operator //q += 1; //q = q+1;[all three statements are same]
        p--;//decrement operator
       System.out.println(q);
        System.out.println(p);

        int a = 8, b = 5;
        //++a;//pre-increment operator // res = 9
        //a++;//post-increment operator // res = 9
        System.out.println(a);
        System.out.println(b);

        b = ++a; //it will increment value of 'a' and then it assign that value to 'b'
        int c = b;
        System.out.println(c);
        System.out.println(a);

        b = a++;//it assign value of 'a' to 'b' and then it will increment value of 'a'
        System.out.println(b);
        System.out.println(a);

        int d = 8, e = 5;
        //--a;//pre-decrement operator
        //a--;//post-decrement operator
        System.out.println(d);
        System.out.println(e);

        e = --d; //it will increment value of 'd' and then it assign that value to 'e'
        int f = e;
        System.out.println(f);
        System.out.println(d);

        e = d--;//it assign value of 'd' to 'e' and then it will increment value of 'd'
        System.out.println(e);
        System.out.println(d);

    }
}