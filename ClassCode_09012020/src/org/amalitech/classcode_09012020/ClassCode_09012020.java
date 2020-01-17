package org.amalitech.classcode_09012020;
import java.util.Arrays;

	// Java program to check if a given string is isogram or not 

	public class ClassCode_09012020 {
	
	    // Main program
	    public static void main(String[] args) 
	    {
	 	 
	        String str1 = ""; 
	        System.out.println(str1 +" --- "+is_iso(str1)); 
	  
	        String str2 = "anA"; 
	        System.out.println(str2 +" --- "+is_iso(str2));
	  
	        String str3 = "abc"; 
	        System.out.println(str3 +" --- "+is_iso(str3));
	  
	        String str4 = "dell"; 
	        System.out.println(str4 +" --- "+is_iso(str4)); 
	        
	        String str5 = "Demographic"; 
	        System.out.println(str5 +" --- "+is_iso(str5)); 
	        
	        String str6 = "aca"; 
	        System.out.println(str6 +" --- "+is_iso(str6)); 
	        
	        String str7 = "isogram"; 
	        System.out.println(str7 +" --- "+is_iso(str7)); 
	        
	        String str8 = "moOse"; 
	        System.out.println(str8 +" --- "+is_iso(str8)); 
	       
	    }
	    
 // Function to check if a given string is isogram or not 
		
	    static boolean is_iso(String wrd) 
	    { 
	        // Convert all letters to lower case
	    	
	        wrd = wrd.toLowerCase(); 
	        int length = wrd.length(); 
	  
	        char arr[] = wrd.toCharArray(); 
	  
	        Arrays.sort(arr); 
	        for (int i = 0; i < length - 1; i++) { 
	            if (arr[i] == arr[i + 1]) 
	                return false; 
	        } 
	        return true; 
	    } 
	} 