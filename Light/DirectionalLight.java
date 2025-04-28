package Light;

import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

public class DirectionalLight {//DirectionalLight Class Declare
	RootNode rootNode=new RootNode();//Obj Declare
	DirectionalLight sun=new DirectionalLight(sun);//DirectionalLight's Obj Declare
	Vector3 SunDirection=sun.setDirection(new Vector3f(1,0,-2).normalizeLocal());//setDirection Sunlight's Dire
	LightColor lightColor=sun.setColor(ColorRGBA.Orange);//Sun Color Declare
	public String getDirectionalLightColor(LightColor lightColor) {
		return lightColor;
	}
	rootNode.addingLight(sun);//Adding Light to Sun
	public getSunDirection(DirectionalLight sun,sun.normalizeLocal()) {return SunDirection;}//Fething SunDirection
	public DirectionalLight(DirectionalLight sun) {
		this.sun=sun;
	}
}
