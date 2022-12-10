package week5assign;

public class SpacedLogger implements Logger {

	@Override
	public void info(String info) {
		char [] charArr = info.toCharArray();
		StringBuilder builder1 = new StringBuilder();
		for ( char char1 : charArr) {
			builder1.append(char1).append(" ");
		}
			
			System.out.println(builder1);
		
	}

	@Override
	public void warning(String warning) {
		char [] charArr = warning.toCharArray();
	StringBuilder builder = new StringBuilder();
	for ( char char1 : charArr) {
		builder.append(char1).append(" ");
	}
		
		System.out.println("ERROR: " + builder);

		
	}

}
