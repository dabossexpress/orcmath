package AlexLeonPackage;

import java.util.List;

import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
	private TextField descriptionField;
	//new textField = "";
	
	private static final long serialVersionUID = 258186143576427947L;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionField = new TextField(40,40,200,30,"Text goes here","movieTITLE");
		viewObjects.add(descriptionField);
	}

}
