package com.bridgeLabz.basic;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file {
    public static void main(String[] args) throws IOException {
    	

        // Open this file.
        BufferedReader reader = new BufferedReader(new FileReader(
                "//Users//rmddesai//Desktop//java.txt"));
        
        // Read lines from file.
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            // Split line on space.
            String[] parts = line.split(" ");
            for (String part : parts) {
            	
            	System.out.println(part);
                
            }
            System.out.println();
        }

        reader.close();
    }
    
}