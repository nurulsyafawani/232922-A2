/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 232922
 * Name: #NurulSyafawani
 */

package rdFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RdFile {

	private String result = "";

	public String ReadFile(String path) {

		try {

			File getFile = new File(path);

			BufferedReader b = new BufferedReader(new FileReader(getFile));

			StringBuilder sb = new StringBuilder();
			String line = "";

			while (b.ready() && (line = b.readLine()) != null) {
				sb.append(line + "\r\n");
			}

			result = sb.toString();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;

	}
}