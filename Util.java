package com.bridgeLabz.week2;
//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*
   It contains basic reusable methods like => isLeapYear, => isAnagram, =>
   isPallindrome, => isPrime, => powerOfTwo, => writeToFile, => read file, =>
   writeFile, => printDate, => getFormattedDate

 */
public class Util {

	public static Scanner scanner = new Scanner(System.in);
	private static Util mapper;

	//find 2^power
	public static int powerOfTwo(int power) {
		int result = 0;
		if (power >= 0) {
			result = (int) Math.pow(2, power);
		}
		return result;
	}

	//leap year check
	public static boolean isLeapYear(int year) {
		if (year >= 1000 && year < 10000) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	
	public static boolean isAnagram(String firstString, String secondString) {
		char[] ch1 = firstString.toLowerCase().trim().replaceAll(" ", "").toCharArray();
		char[] ch2 = secondString.toLowerCase().trim().replaceAll(" ", "").toCharArray();

		if (ch1.length != ch2.length) {
			return false;
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
//				System.out.println("Anagram");
				return true;
			}
		}
		return false;
	}

	
	 
	public static boolean isPallindrome(String inputString) {
		if(inputString.length() == 0) {
			return false;
		}else {
			String tempString = inputString;
			char[] ch1 = inputString.toCharArray();
			char[] ch2 = tempString.toCharArray();
//			System.out.println("Before : " + inputString);
			int lastChar = ch1.length - 1;
			
			for (int i = 0; i < ch1.length / 2; i++) {
				char temp = ch1[i];
				ch1[i] = ch1[lastChar - i];
				ch1[lastChar - i] = temp;
			}
			if (Arrays.equals(ch1, ch2)) {
				return true;
			} else {
				return false;
			}
		}
	}

	
	public static boolean isPrime(int number) {
		if (number <= 0) {
			return false;
		} else {
			if (number == 1) {
				return false;
			} else {
				
				for (int divisor = 2; divisor <= number / 2; divisor++) {
					if (number % divisor == 0) {
						return false;
					}
				}
			}
			return true;
		}
	}
	
	
	

	// Java program to print  
	// all primes less than N 
	  
	 
	// function check whether  
	// a number is prime or not 
	
	  
	// Function to print primes 
	
	
	
	
	

	/*
	 * it takes the file address and splitting basis as a parameter and splits the
	 * written documents and returns String array on basis of splitting.
	
	 */

	/*
	 * takes input parameter date in String and returns date in Date format.

	 */
	public static Date printDate(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return dateFormat.parse(date);
		} catch (ParseException e) {
			return null;
		}

	}

	/*
	 * takes date as input and returns formated date.
	
	 */
	public static String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);

	}

	/*
	 * takes file location as parameter and read the file in string format.

	 */
	public static String readFile(String fileName) {
		File file = new File(fileName);
		Scanner sc = null;
		String data = "";
		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				data += sc.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
		return data;
	}

	/*
	 * Takes input data and file location as i/p and writes in the file if file not
	 * present it creates and write in it. if present it simply writes in it.

	 */
	public static void writeToFile(String data, String fileName) {
		File file = new File(fileName);
		FileWriter writer = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			// Writes the content to the file
			writer = new FileWriter(file);
			writer.write(data);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	 public static int binarySearch(String[] arr, String x) 
	    { 
	        int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            int res = x.compareTo(arr[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (res > 0) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
	    } 
	 
	 public static boolean areAnagram(char[] str1, char[] str2) 
	    { 
	        // Get lengths of both strings 
	        int n1 = str1.length; 
	        int n2 = str2.length; 
	  
	        // If length of both strings is not same, 
	        // then they cannot be anagram 
	        if (n1 != n2) 
	            return false; 
	  
	        // Sort both strings 
	        Arrays.sort(str1); 
	        Arrays.sort(str2); 
	  
	        // Compare sorted strings 
	        for (int i = 0; i < n1; i++) 
	            if (str1[i] != str2[i]) 
	                return false; 
	  
	        return true; 
	    } 
	 
	 
	 
	 
	 

			//private static ObjectMapper mapper;
			/*
			 * object will created only one time.
			 */
			static {
				mapper = new Util();
			}

			/*
			
			 */
		/*	public static String convertObjectToJson(Object object) {
				String jsonResult = "";
				try {
					jsonResult = mapper.writeValueAsString(object);
				} catch (JsonGenerationException e) {
					System.out.println("Exception occured while converting java object to json " + e.getMessage());
				} catch (JsonMappingException e) {
					System.out.println("Exception occured while converting java object to json " + e.getMessage());
				} catch (IOException e) {
					System.out.println("Exception occured while converting java object to json " + e.getMessage());
				}
				return jsonResult;
			}
*/
			/*
			 * This method takes parameter as JSON String and class name as input parameter
			 * and returns generic type output after reading JSON file.
			 * 
		
			 */
		/*	public static <G> G convertJsonToJava(String jsonString, Class<G> cls) {
				G result = null;
				try {
					result = mapper.readValue(jsonString, cls);
				} catch (JsonParseException e) {
					System.out.println("Exception while converting json object to java " + e.getMessage());
				} catch (JsonMappingException e) {
					System.out.println("Exception while converting json object to java " + e.getMessage());
				} catch (IOException e) {
					System.out.println("Exception while converting json object to java " + e.getMessage());
				}
				return result;
			}
	 
	 */
	 

}