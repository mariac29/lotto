/*
Lotto.java
26 11 2018
Maria C
*/

import java.lang.Math.*;

public class Lotto{

	//data members
	private int line1[];
	private int line2[];
	private int line3[];

	private int counter1; //counts correct guesses from line1
	private int counter2; //correct guesses from line2
	private int counter3; //correct guesses from line3


	private String message;
	private int rNo[];

	//Constructor
	public Lotto(){
		line1=new int[6];
		line2=new int[6];
		line3=new int[6];

		counter1=0;
		counter2=0;
		counter3=0;

		int rNo[]=new int[6];

		message="";
		for (int i=0;i<6;i++)
		{
			rNo[i]=(int) (Math.random()*40);

		}
	}

	//Setters
	public void setLine1(int line1[]){
		this.line1=line1;
	}

	public void setLine2(int line2[]){
		this.line2=line2;
	}

	public void setLine3(int line3[]){
		this.line3=line3;
	}

	public void compute(){

	}//closes compute



	//Get message
	public String getMessage(){
			return message;


	}
}
