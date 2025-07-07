package Light;

public class DirectionalLight {//DirectionalLight Class Declare
	RootNode rootNode=new RootNode();//Obj Declare
	DirectionalLight sun=new DirectionalLight(rootNode, sun);//DirectionalLight's Obj Declare
	DirectionalLight(RootNode rootNode,DirectionalLight sun){//param Constructor
		this.rootNode=rootNode;
		this.sun=sun;
	}
	
	sun.setDirection(new Vector3f(1,0,-2).normalizeLocal());//setDirection Sunlight's Dire
	//Implemented(07/07/2025)
	sun.getColor(ColorRGBA.Yellow);//Sun Color's Fetch
	
	sun.setColor(ColorRGBA.Orange);//Sun Color Declare

	rootNode.addingLight(sun);//Adding Light to Sun
	
	
}
