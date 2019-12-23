package homework;
import java.util.Scanner;
import java.util.ArrayList;


public class HomeWork_5 {

    String mainString;
    ArrayList myArrForNumbers = new ArrayList();
    ArrayList myArr = new ArrayList();

    public void getInput(){

        Scanner input = new Scanner(System.in);
        mainString=input.next();
    }
    public void parseInput() {

        String[] par = mainString.split("-|\\+|\\*|\\/");
        for (String arr : par) {
            try {
                myArrForNumbers.add(Double.parseDouble(arr));
            } catch (NumberFormatException e) {
            }

        }
        System.out.println(mainString.length());
        double result = (double) myArrForNumbers.get(0);
        for (int i = 1; i < mainString.length(); i++) {
            String first = par[i];
            double val = (double) myArrForNumbers.get(i + 1);
            switch (first) {
                case "+":
                    result += val;
                    break;
                case "-":
                    result -= val;
                    break;
                case "*":
                    result *= val;
                    break;
                case "/":
                    result /= val;
                    break;
                default:
                    System.out.println("arascori info");
            }

            //System.out.println(mySecondArr);

        }
        //return result;
//    public void add(String s){
//
//
//    }
    }

    public static void main(String[] args) {
            HomeWork_5 obj = new HomeWork_5();
            obj.getInput();
            obj.parseInput();


    }
}
