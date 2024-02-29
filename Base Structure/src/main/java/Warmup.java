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

    public char toLowerCase(char chr)
    {
        return (char)((int)chr + 32);
    }

    public int ascii(char chr)
    {
        return (int)chr;
    }
    public boolean equal(char chr1, char chr2)
    {
        int asc_1 = ascii(chr1);
        int asc_2 = ascii(chr2);
        if(asc_1 <= 90 && asc_1 >= 65){
            chr1 = toLowerCase(chr1);
            asc_1 = ascii(chr1);
        }
        else if(asc_2 <= 90 && asc_2 >= 65){
            chr2 = toLowerCase(chr2);
            asc_2 = ascii(chr2);
        }
        return asc_1 == asc_2;
    }
    public boolean compare(char chr1, char chr2)
    {
        int asc_1 = ascii(chr1);
        int asc_2 = ascii(chr2);
        if(asc_1 <= 90 && asc_1 >= 65){
            chr1 = toLowerCase(chr1);
            asc_1 = ascii(chr1);
        }
        else if(asc_2 <= 90 && asc_2 >= 65){
            chr2 = toLowerCase(chr2);
            asc_2 = ascii(chr2);
        }
        // true if chr1 < chr2
        //false if chr1 > chr2
        return asc_1 < asc_2;
        
    }

    public String firstWord(String wordA, String wordB) {
        int i = 0;
        int l = (wordA.length() <= wordB.length())?wordA.length():wordB.length();
        while(i < l)
        {
            if(equal(wordA.charAt(i), wordB.charAt(i)))
            {
                i++;
            }
            else{
                if(compare(wordA.charAt(i), wordB.charAt(i)))
                {
                    return wordA;
                }
                else
                    return wordB;
            }
        }
        return "";
    }
}
