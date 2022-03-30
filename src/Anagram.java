import java.util.Arrays;
public class Anagram {
    public static void main(String[] args){
        String str1="Listen";
        String str2="Silent";
        boolean flag=true;
        if(str1.length() != str2.length()){
            System.out.println("it is not a anagram");
            flag=false;
        }
        else{
            char[] c1=str1.toLowerCase().toCharArray();
            char[] c2=str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2)){
                System.out.println("it is a anagram");
            }
            else{
                System.out.println("it is not a anagram");
            }
        }
    }
}
