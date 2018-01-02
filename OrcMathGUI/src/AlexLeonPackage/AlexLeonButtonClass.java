package AlexLeonPackage;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Button;

public class AlexLeonButtonClass extends Button implements CustomLabel {

	private String s1;
	private String s2;
	private Color color;
	
	public AlexLeonButtonClass(int x, int y) {
		super(x,y,100,50,null,null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void update(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.drawString("SAVE", 0, 0);
		g.drawString("ENTER", 30, 30);
		g.drawRect(0, 0, 100, 100);
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		g.fillRoundRect(0, 0, getWidth(), getHeight(), curveX, curveY);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, curveX, curveY);
	}

	@Override
	public void updateString1(String string) {
		this.s1 = string;
	}

	@Override
	public void updateString2(String string) {
		this.s2 = string;
	}

	@Override
	public void setIconColor(Color color) {
		this.color = color;
	}
}
