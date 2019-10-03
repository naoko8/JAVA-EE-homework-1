package homework;

import java.util.Scanner;

public class A {
    int x;

    A() {
        System.out.println("Hello");
    }

    public int first() {
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        return x;
    }

    public int second() {
        return x + 12;
    }

    public int third() {
        if (x % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

