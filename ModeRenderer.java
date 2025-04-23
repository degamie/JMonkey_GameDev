package MainApp;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Spatial;

public class ModeRenderer {//ModeRenderer Class declare
	AssetManager assetManager=new AssetManager();//AssetManager obj declare
	Spatial spatial=assetManager.loadModel("Models/home.j3e"); //Loading Model 
	Material mat=new Material(assetManager,"Lighting.j3d");//Material Obj declare
	public String getSpatial(Spatial spatial) {//fetching spatial
		return spatial;//Printing spatial
	}
	public String getModel(Model model) {//fetching Model
		return model;//Printing Model
	}
	public String getMaterial(Material mat) {//fetching Material
		return mat;
	}

	mat.setBoolean("UserMaterial Colors",true);//Setting Boolean Expression
	ColorRGBA BlueColor=mat.setColor("Ambient"ColorRGBA.Blue);//Setting The Material's Col
	mat.setColor("Diffuse",ColorRGBA.Blue);//Diffusing Material
	spatial.setMaterial(mat);//Spatial's Material  set declare
	public String getBlueColor(ColorRGBA BlueColor) {//Fetching BlueColor 
		return BlueColor;
	}

}
