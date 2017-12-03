/* Filename:		StudentChart.java
 * Date:			2017-11-09
 * Name:			Senior J.J.
 * Student number:	160474257
 * -------------------------------------------------------
 * By submitting this file electronically, I declare that
 * it is my own original work, and that I have not copied
 * any part of it from another source.
 * -------------------------------------------------------
 * StudentChart is a class used by Summary.java to create
 * a colour coded bar graph of a students module marks.
 * It is also able to print an aligned table of their
 * marks.
 * 
 * It requires the Bar.java file and the shapes library
 * to run correctly.
 * -------------------------------------------------------
 */

public class StudentChart {																//Class used to organise and present module marks
	
	static void draw(int moduleMarkArr[]){												//Method for drawing bar chart of given module marks

		Bar xAxis = new Bar();															//Declare new bar
		Bar yAxis = new Bar();                                              			//Declare new bar
		Bar CSC1021 = new Bar();                                            			//Declare new bar
		Bar CSC1022 = new Bar();                                            			//Declare new bar
		Bar CSC1023 = new Bar();                                            			//Declare new bar
		Bar CSC1024 = new Bar();                                            			//Declare new bar
		Bar CSC1025 = new Bar();                                            			//Declare new bar
		Bar CSC1026 = new Bar();                                            			//Declare new bar

		xAxis.makeVisible();															//Show bars on canvas
		yAxis.makeVisible();                                                			//Show bars on canvas
		CSC1021.makeVisible();                                              			//Show bars on canvas
		CSC1022.makeVisible();                                              			//Show bars on canvas
		CSC1023.makeVisible();                                              			//Show bars on canvas
		CSC1024.makeVisible();                                              			//Show bars on canvas
		CSC1025.makeVisible();                                              			//Show bars on canvas
		CSC1026.makeVisible();                                              			//Show bars on canvas
		
		int CSC1021height = moduleMarkArr[0]*2;											//Calculate bar height
		int CSC1022height = moduleMarkArr[1]*2;                             			//Calculate bar height
		int CSC1023height = moduleMarkArr[2]*2;                             			//Calculate bar height
		int CSC1024height = moduleMarkArr[3]*2;                             			//Calculate bar height
		int CSC1025height = moduleMarkArr[4]*2;                             			//Calculate bar height
		int CSC1026height = moduleMarkArr[5]*2;                             			//Calculate bar height
		
		xAxis.changeSize(260, 2);														//Define bar size
		yAxis.changeSize(2, 230);                                           			//Define bar size
		CSC1021.changeSize(10, CSC1021height);                              			//Define bar size
		CSC1022.changeSize(10, CSC1022height);                              			//Define bar size
		CSC1023.changeSize(10, CSC1023height);                              			//Define bar size
		CSC1024.changeSize(10, CSC1024height);                              			//Define bar size
		CSC1025.changeSize(10, CSC1025height);                              			//Define bar size
		CSC1026.changeSize(10, CSC1026height);                              			//Define bar size
		
		
		
		xAxis.changeColour(Colour.BLACK);												//Set axis colour to black
		yAxis.changeColour(Colour.BLACK);												//Set axis colour to black
		
		
		if(moduleMarkArr[0] >= 70){														//Define CSC1021 bar colour
			CSC1021.changeColour(Colour.MAGENTA);										//If first class module mark set bar colour to magenta
		} else if (moduleMarkArr[0] >= 40){
			CSC1021.changeColour(Colour.GREEN);											//If pass module mark set bar colour to green
		} else if (moduleMarkArr[0] < 40 && moduleMarkArr[0] >= 35){
			CSC1021.changeColour(Colour.YELLOW);										//If compensatable fail module mark set bar colour to yellow
		} else{
			CSC1021.changeColour(Colour.RED);											//If fail module mark set bar colour to red
		}
		
		if(moduleMarkArr[1] >= 70){														//Define CSC1022 bar colour
			CSC1022.changeColour(Colour.MAGENTA);
		} else if (moduleMarkArr[1] >= 40){
			CSC1022.changeColour(Colour.GREEN);
		} else{
			CSC1022.changeColour(Colour.RED);
		}
		
		if(moduleMarkArr[2] >= 70){														//Define CSC1023 bar colour
			CSC1023.changeColour(Colour.MAGENTA);
		} else if (moduleMarkArr[2] >= 40){
			CSC1023.changeColour(Colour.GREEN);
		} else if (moduleMarkArr[2] < 40 && moduleMarkArr[2] >= 35){
			CSC1023.changeColour(Colour.YELLOW);
		} else{
			CSC1023.changeColour(Colour.RED);
		}
		
		if(moduleMarkArr[3] >= 70){														//Define CSC1024 bar colour
			CSC1024.changeColour(Colour.MAGENTA);
		} else if (moduleMarkArr[3] >= 40){
			CSC1024.changeColour(Colour.GREEN);
		} else if (moduleMarkArr[3] < 40 && moduleMarkArr[3] >= 35){
			CSC1024.changeColour(Colour.YELLOW);
		} else{
			CSC1024.changeColour(Colour.RED);
		}
		
		if(moduleMarkArr[4] >= 70){														//Define CSC1025 bar colour
			CSC1025.changeColour(Colour.MAGENTA);
		} else if (moduleMarkArr[4] >= 40){
			CSC1025.changeColour(Colour.GREEN);
		} else if (moduleMarkArr[4] < 40 && moduleMarkArr[4] >= 35){
			CSC1025.changeColour(Colour.YELLOW);
		} else{
			CSC1025.changeColour(Colour.RED);
		}
		
		if(moduleMarkArr[5] >= 70){														//Define CSC1026 bar colour
			CSC1026.changeColour(Colour.MAGENTA);
		} else if (moduleMarkArr[5] >= 40){
			CSC1026.changeColour(Colour.GREEN);
		} else if (moduleMarkArr[5] < 40 && moduleMarkArr[5] >= 35){
			CSC1026.changeColour(Colour.YELLOW);
		} else{
			CSC1026.changeColour(Colour.RED);
		}
		
		int CSC1021move = (200 - moduleMarkArr[0]*2);									//Calculate required bar alingnment drop
		int CSC1022move = (200 - moduleMarkArr[1]*2);                       			//Calculate required bar alingnment drop
		int CSC1023move = (200 - moduleMarkArr[2]*2);                       			//Calculate required bar alingnment drop
		int CSC1024move = (200 - moduleMarkArr[3]*2);                       			//Calculate required bar alingnment drop
		int CSC1025move = (200 - moduleMarkArr[4]*2);                       			//Calculate required bar alingnment drop
		int CSC1026move = (200 - moduleMarkArr[5]*2);                       			//Calculate required bar alingnment drop

		xAxis.moveVertical(200);														//Set bar vertical position
		yAxis.moveVertical(-30);                                            			//Set bar vertical position
		CSC1021.moveVertical(CSC1021move);                                  			//Set bar vertical position
		CSC1022.moveVertical(CSC1022move);                                  			//Set bar vertical position
		CSC1023.moveVertical(CSC1023move);                                  			//Set bar vertical position
		CSC1024.moveVertical(CSC1024move);                                  			//Set bar vertical position
		CSC1025.moveVertical(CSC1025move);                                  			//Set bar vertical position
		CSC1026.moveVertical(CSC1026move);                                  			//Set bar vertical position
		
		xAxis.moveHorizontal(-40);														//Set bar horizontal position
		yAxis.moveHorizontal(-40);                                          			//Set bar horizontal position
		CSC1021.moveHorizontal(0);                                          			//Set bar horizontal position
		CSC1022.moveHorizontal(40);                                         			//Set bar horizontal position
		CSC1023.moveHorizontal(80);                                         			//Set bar horizontal position
		CSC1024.moveHorizontal(120);                                        			//Set bar horizontal position
		CSC1025.moveHorizontal(160);                                        			//Set bar horizontal position
		CSC1026.moveHorizontal(200);                                        			//Set bar horizontal position
		
	}

	public static void printSummary(int moduleMarkArr[]){								//Method for printing table of module marks
		for(int j=0; j<6; j++){
			System.out.format("CSC102" + (j+1) + " mark: %3s\n", moduleMarkArr[j]);		//Print aligned table of module marks
		}
	}
}