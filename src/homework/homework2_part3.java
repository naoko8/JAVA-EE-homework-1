package homework;



public class homework2_part3 {

    int a, b, helper, i, j;

    public void firstMethod() {

        if (a > b) {
            i = b;
            b = a;
            a = i;
        }
        System.out.print("a & b : ");
        while (a < b) {
            a++;
            System.out.print(a);
        }
    }

    public void secondMethod() {
        System.out.println("a divisors : ");
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) System.out.print(i);
        }
    }
    public void thirdMethod() {

        for (int i = 3; i < b; i += 2) {
            if (b % i == 0) {
                System.out.println(i);
            }
        }
    }

}

