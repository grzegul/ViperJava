package io.github.grzegul.Viper;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.github.grzegul.Viper.SwingConsole.*;
/*
class ChangeText extends JPanel implements Runnable {
	private int pause;
	
	public ChangeText(int pause) {
		this.pause = pause;
	}
	public void run() {
		try {
			while(!Thread.interrupted()) {
				
				//TimeUnit.MILLISECONDS.sleep(pause);
				Thread.sleep(pause);
			}
		} catch(InterruptedException e) {
			// Acceptable way to exit
		}
	}
}*/

class Viper2 extends JFrame{

	private JButton	b = new JButton("RUN!!");
	private JTextField t3 = new JTextField(10);
	
//	private static Thread thread = new Thread();
	
	public Viper2(){
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<String> words = extractWordsFrom("source.txt");
					for (String currentWord : words) {
						Thread.sleep(300);
						t3.setText(currentWord);
						t3.update(t3.getGraphics());
						//t3.repaint();
						System.out.println(currentWord);
					}	
		        } catch (FileNotFoundException ex){
		        	System.err.println(ex.getStackTrace());
		        } catch (InterruptedException ex){
		        	System.err.println(ex.getStackTrace());
		        }
			}
		});
		setLayout(new FlowLayout());
		add(new JScrollPane(t3));
		add(b);
	}
	
	private ArrayList<String> extractWordsFrom(String filename) throws FileNotFoundException{
		Scanner s = null;
		ArrayList<String> words = new ArrayList<>();
        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            while (s.hasNext()) {
            	words.add(s.next());
            }
        } catch (FileNotFoundException e){
        	System.err.println(e.getStackTrace());
        }
        finally {
            if (s != null) {
                s.close();   
            }
        }
        return words;
	}
}


public class GUI {
	public static void main(String[] args) {
		run(new Viper2(), 300, 100);
		
	}
}