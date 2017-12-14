package AlexLeonPackage;

import java.awt.Color;

public class AlexLeonComponentClass extends ComponentContainer {

	public AlexLeonComponentClass() {
		// TODO Auto-generated constructor stub
		super(40,40);
		g = new AlexLeonComponentClass();
		g.setColor(Color.WHITE);
		ComponentContainer.update();
		g.drawRect(0,0,getWidth(),getHeight);
		viewObjects.add(g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public update() {
		
	}
}
