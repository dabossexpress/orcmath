package AlexLeonPackage;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.StyledComponent;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class KatsCatalogScreen extends FullFunctionScreen {

	private Button b;
	private Graphic stan;
	
	public KatsCatalogScreen(int width, int height) {
		super(width, height);
	}
	
	public void initAllObjects(List<Visible> viewObjects) {
		try {
			//			File fontFile = new File("resources//AdventPro-Medium.ttf");
			File fontFile = new File("resources//Risque-Regular.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			Font baseFont=font.deriveFont(16f);
			StyledComponent.setTabFont(baseFont);
		} catch (Exception e) {
			e.printStackTrace();
		}
		b = new Button(40, 40, 75, 75, "Click here Katherin", Color.RED, new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		}) {
			
		};
		viewObjects.add(b);
		stan = new Graphic(100,100,"resources/stanHat.jpg");
		viewObjects.add(stan);
	}

}