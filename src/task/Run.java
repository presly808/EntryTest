package task;

import utils.FileUtils;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Vorobiei on 18.05.2016.
 */
public class Run {
    public static void main(String[] args) throws IOException {
        String text = FileUtils.readFile("src/resources/WarAndPeace.txt");
        String[] result = TextUtils.getUniqueSortedWords(text);
        System.out.println(Arrays.toString(result));
    }
}
