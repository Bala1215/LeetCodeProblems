import java.util.*;
public class VowelCountInString{
  /*method 1
  public static boolean isVowelEquals(String str){

      String s1 = null , s2 = null; //split 'str' into two halves and store it in 's1' and 's2' respectively
      int count1=0,count2=0; //store count of vowels in s1 and s2
      String vowels = "aeiouAEIOU";
      String sample="";

      for(int index=0; index < str.length(); index++){
             //first half of 'str'
             if(index < str.length()/2){
                  //String.valueOf() is used here to avoid error : char can't store in String
                  sample = String.valueOf(str.charAt(index));
                  s1+=sample;
                  //check whether the current char is vowel or not
                  count1 = vowels.contains(sample) ? ++count1 : count1;
             }
             //second half of 'str'
             else{
                  sample = String.valueOf(str.charAt(index));
                  s2+=sample;
                  count2 = vowels.contains(sample) ? ++count2 : count2;   
             }
   
      }
      //System.out.println(count1+" "+count2);
      return count1==count2 ? true : false;
  }*/

  //method 2
  public static boolean isVowelEquals(String str){
     //set contains only unique elements
     Set<Character> vowels =  new HashSet<>();
     vowels.add('a');
     vowels.add('e');
     vowels.add('i');
     vowels.add('o');
     vowels.add('u');
     vowels.add('A');
     vowels.add('E');
     vowels.add('I');
     vowels.add('O');
     vowels.add('U');

     int count = 0 , firstHalfStart = 0 , secondHalfStart = str.length()/2;

     while(secondHalfStart < str.length()){
          char char1 = str.charAt(firstHalfStart++);
          char char2 = str.charAt(secondHalfStart++);

          if(vowels.contains(char1))
             count+=1;
          if(vowels.contains(char2))
             count-=1;
     }
     return count==0 ? true : false;
  }


  public static void main(String[] args){
      String str = "cost";
      System.out.println(isVowelEquals(str));
   }
}
/*NOTE :
    In method 1 :  
 *  '++count' pre-increment operator is used here to increment the value at the current line
 *   If 'count++' post-increment is used , then 'count' should remain '0' always.
 *   Reason : post-increment increments after the current line
 * 
 * In method 2 :
 *  1=> char char1 = str.charAt(firstHalfStart++);
 *   char char2 = str.charAt(secondHalfStart++);
 *    
 *   'i++' post-increment is used here becoz starting index already defined and index starts from that defined index 
 *    then only it should increment it's value.
 * 
 *  2=> In while loop, iteration starts from secondHalfStart to str.length()-1
 *      Reason : 'str'--> length() must be an even value.
 *      both half have same length and also starting index defined and incremented at each iteration. 
 *      so, that there is no need to traverse a full String 'str'
 *       
 *      ---> firstHalfStart to str.length()/2-1 also used to iterate while loop.
 * 
 *  3=> whenever the vowel is found in  char1 , it will increment the count and char2 , it will decrement the count.
 *      By Doing this , if count of char1 and char2 are same , then '0' will the value of count at last.
 *      else, count will return any value other than '0'
 */