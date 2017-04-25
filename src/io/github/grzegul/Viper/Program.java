package io.github.grzegul.Viper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Program {

	public String insertText(String s){
		return s;
	}

	public ArrayList<String> getTextFromFile(File file){
		ArrayList<String> words = new ArrayList<String>();
		return words;
	}
	
	public String showWord(String filename) throws FileNotFoundException{
		Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
                
            }
        }
        return "FILE END!!!";
	}

	public static void main(String[] args) throws FileNotFoundException {
		Program p = new Program();
		p.showWord("source.txt");
		

	}

}
