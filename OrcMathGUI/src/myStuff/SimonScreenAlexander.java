package myStuff;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.interfaces.Visible;
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
	});
	
	public SimonScreenAlexander() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void run(SimonScreenAlexander.this) {
		//start();
		//Thread.go();
		long updateTime;
		long timeAfterUpdate;
		while(true){
			updateTime = System.currentTimeMillis();
			currentScreen.update();
			repaint();
			timeAfterUpdate = 30-(System.currentTimeMillis()-updateTime);
			try {
				if(timeAfterUpdate > 0)
				Thread.sleep(timeAfterUpdate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void start() {
		void placeButton();
		void selectButtonShape();
		void selectColor();
		void highlightButtonClicked();
		void putPatternIntoArrList();
		void isPlayerCorrect();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}
}
