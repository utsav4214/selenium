
public class chrome extends Thread {

	public void run() {
		String browser = "chrome";
		crossBrowser obj = new crossBrowser();
		try {
			obj.method(browser);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
