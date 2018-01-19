package AlexLeonPackage;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Test2Screen extends FullFunctionScreen{

	private int score;
	private int countdown;
	private int startTime;
	private TextLabel scoreBoard;
	private TextLabel clock;
	
	public Test2Screen(int width, int height) {
		super(width, height);
		update();
		score = 0;
		countdown = 5;
		startTime = 3;
	}

	public void initAllObjects(List<Visible> viewObjects) {
		scoreBoard= new TextLabel(100, 400, 200, 100, "Score");
		clock=new TextLabel(100,50,100,100, "Timer");
		
		Test2Button b = new Test2Button(150,150);
		viewObjects.add(scoreBoard);
		viewObjects.add(clock);
		
		Timer t= new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				clock.setText(Integer.toString(startTime));
				if(startTime<=0) {
					Timer t2= new Timer();
					t2.scheduleAtFixedRate(new TimerTask() {
						@Override
						public void run() {
							clock.setText("Go! Time left: " +Integer.toString(countdown));
							b.updateString("Click me!");
							b.setAction(new Action() {
								@Override
								public void act() {
									score++;
									scoreBoard.setText(Integer.toString(score));	
								}	
							});
							if(countdown<=0) {
								gameover();
								t2.cancel();
							}
							countdown--;
						}
						private void gameover() {
							b.setEnabled(false);
							b.updateString("Done");
							scoreBoard.setText("Game Over! you scored "+ Integer.toString(score));	
						}
					}, 0, 1000);
					t.cancel();
				}
				startTime--;
			}
		}, 1000, 1000);{		
		}
		viewObjects.add(b);
	
	}

}