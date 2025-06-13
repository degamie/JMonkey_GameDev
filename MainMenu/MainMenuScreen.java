package MainMenu;

import com.jme3.app.SimpleApplication;

import de.lessvoid.nifty.controls.Menu;
import de.lessvoid.nifty.screen.Screen;

public class MainMenuScreen extends GuiNode{}//Inheriting Menu's GuiNode

public class MainMenuScreen extends SimpleApplication {
	Screen screen=new Screen(this);
	GuiNode guinode=new GuiNode(this);
	public class MainMenu extends LevelManagement{//Inheriting LevelManagement class
		public MainMenu mainmenu=new MainMenu();//Obj Declare
	}
	public class MainMenuScreen implements Settings{//Inheriting Settings Interface
		//Methods To  Be Implemented
		@Override 
		public void onPlayAudio(Audio audio){;}//OnPlay Audio
		@Override 
		public String connect(NetwrokInfo networkinfo){;}//Online Social Media's Connection method declare
		@Override 
		public String ScreenDisplay(MainMenuScreen mainmenuscreen){;}//ScreenDisplay Method declare
		@Override 
		public String LevelDisplay(LevelManagement levelmanagement){;}//LevelDisplay methods declare
	}

	public String getGuiNode(GuiNode guiNode) {
		return guiNode;
	}
	public Screen display=new Screen(guiNode);
	public MainMenuScreen(Screen screen,GuiNode guinode,Screen display) {
		this.screen=screen;
		this.display=display;
		this.guiNode=guinode;}
	public  Menu elem1=new Menu(screen,new Vector2(0,0);
	public  Menu elem2=new Menu(screen,new Vector2(0,0);
	public  Menu elem3=new Menu(screen,new Vector2(0,0);
	
	public  Menu elem4=new Menu(screen,new Vector2(0,0);

	public int width=0;public int Height=0;//Height and Width initializing\


	guiNode.addControl(screen);//Adding Screen's Control
//	Menu subElement=new Menu(screen,new Vector2(0,0),
//			false){
				@Override
				public void OnMenuItemClicked(String indx,Object val,Boolean isToggled) {//OnMenuItemClicked Method Declare
					public Menu subElement=new Menu(screen,new Vector2(0,0);//initializing SubElem
					subElement=elem1+elem2+elem3+elem4;//SubElem Declare
					//Adding Screen's Element
					elem1.addMenuItem("Menu Screen 01", null, null);
					elem2.addMenuItem("Menu Screen 02", null, null);
					elem3.addMenuItem("Menu Screen 03", null, null);
					elem4.addMenuItem("Menu Screen 04", null, null);
				screen.addElement(subElement);//inserting Screen's Sub elem
				}
			b.setText("Show Menu");//Showing Menu's Text
	}
			screen.addElement(b);
	public String setMenuScreen(Screen screen) {this.screen=screen;}//Binding Menu's Screen
	public String getMenuScreen(Screen screen) {return screen;}//Fetching  Menu's Screen

	
	public String simpleInitApp(Screen display ,Screen screen,GuiNode guinode,int width,int Height,) {
		 if(screen==null)return null;//Base Cond
		 while(guiNode!=null) {//Iteratting Through Screen's Node
			 if(width==720 && height==1080) {//Inserting(1080*720)'s Screen Display
				 display=screen.addElement(elem1);
				 
			 }
			 if(width==1080 && height==1440) {//Inserting(1440*1080)'s Screen Display
				 display=screen.addElement(elem2);
				 
			 }
			 if(width==1440 && height==2140) {//Inserting(2140*1440)'s Screen Display
				 display=screen.addElement(elem3);
				 
			 }
			 if(width==2140 && height==4200) {//Inserting(4200*2140)'s Screen Display
				 display=screen.addElement(elem4);
				 
			 }
		 }
		 return display;//Printing Display
	}
	}
	
	
//extends SimpleAp