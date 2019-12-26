package homework;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class homework5 {

    final private String[] operatorList = { "+", "-", "*", "/", "(", ")"};

    private String userInput;
    private ArrayList<String> formattedUserInput = new ArrayList<String>();
    private ArrayList<String> userHistory = new ArrayList<String>();



    public ArrayList<String> formatUserInput() {

        for (String j : this.operatorList) {
            switch (j) {
                case "(":
                    userInput = userInput.replace(j, j + " ");
                    break;
                case ")":
                    userInput = userInput.replace(j, " " + j);
                    break;
                default:
                    userInput = userInput.replace(j, " " + j + " ");
                    break;
            }
        }

        formattedUserInput = new ArrayList<String>(Arrays.asList(userInput.split(" ")));

        for (int i = 0; i < formattedUserInput.size(); i++) {
            if (formattedUserInput.get(i).equals("-")) {
                formattedUserInput.set(i, "+");
                formattedUserInput.set(i+1, "-" + formattedUserInput.get(i+1));
            }
        }

        return formattedUserInput;
    }

    public double condenseExpression(String operator, int indexVal) {
        double output = 0;
        int i = indexVal;

        double x = 0.0;
        double y = 0.0;

        try {
            x = Double.parseDouble(formattedUserInput.get(i - 1));
        } catch (NumberFormatException e) {
            x = 0.0;
        }

        try {
            y = Double.parseDouble(formattedUserInput.get(i + 1));
        } catch (NumberFormatException e) {
            y = 0.0;
        }

        switch (operator) {
            case "/":
                if (y == 0) {
                    System.out.println("Error: Can't divide by a zero");
                    return 0;
                } else {
                    output = x / y;
                }
                break;
            case "*":
                output = x * y;
                break;
            case "-":
                output = x - y;
                break;
            case "+":
                output = x + y;
                break;
            default:
                System.out.println("Error: operation does not exist");
                return 0;
        }
        return output;
    }


}
