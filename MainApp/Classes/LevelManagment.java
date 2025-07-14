package MainApp;

import com.jme3.app.SimpleApplication;

public class LevelManagment extends SimpleApplication {
	ArrayList<LevelManagingClass>lvlMngmt=new ArrayList<>();
	lvlMngmt.add(lvel1);
	lvlMngmt.add(lvel2);
	lvlMngmt.add(lvel3);
	lvlMngmt.add(lvel4);
	lvlMngmt.add(lvel5);
	public final Node rootNode;
	public String getrootNode(Node rootNode) {
		return lvlMngmt.saveAll(rootNode);//rootNode's Fetching
	}
	public Node localRootNode;
	public String setLocalRootNode(ArrayList<LevelManagingClass>lvlMngmt,Node localrootNode){
		return lvlMngmt.findAll(localrootNode);//binding LocalRootNode in Level
	}
	public String getLocalRootNOde(ArrayList<LevelManagingClass>lvlMngmt,Node localrootNode) {
		return lvlMngmt.saveAll(localrootNode);
	}
	
	LevelvManagment (Node rootNode,Node localRootNode,ArrayList<LevelManagingClass>lvlMngmt,int lvl){
//Param Constr
		this.rootNode=rootNode;//Binding RootNode
	this.localrootNode=localrootNode;//LocalRootNode Binding
	this.lvlMngmt=lvlMngmt;//LvlMngmt Binding
	this.lvl=lvl;//Binding lvl
	}

	int lvl=0;
	lvlMngmt.get(lvl).load();
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
