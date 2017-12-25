/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 232922
 * Name: #NurulSyafawani
 */

import excel.Excel;

public class Main {

	public static void main(String[] args) {
		Excel w = new Excel();
		String file1 = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Realtime\\src\\Assignment2_TestFiles\\MyThread1.java";
		String file2 = "C:\\Users\\USER\\Documents\\NetBeansProjects\\Realtime\\src\\Assignment2_TestFiles\\MyThread2.java";

		Asg2 e = new Asg2();
		String[] result1 = e.Execute(file1);
		String[] result2 = e.Execute(file2);
		w.WriteExcel(result2,result1);
		
	}
}