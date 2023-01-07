import java.util.*;
public class ValidPalindrome{

  public static boolean isPalindrome(String s){
    for(int index = 0; index < s.length(); index++)
        if(s.charAt(index)!=s.charAt(s.length()-1-index))
             return false;
   return true;
  }
  public static boolean isValidPalindrome(String str){
    str = str.toLowerCase();
    String result = "";
    for(int index=0; index < str.length(); index++){
          char chr = str.charAt(index);
          if( (chr >= 'a' && chr<='z') || (chr>='0' && chr<='9') )
                result+=String.valueOf(chr);
    }
    
    return isPalindrome(result);
    
  }
  public static void main(String[] args){
      String str = "amma..!";
      //"ab1"; "1. Hooh!";
      System.out.println(isValidPalindrome(str));
   }
}