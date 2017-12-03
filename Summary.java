/* Filename:		MarkCalculator.java
 * Date:			2017-11-09
 * Name:			Senior J.J.
 * Student number:	160474257
 * -------------------------------------------------------
 * By submitting this file electronically, I declare that
 * it is my own original work, and that I have not copied
 * any part of it from another source.
 * -------------------------------------------------------
 * Summary is a class used to receive a student's exam and
 * coursework marks, and output a colour coded bar graph
 * and a table of the results.
 * 
 * It requires the MarkCalculator.java, StudentChart.java,
 * and Bar.java files and the shapes library to run
 * correctly.
 * -------------------------------------------------------
 */

@SuppressWarnings("static-access")

public class Summary {											//Class used to receive exam and coursework marks and output a graph and table of module marks
	
	
	static int markArr[] = new int[11];							//Array used to recieve exam and coursework marks
	public static int moduleMarkArr[] = new int[6];				//Array used to hold calculated module marks

	public static void main(String[] args) {
		
		getMarks();
		
		studentSummary();

	}
	
	public static void getMarks(){								//Method for receiving and processing marks from user
		
		MarkCalculator markCalculator = new MarkCalculator();	//Construct link to MarkCalculator class
		
		markCalculator.computeMarks(moduleMarkArr);				//Call the computeMarks method from the MarkCalculator class
	}
	
	public static void studentSummary(){						//Method for organising and presenting module marks
		
		StudentChart studentChart = new StudentChart();			//Construct link to StudentChart class
		
		studentChart.draw(moduleMarkArr);						//Call the draw method from the StudentChart class
		studentChart.printSummary(moduleMarkArr);				//Call the printSummary method from the StudentChart class
		
	}
}