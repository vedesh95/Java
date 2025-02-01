public class Str {
    public static void main(String args[]){

        /*
         *We can mutable strings and mmutable strings
         * string class is immutable
         * StringBuffer and StringBuilder are mutable
         * String Buffer is thread safe and String Builder is not
         */


        String name = new String("Vedesh");
        name.concat("Gawande");
        System.out.println(name.charAt(0) + " " + name);

        //two references to same object
        String s2 = "vedesh";
        String s3 = "vedesh";
        System.out.println(s2.hashCode() + " " + s3.hashCode());

        //String Buffer
        StringBuffer sb = new StringBuffer("vedesh");
        sb.setCharAt(0, 'V');
        System.out.println(sb.capacity() + " " + sb.length());


        //checking mutability
        System.out.println("checking mutability");
        String s1 = "Vedesh";
        System.out.println(s1.hashCode());
        s1=s1.concat(" Gawande");
        System.out.println(s1.hashCode());

        StringBuffer sb1 = new StringBuffer("vedesh");
        System.out.println(sb1.hashCode());
        sb1.append(" Gawande");
        System.out.println(sb1.hashCode());
    }
}
