
public class mozilla extends Thread {
	
	public void run() {
		String browser = "mozilla";
		crossBrowser obj = new crossBrowser();
		try {
			obj.method(browser);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
