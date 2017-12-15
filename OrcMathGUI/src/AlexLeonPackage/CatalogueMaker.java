package AlexLeonPackage;

import java.util.ArrayList;

public class CatalogueMaker {
	
	private static ArrayList<MovieClass> arrlist;
	
	public CatalogueMaker() {
		arrlist = new ArrayList<MovieClass>();
		arrlist.add(new MovieClass("Goodfellas","Martin Scorcese",3));
		arrlist.add(new MovieClass("Mamas House","Tyler Perry",2));
		arrlist.add(new MovieClass("Reservoir Dogs","Quentin Taratino",1));
	}

	public static void main(String[] args) {
		CatalogueMaker c = new CatalogueMaker();
		System.out.println(c.getCSVContent());
	}
	
	public static String getCSVContent() {
		String data = "";
		for(MovieClass m : arrlist) {
			data += "\n" + m;
		}
		return data;
	}

}
