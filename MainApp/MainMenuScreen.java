package MainMenu;

import com.jme3.app.SimpleApplication;

import de.lessvoid.nifty.controls.Menu;
import de.lessvoid.nifty.screen.Screen;

public class MainMenuScreen extends SimpleApplication {
	Screen screen=new Screen(this);
	GuiNode guinode=new GuiNode(this);
	guiNode.addControl(screen);
	Menu subElement=new Menu(screen,new Vector2(0,0),
			false){
				@Override
				public void OnMenuItemClicked(String indx,Object val,Boolean isToggled) {
					subElement.addMenuItem("Menu Screen 01", null, null);
					subElement.addMenuItem("Menu Screen 02", null, null);
					subElement.addMenuItem("Menu Screen 03", null, null);
					subElement.addMenuItem("Menu Screen 04", null, null);
				screen.addElement(subElement);
				}
			b.setText("Show Menu");
	}
			screen.addElement(b);
	public String getScreen(Screen screen,String indx) {
		return screen.saveAll(indx);
	}

	@Override
	public void simpleInitApp() {
		// TODO Auto-generated method stub
		
	}}
public class MainMenuScreen extends MainApp implements numMulDiv{
	public MainMenuScreen mainmenuscreen=new MainMenuScreen();
}
//extends SimpleAp