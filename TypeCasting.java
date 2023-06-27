package org.apache.maven;

public class TypeCasting {
    public static void main(String args[]){
        double d = 5;// implicit convertion
        int i = (int )5.7;// typecasting and explicit convertion
        System.out.println(d);
        System.out.println(i);

        short s = 128;
        byte b = (byte)32768;
        System.out.println(s);
        System.out.println(b);

        int i1 = -32758;
        short s1 = (short)777777777;
        System.out.println(i1);
        System.out.println(s1);

        int i2 = (int)'~';
        char c = (char)127;
        System.out.println(i2);
        System.out.println(c);

        int i3 = (int)'~';
        char c1 = (char)127;
        System.out.println(i3);
        System.out.println(c1);

        long l = 700000000;
        int i4 = (int)7000000000123456789l;
        System.out.println(l);
        System.out.println(i4);

        float f = 124;
        long l1 = (long)245.251;
        System.out.println(f);
        System.out.println(l1);

        double d1 = 456123.546123f;
        float f1 =  (float)456789.12345d;
        System.out.println(d1);
        System.out.println(f1);

        double d2 = 128;
        byte b2 = (byte)123.123d;
        System.out.println(d2);
        System.out.println(b2);
    }

}
