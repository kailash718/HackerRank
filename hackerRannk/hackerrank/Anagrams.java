import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer s=new StringBuffer(A);
        if(A.equals(s.reverse().toString()))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



