package MainApp;

import com.jme3.app.SimpleApplication;
import com.jme3.system.AppSettings;

public class MainApp extends SimpleApplication{
	public final static void Main(String [] args) {
		MainApp main=new MainApp();
		AppSettings settings=new AppSettings(true);
		settings.setTitle("GameDev");
		main.setSettings(settings);
		main.start();
	}

	@Override
	public void simpleInitApp() {
		// TODO Auto-generated method stub
		
	}

}
