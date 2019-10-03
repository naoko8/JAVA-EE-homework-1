package homework;

import java.util.Scanner;

public class B extends A {
        int y;

        public int first1() {
            Scanner input1 = new Scanner(System.in);
            y = input1.nextInt();
            return y;
        }

        public int fifth() {
            return x + y;
        }
    }


