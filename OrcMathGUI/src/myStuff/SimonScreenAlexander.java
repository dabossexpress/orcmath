package myStuff;

import java.util.ArrayList;

import guiTeacher.components.Button;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenAlexander extends ClickableScreen implements Runnable {

	ProgressInterfaceAlexander inter;
	ArrayList<MoveInterfaceAlexander> mylist;
	int roundNum;
	boolean acceptInput;
	final Button b = getAButton();
	b.setAction(new Action() {
		public void act() {
			Thread blink = new Thread (new Runnable(){
				public void run() {
					//code for turning on, sleeping for 800ms and turning back off again goes here.
				}
			});
			blink.start();
		}
	})
	
	public SimonScreenAlexander() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void run() {
		start();
		System.out.println(roundNum);
	}
	
	public void start() {
		
	}
}
