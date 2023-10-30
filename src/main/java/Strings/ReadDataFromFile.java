package Strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
    public static void main(String[] args) throws IOException {
        int nl = 0, nw = 0, nc = 0;

        String line;
        BufferedReader br = new BufferedReader(new FileReader("E:\\DEV\\demoo\\src\\main\\java\\Interview\\data.txt"));
        while ((line = br.readLine()) != null) {
            //count number of lines
            nl++;
            //count number of words
            String[] words = line.split(" ");
            int length = words.length;
            nw += length;
            //count number of character
            nc += line.length();
        }
        br.close();
        System.out.println(nl + " " + nw + " " + " " + nc);
    }
}
