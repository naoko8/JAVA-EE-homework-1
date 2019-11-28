package homework;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class assignment3 {

    Random myRand = new Random();
    public void firstMethod() {

        ArrayList<Integer> myArr = new ArrayList<Integer>();
        ArrayList<Integer> myArr1 = new ArrayList<Integer>();

        int i=12;
        while(i>0) {
            myArr.add(myRand.nextInt());
            i--;
        }

        myArr1=myArr;
        Collections.sort(myArr);
        for(int number:myArr) {
            System.out.print(number+" ");
        }
        System.out.println("\n");
        //myArr1.removeAll(j -> j%2 !=0);
        for(int j=2;j<=6;j++){
            myArr1.remove(j);
        }
        Collections.sort(myArr1);
        for(int arr:myArr1){
            System.out.print(arr+" ");
        }

    }
    public void secondMethod(){
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=0;i<12;i++){
            if(i%3==0 && i!=0){
                arr.add(myRand.nextInt((25-20)+1) +20);
            }
            else{
                arr.add(myRand.nextInt((10-5) + 1) +5);
            }
        }
        for(int arr2:arr){
            System.out.print(arr2+" ");
        }


    }
    public static void main(String[] args){
        //assignment3 myObj = new assignment3();
       // myObj.firstMethod();
       // assignment3 mySecObj = new assignment3();
       // mySecObj.secondMethod();

    }

}
