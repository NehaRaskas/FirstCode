package org.apache.maven;

public class FirstCode {
    public static void main(String args[]){

        System.out.println("Hello World");

        //Primitive Data Types
        int a = 5;
        int Z = 6+1;
        //int 123 = 5;(it gives a syntax error becoz numbers can't be a variable)
        int xyz = 4;
        int XYZ = 4-1;
        int $p = 1;
        int p$ = 2;
        int $p$ = 3;
        int $$p = 4;
        int p$$ = 5;
        int _q = 5;
        int q_ = 4;
        int _q_ = 3;
        int __q = 2;
        int q__ = 1;
        int $abc_ = 7;
        int $$abc__ = 7;
        int $_abc_$ = 7;
        int __abc$$ = 7;
        int _$abc$_ = 7;
        int $$ = 1;
        int __ = 2;
        int _$ = 3;
        int $_ = 4;
        int $123_ = 4;
        int $a2_ = 4;
        int $_1 = 4;
//        int 1$_ = 4; unwanted/unexpected variable
//        int 1_$ = 4; unwanted/unexpected variable
        int num = 5; // Every variable need to have a logic and relevant name, so that it will be easy to identify.
        num = 8;
        int x=2;
        int y=2;
        int s = 2000000000;//its a ten digit figure as it is a 32 bits number
        int t = 20_00_000_000;
        //int p = 5.5; it gives an error becoz the value is decimal which can only be assigned to double or float

        double percent = 5.5;
        // float percentile = 5.5; it gives an error becoz the value is assigned properly but float values should end with f
        float percentile = 8.5f;//this is the correct syntax to assign value to float

        System.out.println(a);
        System.out.println(Z);
        System.out.println(xyz);
        System.out.println(XYZ);
        System.out.println($p);
        System.out.println(p$);
        System.out.println($p$);
        System.out.println($$p);
        System.out.println(p$$);
        System.out.println(_q);
        System.out.println(q_);
        System.out.println(_q_);
        System.out.println(__q);
        System.out.println(q__);
        System.out.println($abc_);
        System.out.println($$abc__);
        System.out.println($_abc_$);
        System.out.println(__abc$$);
        System.out.println(_$abc$_);
        System.out.println($$);
        System.out.println(__);
        System.out.println(_$);
        System.out.println($_);
        System.out.println($123_);
        System.out.println($a2_);
        System.out.println($_1);
        System.out.println(num);
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(s);
        System.out.println(t);
        System.out.println(percent);
        System.out.println(percentile);
    }
}
