public class Main {
    public static String disemvowel(String str) {
      //intialize answer  
      String answer = "";
        
      //iterate through the string
      for(int i=0;i<str.length();i++){
        //check if it is vowel
        if(!checkVowels(str.charAt(i))){
          answer = answer + str.charAt(i);
        }
      }
      return answer;
    }
    public static boolean checkVowels(char c){
      //itialize every vowel  
      String vowels = "aeiouAEIOU";
        
      if(vowels.contains(String.valueOf(c))){ 
        return true;
      }
      return false;      
    }
}
