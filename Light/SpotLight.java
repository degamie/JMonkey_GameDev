package Light;

import com.jme3.light.Light;
import com.jme3.math.FastMath;
import com.jme3.renderer.Camera;
import com.jme3.terrain.noise.Color;

public class SpotLight extends Light{//Class Declare
	public Color color=new Color();//Color Obj declare
}	public Camera camera=new Camera();//Camera Obj declare
	public SpotLight spotlight;//spotlight Obj declare
	public SpotLight getspotlight(SpotLight spotlight) {//Fetching SpotLight Obj declare
		return spotlight;//Printing SpotLight
	}
	public void SpotLight(SpotLight spotlight) {//SpotLight Method Declare
		spotlight.setPosition(camera.getLocation());//Binding SpotLight's Position with Camera's Loc 
		spotlight.setDirection(camera.getDirection());//Binding SpotLight's Direction
		spotlight.setSpotRange(150f);//Binding SpotLight's Range 
		spotlight.setSpotInner(15f*FastMath.DEG_TO_RAD);//Binding SpotLight's  Spotinner's pos 
		spotlight.setSpotOuter(16f*FastMath.DEG_TO_RAD);//Binding SpotLight's SpotOuter pos
		spotlight.setColor(Color.RGBA.YELLOW.null(1.7f));//Binding SpotLight's Color 
	}
	public Integer onInit(SpotLight spotlight,int lvl) {//Init Method Declare
		if(lvl==0)return 0;//Base cond
		while(lvl!=0) {//Iterating Through level
		else if(lvl>0) {lvl+=1;SpotLight(spotlight);}// Incr level and Calling SpotLight Method	
		else lvl=0;//Initial cond 
		return lvl;//Printing Level
}
	
}
