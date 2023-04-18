package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

		    public static void main(String[] args) throws IOException {
		        

		        File filein = new File("/home/harsh09/eclipse-workspace/lab/demo/src/demo/first.txt");
		        File fileout = new File("/home/harsh09/eclipse-workspace/lab/demo/src/demo/copy.txt");

		        BufferedReader br = new BufferedReader(new FileReader(filein));
		        BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));

		        int ch;
		        while ((ch = br.read()) != -1) {
		            bw.write(ch);
		        };

		        br.close();
		        bw.close();
		      
		    }
		
	}


