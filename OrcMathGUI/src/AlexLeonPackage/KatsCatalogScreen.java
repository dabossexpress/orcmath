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
	private Graphic tree;
	
	public KatsCatalogScreen(int width, int height) {
		super(width, height);
	}
	
	public void initAllObjects(List<Visible> viewObjects) {
		tree = new Graphic(0,0,getWidth(),getHeight(),"resources/christmasTree.jpg");
		viewObjects.add(tree);
		try {
			//			File fontFile = new File("resources//AdventPro-Medium.ttf");
			File fontFile = new File("resources\\Risque-Regular.ttf");
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
				KatherinsGUI.sample.setScreen(KatherinsGUI.inside); 
			}
		});
		for(int i = 0; i < 28; i++){
			viewObjects.add(new Hats(getWidth(), getHeight()));
		}
		viewObjects.add(b);
	}

}