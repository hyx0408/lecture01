package myjavacode;
import java.util.Arrays;

/**
 * Created by hubert on 2015.06.01.
 */
public class MyClass {
    public static void main(String [] args){
        String saySomething = "Hello Hubert Huang";
        String[] sayArray = {"Hello","Hubert","Huang"};
        if(sayArray.length == 3) {
            System.out.println(saySomething);
            System.out.println(saySomething.length());
            double d =Math.sin(Math.PI/2);
            System.out.println(d);
            String[] saySamething = Arrays.copyOf(sayArray,sayArray.length);
            for(String word : sayArray)
                System.out.print(word+' ');
            
            System.out.println();
        }
    }
}
