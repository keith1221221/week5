package week5assign;

import java.util.Date;

public class AsteriskLogger implements Logger {

	@Override
	public void info(String info) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString() + "  ***" + info + "***");
	}

	@Override
	public void warning(String error) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println( "*********************************");
		System.out.println("********** ERROR:"+ error + " ***********");
		System.out.println("*********************************");
	}

}
