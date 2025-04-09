package MainApp;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;

public class ModeRenderer {//ModeRenderer Class declare
	AssetManager assetManager=new AssetManager();//AssetManager obj declare
	Spatial spatial=assetManager.loadModel("Models/home.j3e"); //Loading Model 
	Material mat=new Material(assetManager,"Lighting.j3d");//Material Obj declare
	mat.setBoolean("UserMaterial Colors",true);//Setting Boolean Expression
	mat.setColor("Ambient"ColorRGBA.Blue);//Setting The Material's Col
	mat.setColor("Diffuse",ColorRGBA.Blue);//Diffusing Material
	spatial.setMaterial(mat);//Spatial's Material  set declare

}
