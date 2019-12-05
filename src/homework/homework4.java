package homework;
import java.util.ArrayList;
import java.util.Random;

public class homework4 {

    String sLang = "en";
    String sParam = "p-4-s-2-4-w-7-9";
    ArrayList<Integer>myArr = new ArrayList<Integer>();

    // ricxvebis migeba
    public void splitFunction(){
        String [] par = sParam.split("-");
        for (String arr:par) {

            try {
                myArr.add(Integer.parseInt(arr));
            } catch (NumberFormatException e) {
               // e.printStackTrace();
            }
        }
    }

    public String generateText() {
        //mesme cikli
        int leftLimit = 97;
        int rightLimit = 122;
        Random random = new Random();
        int sizeOfString = myArr.get(myArr.size() - 2);
        int sizeOfString2 = myArr.get(myArr.size() - 1);
        StringBuffer r = new StringBuffer();
        //meore cikli
        int numberOfWords1 = myArr.get(myArr.size() - 4);
        int numberOfWords2 = myArr.get(myArr.size() - 3);
        StringBuffer m = new StringBuffer();
        //pirveli cikli
        int numberOfParagraphs = myArr.get(0);
        System.out.println("numberOfParagraphs " + numberOfParagraphs);
        StringBuffer n = new StringBuffer(numberOfParagraphs);
        for (int k = 0; k < numberOfParagraphs; k++) {
            for (int j = 0; j < random.nextInt((numberOfWords2 - numberOfWords1) + 1) + numberOfWords1; j++) {
                for (int i = 0; i < random.nextInt((sizeOfString2 - sizeOfString) + 1) + sizeOfString; i++) {
                    int nextRandomChar = leftLimit
                            + (int) (random.nextFloat()
                            * (rightLimit - leftLimit + 1));
                    r.append((char) nextRandomChar);
                }
                m.append(r).append(" ");
                r.delete(0, r.length());
            }
            n.append("    " + m).append("\n");
            m.delete(0, m.length());

        }
        return n.toString();
    }

    public static void main(String[] args){

       homework4 obj = new homework4();
       obj.splitFunction();
       System.out.println(obj.generateText());
    }
}
