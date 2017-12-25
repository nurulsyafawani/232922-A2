/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 232922
 * Name: #NurulSyafawani
 */

package Tcalc;

import java.util.Scanner;

public class Keyword {
	private String[] keyword = { "package", "class", "extends", "public", "void", "static", "new"};
	private String[] key;
	private int[] countkey = {0,0,0,0,0,0,0,0};
	private String currentline = "";
	private int count = 0;

	public int[] ReadKeyword(String str) {

		Scanner read = new Scanner(str);
		while (read.hasNextLine()) {
			currentline = read.nextLine();
			if (!currentline.equals(""))
				for (int i = 0; i < keyword.length; i++) {
					if (currentline.contains(keyword[i]))
						countkey[i] = countkey[i] + 1;
				}
		}
		return countkey;
	}

       
	public String countNumLines(String str){
		   String[] lines = str.split("\r\n|\r|\n");
                   System.out.println(Integer.toString( lines.length));
		   return Integer.toString( lines.length);
		}
	
	public String countActualLines(String str){
		 String currentline = "" ;
		 int count=0;
		Scanner read = new Scanner(str); 
		while (read.hasNextLine() ){
		 currentline = read.nextLine();
		 if (!currentline.equals(""))
			 count++;
             if (currentline.contains("//"))
            	 count--;           
		}
		return Integer.toString(count) ;
	}
	
	public String countEmptyLines(String str){
		 String currentline = "" ;
		 int count=0;
		Scanner read = new Scanner(str);
		while (read.hasNextLine() ){
		 currentline = read.nextLine();
		
		 if (currentline.isEmpty())
			 count++;
		}
		return Integer.toString(count) ;
	}
	
	public String countCommentLines(String str){
		 String currentline = "" ;
		 int count=0;
		Scanner read = new Scanner(str); 
		while (read.hasNextLine() ){
		 currentline = read.nextLine();
		 if (!currentline.equals(""))
			 if (currentline.contains("//"))
            	 count++;		    
		}
		return Integer.toString(count) ;
	}
}
        
