package MainApp;

import com.jme3.app.SimpleApplication;

public class LevelManagment extends SimpleApplication {
	ArrayList<LevelManagingClass>lvlMngmt=new ArrayList<>();
	lvlMngmt.add(lvel1);
	lvlMngmt.add(lvel2);
	lvlMngmt.add(lvel3);
	lvlMngmt.add(lvel4);
	lvlMngmt.add(lvel5);
	int lvl=0;
	lvlMngmt.get(lvl).load();
}
