import java.util.*;
public class JV2_1_FREQ {
    public static void main(String args[])
    {
        // ACCEPTING THE STRING
        Scanner sc= new Scanner(System.in);  //System.in is a standard input stream
        String str= sc.nextLine();
        str=str.toUpperCase();
        // CONVERTING STRING TO CHARACTER ARRAY AND THEN SORTING IT
        char chr[]= str.toCharArray();
        Arrays.sort(chr);
        int freq; // DECLARING THE FREQ VARIABLE
        int j=0;
        for(int i=0;i<chr.length;i++) {
            freq=0;
            if ((int)chr[i]>=65 && (int)chr[i]<=90){ // CONDITION TO CHECK IF THE CHARACTER IS A CAPITAL LETTER
                for( j=0;j<chr.length;j++) {
                    if (chr[i] == chr[j])
                        freq++;
                }
            }
            if(freq>=1){
                i=i+freq-1;
                System.out.println(chr[i]+" : "+"#".repeat(freq));
            }
        }
    }
}
