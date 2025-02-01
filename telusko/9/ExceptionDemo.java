class CustomException extends Exception{
    CustomException(String s){
        super(s);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 10, j=0;
        try{
            int k = i/j;
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String s=null;
            if(s==null){
                throw new CustomException("s is null");
            }
        }catch(CustomException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
