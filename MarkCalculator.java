/* Filename:		MarkCalculator.java
 * Date:			2017-11-09
 * Name:			Senior J.J.
 * Student number:	160474257
 * -------------------------------------------------------
 * By submitting this file electronically, I declare that
 * it is my own original work, and that I have not copied
 * any part of it from another source.
 * -------------------------------------------------------
 * MarkCalculator is a class used to receive exam and
 * coursework marks by user typed input. These marks are
 * used to calculate the student's module marks and stage
 * result.
 * -------------------------------------------------------
 */

import java.util.Scanner;										//Import scanner utility

public class MarkCalculator {									//Class used to receive exam and coursework marks and output module marks and a stage result
	
	static int markArr[] = new int[11];							//Array to receive exam and coursework marks
	public static int moduleMarkArr[] = new int[6];				//Array to hold calculated module marks
	
	public static void main(String[] args) {
		
		computeMarks(moduleMarkArr);
		
		computeResult();
		
	}
	
	public static void computeMarks(int moduleMarkArr[]){		//Method to receive exam and coursework marks and calculate module marks

		int i = 0, j=0;											//Declare counters
		boolean exception = true;								//Declare exception loop handler
		
		int CSC1021Weighting = 50,								//Define module coursework weighting
			CSC1022Weighting = 40,                              //Define module coursework weighting
			CSC1023Weighting = 100,                             //Define module coursework weighting
			CSC1024Weighting = 50,                              //Define module coursework weighting
			CSC1025Weighting = 20,                              //Define module coursework weighting
			CSC1026Weighting = 10;                              //Define module coursework weighting
		
		Scanner keyboardIn = new Scanner(System.in);			//Declare scanner
		
		System.out.print("Enter CSC1021 exam mark:");								//Request mark from user
		while(exception){															//Continue loop while exception is true
			try{
				markArr[i] = keyboardIn.nextInt();									//Attempts to place user input in markArr
				if((markArr[i] >= 0) && (markArr[i] <= 100)){						//Checks that user's integer input is a valid percentage
					exception = false;												//Sets exception to escape top loop
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");		//If input is not a valid percentage, request a valid percentage
				}
			} catch (Exception a) {													//Catch if user enters a string instead of integer
				System.out.print("Please enter an integer from 0 to 100:");			//Request a valid percentage
				keyboardIn.next();													//Ignore string and wait for next input
			}
		}
		
		i++;																		//Move position counter for markArr to next position
		exception = true;															//Reset exception
		
		System.out.print("Enter CSC1021 coursework mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		moduleMarkArr[j] = ((markArr[i-1] * CSC1021Weighting) + (markArr[i-2] * (100 - CSC1021Weighting))) / 100;	//Calculate module mark
		if(((markArr[i-1] > 35) && (markArr[i-2] < 35) || ((markArr[i-1] > 35) && (markArr[i-2] < 35)))){			//If user fails either exam or coursework, set max module mark of 35
			moduleMarkArr[j] = 35;
		}
		j++;																										//Move position counter for moduleMarkArr to next position
		
		System.out.print("Enter CSC1022 exam mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		i++;
		exception = true;
		
		System.out.print("Enter CSC1022 coursework mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		moduleMarkArr[j] = ((markArr[i-1] * CSC1022Weighting) + (markArr[i-2] * (100 - CSC1022Weighting))) / 100;
		if(((markArr[i-1] > 35) && (markArr[i-2] < 35) || ((markArr[i-1] > 35) && (markArr[i-2] < 35)))){
			moduleMarkArr[j] = 35;
		}
		j++;
		
		System.out.print("Enter CSC1023 coursework mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		moduleMarkArr[j] = ((markArr[i-1] * CSC1023Weighting) + (markArr[i-2] * (100 - CSC1023Weighting))) / 100;
		j++;
		
		System.out.print("Enter CSC1024 exam mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		System.out.print("Enter CSC1024 coursework mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		moduleMarkArr[j] = ((markArr[i-1] * CSC1024Weighting) + (markArr[i-2] * (100 - CSC1024Weighting))) / 100;
		if(((markArr[i-1] > 35) && (markArr[i-2] < 35) || ((markArr[i-1] > 35) && (markArr[i-2] < 35)))){
			moduleMarkArr[j] = 35;
		}
		j++;
		
		System.out.print("Enter CSC1025 exam mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		System.out.print("Enter CSC1025 coursework mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		moduleMarkArr[j] = ((markArr[i-1] * CSC1025Weighting) + (markArr[i-2] * (100 - CSC1025Weighting))) / 100;
		if(((markArr[i-1] > 35) && (markArr[i-2] < 35) || ((markArr[i-1] > 35) && (markArr[i-2] < 35)))){
			moduleMarkArr[j] = 35;
		}
		j++;
		
		System.out.print("Enter CSC1026 exam mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		System.out.print("Enter CSC1026 coursework mark:");
		while(exception){
			try{
				markArr[i] = keyboardIn.nextInt();
				if((markArr[i] >= 0) && (markArr[i] <= 100)){
					exception = false;
				}
				if(exception){
					System.out.print("Please enter an integer from 0 to 100:");
				}
			} catch (Exception a) {
				System.out.print("Please enter an integer from 0 to 100:");
				keyboardIn.next();
			}
		}
		
		i++;
		exception = true;
		
		moduleMarkArr[j] = ((markArr[i-1] * CSC1026Weighting) + (markArr[i-2] * (100 - CSC1026Weighting))) / 100;
		if(((markArr[i-1] > 35) && (markArr[i-2] < 35) || ((markArr[i-1] > 35) && (markArr[i-2] < 35)))){
			moduleMarkArr[j] = 35;
		}
		
		keyboardIn.close();										//Close scanner
		System.out.print("\n\n");								//Print blank lines for ease of reading
		

		
	}
	
	public static void computeResult(){							//Method to compute stage result
		
		int stageAverage = 0;
		int markSum = 0;															//Used to calculate stageAverage
		int compCount = 0;															//Count compensatable fails
		int failCount = 0;															//Count fails
		
		for(int j=0; j<6; j++){														//Loop to print list of module marks
			System.out.println("CSC102" + (j+1) + " mark: " + moduleMarkArr[j]);
		}
		
		System.out.println("------------------------------------");					//Print break line for ease of reading
		
		for(int j=0; j<6; j++){														//Loop to calculate sum of module marks
			markSum = markSum + moduleMarkArr[j];
		}
		
		stageAverage = markSum / 6;													//Calculate stage average
		
		for(int j=0; j<6; j++){
			if(moduleMarkArr[j]<35){												//If module mark is less than 35, incriment fail counter
				failCount++;
			}
			if((moduleMarkArr[j] < 40) && (moduleMarkArr[j] >= 35)){				//If module mark is between 40 and 34, incriment compensatable fail counter
				compCount++;
			}
		}
		
		if(moduleMarkArr[1] < 40){													//If core module is below 40, incriment fail counter
			failCount++;
		}
		
		System.out.print("Stage result: ");
		
		if((failCount == 0) && (compCount == 0)){									//If no fails, no compensatable fails, and stage average is at least 40, pass
			System.out.print("Pass");
		} else if((failCount == 0) && (compCount <= 2) && (stageAverage >= 40)){	//If no fails, less than 3 compensatable fails, and stage average is at least 40, pass by compenstaion
			System.out.print("Pass by Compensation");
		} else{																		//If at least one fail, more than 2 compensatable fails, or stage average is less than 40, fail
			System.out.print("Fail");
		}
		
	}
}