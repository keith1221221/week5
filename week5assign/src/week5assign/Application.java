package week5assign;

public class Application {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		Logger slogger = new SpacedLogger();
		logger.info("Hello");
		logger.warning("STOP");
		slogger.warning("BAM");
		slogger.info("POW");
	}

}
