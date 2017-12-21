package AlexLeonPackage;

import java.awt.Font;
import java.io.File;

import guiTeacher.GUIApplication;
import guiTeacher.components.StyledComponent;

public class KatherinsGUI extends GUIApplication {

	private static KatherinsGUI sample;
	private static KatsCatalogScreen s;
	private static KatsCatalogScreenInside inside;
	
	public KatherinsGUI(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stu
		try {
			File fontFile = new File("resources/Baumans-Regular.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			Font baseFont=font.deriveFont(16f);
			StyledComponent.setTabFont(baseFont);
		} catch (Exception e) {
			e.printStackTrace();
		}
		KatsCatalogScreen s = new KatsCatalogScreen(getWidth(),getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KatherinsGUI sample = new KatherinsGUI(800,550);
		Thread go = new Thread(sample);
		go.start();
	}

}
