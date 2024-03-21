
import java.lang.Character.Subset;

public class Main{
    static int add(int a1,int a2){
        return a1+a2;
    }
    static double add(double a1,double a2){
        return a1+a2;
    }
    static int func(String s1,int a1, String s2, int a2){
        System.out.println("In method");
        System.out.println("age of "+s1+ " is "+a1);
        System.out.println("age of "+s2+ " is "+a2);
        return a1+a2;
    }
    public static void main(String [] args){
        System.out.println("Hello vedesh");
        System.out.print("I'm on 2nd line. ");
        System.out.println(" I am continued on second");
        System.out.println(2+4);

        //single line comment
        /*this is
         * a multi line comment*/

         String s1 ="Vedesh", s2=" Gawande";
         int i1=1, i2=1;
         float f1=1.1f;
         char c1='a';
         final boolean b1=true;
        
        System.out.println(s1+s2);
        System.out.println(i1+i2);
        System.out.println(f1);
        System.out.println(c1);
        System.out.println(b1);

        // byte	1 byte	Stores whole numbers from -128 to 127
        // short	2 bytes	Stores whole numbers from -32,768 to 32,767
        // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        // boolean	1 bit	Stores true or false values
        // char	2 bytes

        // End the value with an "f" for floats and "d" for doubles:

        float f2=10e3f;
        double d2=10e4d;
        System.out.println(f2);
        System.out.println(d2);

        char c3=66;
        System.out.println(c3);
        
        // A String in Java is actually a non-primitive data type, because it refers to an object. 
        
        // Non-primitive data types are called reference types because they refer to objects.

        //casting
        System.out.println("widening casting");
        int i4=1;
        double d4=i4;
        System.out.println(d4);

        System.out.println("Narrowing casting");
        d4=9.58d;
        i4=(int) d4;
        System.out.println(i4);

        // x++ ++x both valid
        
        //logical operators && || !

        //strings
        String s3="vedesh";
        System.out.println("\n\n\nString Operations");
        System.out.println(s3.length());
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s3.indexOf("e"));

        String s4="Gawande";
        System.out.println(s3.concat(s4));
        int i5=10;
        System.out.println(s3+i5);

        //use \ to escape characters
        
        System.out.println("\nif else");
        int i6=6;
        if(i6<5){
            System.out.println("i6 is less than 5");
        }else if(i6==5){
            System.out.println("i6 == 5");
        }else{
            System.out.println("i6 is greater than 5");
        }

        String result = (i6<5) ? "i6 < 5" : "i6 >5" ;
        System.out.println(result);

        int day=4;
        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            default:
                System.out.println("Not Monday");
        }

        //loops
        //while loop
        int i7=0;
        while(i7<2){
            System.err.println(i7);
            i7++;
        }

        //do while loop
        do{
            System.err.println("i7="+i7+" this is gotta run atleast once");
        }while(i7<2);

        //for loop
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(i+","+j+" ");
            }
        }
        
        //for each loop
        System.out.println("for each loop");
        String[] cars= {"car1", "car2", "car3"};
        for(String i: cars){
            System.out.println(i);
        }

        //break continue
        System.out.println("break continue used like in C++");

        //arrays
        System.out.println("\nArrays");
        String[] toys = {"toy1","toy2", "toy3"};
        toys[0]="toy4";
        System.out.println(toys.length);
        for(String i:toys){
            System.out.print(i+" ");
        }

        //2D arrays
        System.out.println("\n2D array of variable size");
        int[][] arr = {{1,2},{1,2,3}};
        for(int i=0;i<2;i++){
            for(int j=0;j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        
        // JAVA METHODS
        System.out.println("\ncalling method from main");
        System.out.println("Total age is "+func("ved",24,"balu",23));

        // Multiple methods can have the same name as long as the number and/or type of parameters are different.
        System.out.println("Demonstate function overloading");
        System.out.println(add(2,3));
        System.out.println(add(2d,3d));

        //OOPS
        System.out.println("OOPS");
        OOPS obj = new OOPS();
        obj.main();
    }
}