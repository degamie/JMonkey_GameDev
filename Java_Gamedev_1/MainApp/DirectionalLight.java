package Light;

public class DirectionalLight {//DirectionalLight Class Declare
	RootNode rootNode=new RootNode();//Obj Declare
	DirectionalLight sun=new DirectionalLight();//DirectionalLight's Obj Declare
	sun.setDirection(new Vector3f(1,0,-2).normalizeLocal());//setDirection Sunlight's Dire
	sun.setColor(ColorRGBA.Orange);//Sun Color Declare
	rootNode.addingLight(sun);//Adding Light to Sun
}
