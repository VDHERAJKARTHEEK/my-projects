package core_java;

public class Ifelsecondition3 {

	String movie;
	public static void main(String[] args) {
		Ifelsecondition3 mv=new Ifelsecondition3();
		//String movie;
		
		mv.movie="hit";
		if (mv.movie=="hit") {//actual result vs expected result,here actual result is stored in movie and expeted is compared with actual.
			System.out.println("movvie is hit");

	}else if (mv.movie == "avg") {
		System.out.println("movie is avg");
	}
	else {
		System.out.println("movie is flop");
	}
		
		switch (mv.movie) {
		case "hit":System.out.println("movie is hit");
		break;
		case "avg": System.out.println("movie is avg");
		break;
	 default:System.out.println("movie is flop");
		}
	}
}
