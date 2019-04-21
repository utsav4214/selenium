
public class edge extends Thread {

	public void run() {
		String browser = "edge";
		crossBrowser obj = new crossBrowser();
		try {
			obj.method(browser);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
