package chapter8;
//Datatypes:Strings
//Create a program that add spaces to a jumbled string where all words are written together and have no spaces. 
// All words start with capital letter.

public class JumbledString {
   public static void main(String args[]){
       String jumbledString="ILoveLearningJava!";
       addSpacesAndMakeAValidString(jumbledString);
   }

    private static void addSpacesAndMakeAValidString(String text) {
       var modifiedText= new StringBuilder(text);//Instantiating a String Builder
       for(int i=0;i< modifiedText.length();i++){
        if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){// Character is a wrapperClass
            modifiedText.insert(i," ");
            i++; // pass the space created
        }
       }
        System.out.println(modifiedText);
    }
}
