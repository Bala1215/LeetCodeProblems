class TwoStringArraysEquals {
    public StringBuilder arrToStringBuilder(String[] arr,StringBuilder str){
        for(int index=0; index < arr.length; index++){
               str.append(arr[index]);
        }
        return str;

    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        System.out.println(arrToStringBuilder(word1,str1));
        System.out.println(arrToStringBuilder(word2,str2));
 
        boolean result = str1.toString().equals(str2.toString()) ? true : false;

        return result;
              
        
       
    }
}