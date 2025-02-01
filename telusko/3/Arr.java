public class Arr {
    public static void main(String args[]){
        int num15 [] = {1,2,3};
        System.out.println(num15[0]);
        int num16=6;
        int num17 [] = new int [num16];
        System.out.println(num17[5]);

        int num18 [][] = new int [4][4];
        for (int num19 []: num18){
            for(int num20: num19){
                System.out.print(num20);
            }
            System.out.println();
        }

        //jagged arrays
        int num19 [][] = new int [3][];
        num19[0] = new int [2];
        num19[1] = new int [3];
        num19[2] = new int [4];

        for(int i=0;i<num19.length; i++){
            for(int j=0; j<num19[i].length; j++){
                System.out.print(num19[i][j]);
            }
            System.out.println();
        }

        Student students [] = new Student[3];
        //students[0].name = "vedesh"; //doing this will  throw error
        //becuase unike c++ the second last line will create references and not actual objects ike in c++
        Student s1 = new Student();
        students[0] = s1;
        students[0].name = "vedesh"; 
        System.out.println(students[0].name);
    }
}
