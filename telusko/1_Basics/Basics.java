public class Basics {
    public static void main(String args[]){
        System.out.println("Hello Vedesh");
        System.out.println(4+6);
        int num1 = 5;
        float f = 5.9f;
        double d = 5.9;
        boolean b = true; // only accepts true of false
        long l=46l;
        System.out.println(num1 + " " + f  + " " + d + " " + b + " "+ l);

        
        int num2 = 0b110;
        System.out.println(num2);

        int num3 = 100_000_00;
        float num4=10e3f;
        System.out.println(num3 + " " + num4);

        //explicit casting => casting
        //implicit casting => conversion

        int num5 = 258;
        byte num6 = (byte) num5;
        System.out.println(num6); //takes module if overflow

        //type promotion
        byte num7 = 10;
        byte num8 = 20;
        int num9 = num7*num8;
        System.out.println(num9);
        
        //arithmetic operators + - / * % += -= *=  ++ --
        //logical operators  < > == != >= <=
        int num10 = 10;
        int num11 = 10;
        boolean num12 = num10 == num11;
        System.out.println(num12);

        //&  |  ! 
        //&& || ! => short circuiting  => saving time

        if(num10 == num11){
            System.out.println("numbers equal");
        }else{
            System.out.println("numbers not equal");
        }

        //ternary operator
        String str1 =  num10 == num11 ? "numbers equal" : "numbers not equal";
        System.out.println(str1);

        int num13 = 1;
        switch(num13){
            case 0:
                System.out.println("Monday");
                break;
            case 1: 
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Sunday !!!");
        }

        int num14=1;
        while(num14<10){
            System.out.println(num14);
            num14++;
        }

        do{
            System.out.println("ran at least one");
        }while(num14 < 1);

        for(;num14<=10;){
            System.out.println(num14);
            num14++;
        }
    }
}
