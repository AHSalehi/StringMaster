import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        int flag = sentence.indexOf(word);
        String out = sentence.substring(0, flag-1);
        return (new String(out +" "+newWord));
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        char[] firstName_array = firstName.toLowerCase().toCharArray();
        char[] lastName_array = lastName.toLowerCase().toCharArray();
        firstName_array[0] = (char)((int)firstName_array[0] - 32);
        lastName_array[0] = (char)((int)lastName_array[0] - 32);
        if(lastName != " " && firstName != " ")
        {
            return (new String(firstName_array))+" "+(new String(lastName_array));
        }
        if(lastName == " ")
        {
            return (new String(firstName_array));
        }
        else if(firstName == " ")
        {
            return (new String(lastName_array));
        }
        else 
            return "";

    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        return null;
    }
}

