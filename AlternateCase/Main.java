public class Main {
    public static void main(String[] args){
      alternateCase("Hello World!");
    }
    public static String alternateCase(final String string) {
        //initialize variable
        String answer = "";
        //iterate the input string
        for (int i = 0; i < string.length(); i++) {
            //check character if its uppercase or lower case
            if(checkCase(string.charAt(i))){   
              
              answer =answer + Character.toLowerCase(string.charAt(i)); 
              
            }else{
              
              answer =answer + Character.toUpperCase(string.charAt(i));
              
            }
        }
      
        return (answer);
    }
    public static boolean checkCase(char c){
      
        if(Character.isUpperCase(c)){ 
          
          return true;
          
        }
      
        return false;   
      
    }
}
