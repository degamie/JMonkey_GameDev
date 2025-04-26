package MainApp;

import com.jme3.app.SimpleApplication;

public class LevelManagment extends SimpleApplication {
	public final Node rootNode;
	public Node localRootNode;
	
	ArrayList<LevelManagingClass>lvlMngmt=new ArrayList<>();
	lvlMngmt.add(lvel1);
	lvlMngmt.add(lvel2);
	lvlMngmt.add(lvel3);
	lvlMngmt.add(lvel4);
	lvlMngmt.add(lvel5);
	int lvl=0;
	lvlMngmt.get(lvl).load();
	public String getLvel(ArrayList<LevelManagingClass>lvlMngmt,int lvl) {
		return "Level:"+lvlMngmt+lvl;
	}
	public String initialize(AppState manager,Application app) {
		super.initialize(Statemanager app);
		rootNode.attachChild(localRootNode);
	}
}
