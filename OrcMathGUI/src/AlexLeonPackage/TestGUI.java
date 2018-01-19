package AlexLeonPackage;

import guiTeacher.GUIApplication;

public class TestGUI extends GUIApplication {

	private static TestGUI sample;
	private static TestScreen s;
	
	public TestGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public void initScreen() {
		s = new TestScreen(600,600);
		setScreen(s);
	}

	public static void main(String[] args) {
		sample = new TestGUI(700,700);
		Thread go = new Thread(sample);
		go.start();
	}

}
