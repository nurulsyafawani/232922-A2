/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 232922
 * Name: #NurulSyafawani
 */

package rdContent;

import java.util.Scanner;

public class RdContent {

	private String[] require = { "//Semester", "//Course", "//Group", "//Task", "//Matrik" };
	private String[] Info = new String[5];
	private String currentline = "";

	public String[] ReadInfo(String str) {

		Scanner read = new Scanner(str);
		while (read.hasNextLine()) {
			currentline = read.nextLine();
			if (!currentline.equals(""))
				for (int i = 0; i < require.length; i++) {
					if (currentline.contains(require[i]))
						Info[i] = currentline.substring(currentline.lastIndexOf("#") + 1);
				}
		}
		return Info;
	}
}