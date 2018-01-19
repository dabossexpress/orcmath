package AlexLeonPackage;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class TestScreen extends FullFunctionScreen {

	private Button b1;
	private Button b2;
	private TextArea ta1;
	private TextArea ta2;
	private Action action;
	
	public TestScreen(int width, int height) {
		super(width, height);
	}

	public void initAllObjects(List<Visible> viewObjects) {
		ta1 = new TextArea(200, 200, 100, 100, "You win");
		ta2 = new TextArea(300, 300, 100, 100, "You lose");
		b1 = new Button(200, 200, 100, 100, "Win", Color.CYAN, new Action() {
			public void act() {
				viewObjects.add(ta1);
				b1.setAction(null);
				b2.setAction(null);
			}
		});
		viewObjects.add(b1);
		b2 = new Button(300, 300, 200, 200, "Lose", Color.CYAN, new Action() {
			public void act() {
				viewObjects.add(ta2);
				b1.setAction(null);
				b2.setAction(null);
			}
		});
		viewObjects.add(b2);
	}

}
