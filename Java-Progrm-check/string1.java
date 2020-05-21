import java.util.HashSet;

public class string1 {
    
    public static void main(String[] args) {

       
        String s1 ="abc";
        String s2 = "bcd";
        System.out.println(s1 == s2);
        

        String s3 = "prabir";
        int start = 1;
        char end = 6;
        System.out.println(start+end);
        System.out.println(s3.substring(start,end-2));


        HashSet shortSet = new HashSet();
        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }
        System.out.println(shortSet.size());




        

    }
}