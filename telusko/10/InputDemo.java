import java.io.IOException;
import java.util.Scanner;

public class InputDemo {
    public static void main(String args[]) throws IOException{
        /*
        out is an object of print stream class defined as static object in system class

        System.in.read() -> takes input -> returns ASCII
        to use above line you havr to throw and handle IO Exception
        */

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();


        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(num);

        /*
         * try catch finally -> whenever you want to close the resource
         * finally block executes everytime irrespective of exceptions are thrown or not
        */

        /*
            try with resources
            try(BufferReader br = new BufferReader(new InputStreamReader(System.in))) 
        */

    }
}
