package fajp;
//writing data into a text file.

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;


//using file writer buffer writer
public class FajpWritingData {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(("C:\\Users\\arunp_7\\OneDrive\\Desktop"));

        BufferedWriter  bw = new BufferedWriter(fw);

        bw.write("Selenium with Java");
        bw.write("Selenium with C++");
        bw.write("Selenium with Java Script");
        bw.write("Selenium with Java and kotlin");
        bw.write("Selenium with Java and HTML");
        System.out.println("Finished");
        bw.close();
    }
}
