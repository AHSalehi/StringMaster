public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] wordList = sentence.split(" ");
        return (wordList.length >= number)?wordList[number-1]:(" Number = "+number+" is out Of Bound");
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int counter = 0;
        if(searchForEven)
        {
            for(int i = 0;i < number.length();i++)
            {
                if((int)number.charAt(i) % 2 == 0)
                {
                    counter++;
                }
            }
        }
        if(!searchForEven)
        {
            for(int i = 0;i < number.length();i++)
            {
                if((int)number.charAt(i) % 2 == 1)
                {
                    counter++;
                }
            }
        }
        return counter;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public int ascii(char chr)
    {
        return (int)chr;
    }
    

    public String firstWord(String wordA, String wordB) {
        String tmpA, tmpB;
        tmpA = wordA;
        tmpB = wordB;
        if(wordA == " ")
            return wordA;
        else if(wordB == " ")
            return wordB;
        wordA = wordA.toLowerCase();
        wordB = wordB.toLowerCase();
        int common_len = (wordA.length() <= wordB.length())?wordA.length():wordB.length();
        int i = 0;
        while(i < common_len)
        {
            if(ascii(wordA.charAt(i)) == ascii(wordB.charAt(i)))
                i++;
            else
            {
                if(ascii(wordA.charAt(i)) < ascii(wordB.charAt(i)))
                    return tmpA;
                else
                    return tmpB;
            }
        }
        return "";
    }
}
