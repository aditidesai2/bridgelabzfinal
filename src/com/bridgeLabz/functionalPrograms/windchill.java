package com.bridgeLabz.functionalPrograms;
public class windchill {
	
    public static void main(String[] args) {
    	
    	//Taking command line arguments
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        //Calculating windchill using variable w
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        //printing the output
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }

}
