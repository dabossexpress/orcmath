package myStuff;

import javax.swing.JFrame;

import guiTeacher.GUIApplication;

public class SimonGameAlexander extends GUIApplication{

	public SimonGameAlexander(int width, int height) {
		super(width,height);
		setVisible(true);
		scaleWithWindow = true;
		setBounds(20, 20, width, height);
		initScreen();
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame = this;
		addComponentListener(this);
	}

	public static void main(String[] args) {
		SimonScreenAlexander s = new SimonScreenAlexander();
	}
	
	public void initScreen() {
		
	}

}
