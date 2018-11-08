package io.zipcoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

public class WC {
    private Iterator<String> si;

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File(WC.class.getResource("/someTextFile.txt").getFile());
        Scanner scan = new Scanner(f);
        //to get rid of other characters like numbers
        scan.useDelimiter("[^A-Za-z]+");  //regular expression
        int count = 0;
        while (scan.hasNextLine()) {
            count++;
            System.out.println("word count: " + count + " - " + scan.next());
        }
        System.out.println(count);
    }



    public WC(String fileName) {
            try {
                System.out.println();
                File f = new File(WC.class.getResource("/someTextFile.txt").getFile());
                Scanner s = new Scanner(f);
                this.si = new Scanner(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                System.out.println(fileName + " Does Not Exist");
                System.exit(-1);
            }
        }

    public WC(Iterator < String > si) {
            this.si = si;
        }
    }

