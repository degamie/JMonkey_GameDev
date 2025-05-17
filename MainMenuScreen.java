package MainMenu;

import com.jme3.app.SimpleApplication;

import de.lessvoid.nifty.controls.Menu;
import de.lessvoid.nifty.screen.Screen;

public class MainMenuScreen extends SimpleApplication {
	Screen screen=new Screen(this);
	GuiNode guinode=new GuiNode(this);
	public Screen display=new Screen(guiNode);
	public  Menu elem1=new Menu(screen,new Vector2(0,0);
	public  Menu elem2=new Menu(screen,new Vector2(0,0);
	public  Menu elem3=new Menu(screen,new Vector2(0,0);
	
	public  Menu elem4=new Menu(screen,new Vector2(0,0);
}
	public int width=0;public int Height=0;

	guiNode.addControl(screen);
//	Menu subElement=new Menu(screen,new Vector2(0,0),
//			false){
				@Override
				public void OnMenuItemClicked(String indx,Object val,Boolean isToggled) {
					public Menu subElement=new Menu(screen,new Vector2(0,0);
					subElement=elem1+elem2+elem3+elem4;
					elem1.addMenuItem("Menu Screen 01", null, null);
					elem2.addMenuItem("Menu Screen 02", null, null);
					elem3.addMenuItem("Menu Screen 03", null, null);
					elem4.addMenuItem("Menu Screen 04", null, null);
				screen.addElement(subElement);
				}
			b.setText("Show Menu");
	}
			screen.addElement(b);
	public String getMenuScreen(Screen screen) {
		return screen;
	}

	public String simpleInitApp(Screen display ,Screen screen,GuiNode guinode,int width,int Height,) {
		 if(screen==null)return null;
		 while(guiNode!=null) {
			 if(width==720 && height==1080) {
				 display=screen.addElement(elem1);
				 
			 }
			 if(width==1080 && height==1440) {
				 display=screen.addElement(elem2);
				 
			 }
			 if(width==1440 && height==2140) {
				 display=screen.addElement(elem3);
				 
			 }
			 if(width==2140 && height==4200) {
				 display=screen.addElement(elem4);
				 
			 }
		 }
		 return display;
	
		
	}
//extends SimpleAp