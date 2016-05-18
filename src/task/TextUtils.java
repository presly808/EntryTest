package task;

/**
 * Created by Vorobiei on 18.05.2016.
 */
public class TextUtils {
    /**
     * Method contains inside of its body three another methods.
     * Each of this method defined below.
     *
     * @receive text
     * @return sorted by natural order array of unique words
     * */
    public static String[] getUniqueSortedWords(String text) {
//        TODO find mistake and correct it, so the method works correctly
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(words);
    }
    /**
     * @receive text
     * @return array with words, get from receive text
     *          if received argument is null
     *          or text length is zero
     *          return array with zero length
     * */
    public static String[] getWords(String text) {

//        TODO write your code here
        if(text == null) return new String[0];
        text = text.trim();
        if(text.equals("")) return new String[0];
        return text.split(", ");
    }
    /**
     * @receive array with words
     * @return  array with unique words
     * */
    public static String[] getUniqueWords(String[] words) {

//        TODO write your code here

        String[] tmp = new String[words.length];
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if(isUnique(tmp, words[i])){
                tmp[j] = words[i];
                j++;
            }
        }

        String[] uniqueWords = new String[j];
         System.arraycopy(tmp, 0, uniqueWords, 0, j);
        return uniqueWords;
    }

    private static boolean isUnique(String[] src, String word) {
        for (int i = 0; i < src.length; i++) {
            if(word.equals(src[i])) return false;
        }
        return true;
    }


    /**
     * @receive array with unique words
     * @return sorted by natural order array of unique words
     * */
    public static String[] sortWords(String[] uniqueWords) {

//        TODO write your code here
        for (int j = 0; j < uniqueWords.length; j++) {
            for (int i = 0; i < uniqueWords.length - 1; i++) {
                if(uniqueWords[i].compareTo(uniqueWords[i + 1]) > 0){
                    String tmp = uniqueWords[i];
                    uniqueWords[i] = uniqueWords[i + 1];
                    uniqueWords[i + 1] = tmp;
                }
            }
        }
        return uniqueWords;
    }
}
