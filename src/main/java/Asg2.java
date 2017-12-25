/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 232922
 * Name: #NurulSyafawani
 */

import java.util.Arrays;

import Tcalc.Keyword;
//import Tcalc.Lines;
import rdFile.RdFile;
import rdContent.RdContent;
import operation.Operation;

public class Asg2 {
	
	public String[] Execute(String path){
		//declare 
	RdFile r = new RdFile();
	RdContent ri = new RdContent();
	Keyword rk = new Keyword();
	//Lines c = new Lines();
	Operation t = new Operation();
	
	// getterS
	String file = r.ReadFile(path);
	String [] info = ri.ReadInfo(file);
	String LOC = rk.countNumLines(file);
	String LOBlank = rk.countEmptyLines(file);
	String LOComment = rk.countCommentLines(file);
	String actualLOC = rk.countActualLines(file);
	int [] key = rk.ReadKeyword(file);
	String[] numkey=Arrays.toString(key).split("[\\[\\]]")[1].split(", "); 
	String total = t.Total(actualLOC, key);
	

	return new String[] { info[0],info[1],info[2],info[3],info[4],LOC ,LOBlank ,LOComment ,actualLOC,numkey[0],
			numkey[1],numkey[2],numkey[3],numkey[4],numkey[5],numkey[6],total};
	}
	
	
	
	
	
}