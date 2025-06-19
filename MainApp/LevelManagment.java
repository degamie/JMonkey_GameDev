package MainApp;

import java.util.ArrayList;

import com.jme3.app.SimpleApplication;

public class LevelManagment extends SimpleApplication {
	public final Node rootNode;
	public Node localRootNode;
	public void setLocalRootNode(LocalRootNode localRootNode) {
		this.localRoot=localRoot;//binding localRoot Node
	}
	public void setRootNode(Node rootNode) {this.rootNode=rootNode;}//Binding rootNode inLvl
	public String getRootNode(Node rootNode) {return rootNode;}//Fetching rootNode
	public void LevelManagment(ArrayList<Integer>lvlMngmt,int lvl) {
		int lvl=0;
	lvlMngmt=new ArrayList<>();
	lvlMngmt.add(lvel1);
	lvlMngmt.add(lvel2);
	lvlMngmt.add(lvel3);
	lvlMngmt.add(lvel4);
	lvlMngmt.add(lvel5);
	lvlMngmt.get(lvl).load();
	}
	public void setLocalRootNode(Node localRootNode)return localRootNode;
	public Integer OnLevelStart(int lvl,ArrayList<Integer>lvlMngmt) {//OnLvlStart() method declare
		if(lvl==0)return 0;//Base Cond 
		while(lvl!=0) {//Iterating Through Lvl
			if(lvl>0) {//Checking Lvl >0
				lvl+=LevelManagment(lvlMngmt,lvl);//Incr LVl To Callable LevelManagment Method
				lvl=lvlMngmt.get(lvl).play(1);//Playing Level
			}
			else lvl=0;//Initial Level Declare
		}return lvl;//Printing Lvl
	}
	
	public String setLvel(int lvl) {//binding Level
		this.lvl=lvl;
	}
	public String getLvel(ArrayList<LevelManagingClass>lvlMngmt,int lvl) {
		return "Level:"+lvlMngmt+lvl;
	}
	public String initialize(AppState manager,Application app) {
		super.initialize(Statemanager app);
		rootNode.attachChild(localRootNode);
	}
}
