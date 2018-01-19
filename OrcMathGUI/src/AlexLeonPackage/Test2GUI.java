package AlexLeonPackage;

import guiTeacher.GUIApplication;

public class Test2GUI extends GUIApplication {

	public Test2GUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}
	
	public void initScreen() {
		Test2Screen s = new Test2Screen(getWidth(),getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		Test2GUI g = new Test2GUI(600, 600);
		Thread go = new Thread(g);
		go.start();
	}

}
