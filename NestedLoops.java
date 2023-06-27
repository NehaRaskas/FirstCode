package org.apache.maven;

public class NestedLoops {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }

        int a = 1;
        while (a <= 5) {
            int b = 1;
            while (b <= 4) {
                System.out.print("# ");
                b++;
            }
            System.out.println("#");
            a++;
        }

        char k, l;
        for (k = 65; k <= 67; k++) {
            for (l = 67; l >= k+1; l--) {
                System.out.print(l + " ");
            }
            System.out.println(k);
        }

        int row = 5;
        int column = 5;
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                if (y == 0 || y == column - 1) {
                    System.out.print("@ ");
                } else if (x==1&&y==column-4||x==2&&y==column-3||x==3&&y==column-2) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println();
            }


// #Assignment

            //1 prgm: 1-6 Numbers Pattern Logic
            int m, n;
            for (m = 1; m <= 6; m++) {
                for (n = 1; n <= m - 1; n++) {
                    System.out.print(n + " ");
                }
                System.out.println(m);
            }

            //2 prgm: Alphabets Pattern Logic
            char u, v;
            for (u = 'A'; u <= 'C'; u++) {
                for (v = 'A'; v <= u - 1; v++) {
                    System.out.print(v + " ");
                }
                System.out.println(u);
            }

            //3 prgm: Box Star Pattern Logic
            int rows = 4;
            int columns = 4;
            for (int r = 0; r < rows; r++) {
                for (int s = 0; s < columns; s++) {
                    if (r == 0 || r == rows - 1 || s == 0 || s == columns - 1) {
                        System.out.print("$ ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }


        }
}