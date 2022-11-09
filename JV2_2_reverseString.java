import java.util.*;
public class JV2_2_reverseString {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);  //System.in is a standard input stream
        System.out.println("enter a String");
        String str= sc.nextLine();
        String words[]=str.split("\\s");// split by space
        String reverseWord="";

        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        System.out.println(reverseWord);
    }
    }


