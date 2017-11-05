package task;

/**
 * Created by Vorobiei on 18.05.2016.
 */
public class TextUtils {
    /**
     * Method contains inside of its body three another methods.
     * Each of this method defined below.
     *
     * @param  text
     * @return sorted by natural order array of unique words
     * */
    public static String[] getUniqueSortedWords(String text) {
//        TODO find mistake and correct it, so the method works correctly
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(uniqueWords);
    }
    /**
     * @param text
     * @return array with words, get from receive text
     *          if received argument is null
     *          or text length is zero
     *          return array with zero length
     * */
    public static String[] getWords(String text) {
        if(text == null || text.isEmpty()){
            return new String[0];
        }
//        TODO write your code here


        return text.split("; ");
    }
    /**
     * @param words array with words
     * @return  array with unique words
     * */
    public static String[] getUniqueWords(String[] words) {

        String[] result = new String[words.length];
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if(isUnique(result,words[i])){
                result[count++] = words[i];
            }
        }

//        TODO write your code here

        return splitArr(result,count);
    }

    private static String[] splitArr(String[] input, int lenght) {
        String[] res = new String[lenght];
        for (int i = 0; i < lenght; i++) {
            res[i] = input[i];
        }

        return res;

    }

    public static boolean isUnique(String[] arr, String target){
        if(arr == null || arr.length == 0){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if(target.equals(arr[i])){
                return false;
            }
        }

        return true;

    }

     /**
     * @param  uniqueWords array with unique words
     * @return sorted by natural order array of unique words
     * */
    public static String[] sortWords(String[] uniqueWords) {

//        TODO write your code here
        // selection sort

        for (int i = 0; i < uniqueWords.length; i++) {
            int minI = i;
            for (int j = i + 1; j < uniqueWords.length; j++) {
                if(uniqueWords[j].compareTo(uniqueWords[minI]) < 0){
                    minI = j;
                }
            }

            swap(uniqueWords, i,  minI);
        }



        return uniqueWords;
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
