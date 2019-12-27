package com.bridgeLabz.algorithm;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1


{
    private static String REGEX1="<<name>>";
    private static String REGEX2="<<fullname>>";
    private static String REGEX3="91-xxxxxxxxxx";
    private static String REGEX4="01/01/2016";

    private static String INPUT="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
    private static String REPLACE1="Aditi";
    private static String REPLACE2="Aditi Dattatraya DEsai";
    private static String REPLACE3="9880771176";
    private static String REPLACE4="02/01/1998";

  public static void main(String[] args) {

  Pattern p1=Pattern.compile(REGEX1);
  Pattern p2=Pattern.compile(REGEX2);
  Pattern p3=Pattern.compile(REGEX3);
  Pattern p4=Pattern.compile(REGEX4);
  

  Matcher m1=p1.matcher(INPUT);
  INPUT=m1.replaceAll(REPLACE1);

  Matcher m2=p2.matcher(INPUT);
  INPUT=m2.replaceAll(REPLACE2);

  Matcher m3=p3.matcher(INPUT);
  INPUT=m3.replaceAll(REPLACE3);

  Matcher m4=p4.matcher(INPUT);
  INPUT=m4.replaceAll(REPLACE4);

  System.out.println(INPUT);

}
}


   

