package core_java;

public class Days {

    String Days;

	public static void main(String[] args) {
	Days da=new Days();
	
        da.Days="mon";
        if ( da.Days=="mon") {
        System.out.println("Days is equal to monday");
	}
        else if (da.Days=="tue") {
        	System.out.println("Days is equal to tuesday");
        	
        }
        else if (da.Days=="wed") {
        	System.out.println("Days is equal to wednesday ");
	}
	else if (da.Days=="thus") {
		System.out.println("Days is equal to thusday ");
	
	} 
	else if (da.Days=="fri") {
		System.out.println("Days is equal to friday");
	}
	else if (da.Days=="sat") {
		System.out.println("Days is equal to saturday");
	}
	else {
		System.out.println("Days is equal to sunday");
	}
        switch(da.Days) {
        case "mon":System.out.println("Days is equal to monday");
        break;
        case "tue":System.out.println("Days is equal to tuesday");
        break;
        case "wed":System.out.println("Days is equal to wednesday");
        break;
        case"thus":System.out.println("Days is equal to thusday");
        break;
        case"fri":System.out.println("Days is equal to friday");
        break;
        case"sat":System.out.println("Days is equal to saturday");
        break;
        default:System.out.println("Days is equal to sunday");
        
	}
}
}