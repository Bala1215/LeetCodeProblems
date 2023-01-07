public class ValidPalindrome2{

/* whenever the currently pointed characters are not equal , then move the pointer forward and backward to check whether any possibilities to make it as "Palindrome". i.e., By removing any only one character make the String as "Palindrome". */

public static boolean isPalindrome(String str, int pointer1, int pointer2){

   /* if pointer1==pointer2 , then both pointers points to same index.
       That's why loop halts when pointer1 and pointer2 are equal. */

   while(pointer1!=pointer2){
       if(str.charAt(pointer1)!=str.charAt(pointer2))
              return false;

       pointer1++;
       pointer2--;
   }
   return true;
}
 public static boolean isValidPalindrome(String str){

    //Base case : first to check whether the String is null , otherwise it throw a "NULLPOINTEREXCEPTION"

    if(str == null || str.length() ==0)
           return true;
    for(int index = 0; index < str.length(); index++){
          if(str.charAt(index)!=str.charAt(str.length()-1-index))
                return isPalindrome(str,index+1,str.length()-1-index) || isPalindrome(str, 																			index ,(str.length()-1-index)-1);

    
    }
    return true; 
 }

  public static void main(String[] args){

     String str =""; // "deeef";
     //"abc" - false , "aba" - true , "" - true
     System.out.println(isValidPalindrome(str));

  }
}