package homework;



import java.text.DecimalFormat;
import java.io.*;
import java.util.ArrayList;


public class homework2 {


    double x = 1.00, y = 1.11;
    double quadraticEquation = 0;
    DecimalFormat df = new DecimalFormat(".00");
    //static List<Double> s = new ArrayList<Double>();
    //String s;
    public ArrayList<Double> s = new ArrayList<>();

    public void firstFunction() {
        int i=0;
        while (x != y) {

            quadraticEquation = Math.pow(x, 2) + 2 * x + 3;
            x += 0.01;
            System.out.println(" F(x) = " + df.format(quadraticEquation) + " when x = " + x );
            double d = Double.parseDouble(df.format(quadraticEquation));
            s.add(d);
        }
    }

    public void fileWriter(){

        try {

            FileWriter fW = new FileWriter("D:/function.txt");

            for (int i = 0; i < s.size(); i++)
                fW.write(" " + String.valueOf(s.get(i)));
                fW.close();
        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
            homework2 object = new homework2();
            object.firstFunction();
            object.fileWriter();

                File file = new File("D:\\function.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String st=br.readLine();

                br.close();
                System.out.println("min : " + st.substring(0,4));
                System.out.println("max : " + st.substring(st.length()-4));


    }


}