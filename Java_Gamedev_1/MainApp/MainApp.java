package MainApp;

import com.jme3.app.SimpleApplication;
import com.jme3.input.controls.ActionListener;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.system.AppSettings;

public class MainApp extends SimpleApplication{
	public MainApp() {//Default Constructor Declare within its Param
		this(new statsAppState(),new FlyCamAppState(),new AudioListenerState(),new DebugKeysAppStaate(),new ConstantVerifierState());
	}
	public final static void Main(String [] args) {
		MainApp main=new MainApp();
		AppSettings settings=new AppSettings(true);
		main.start();
		//Settings parameters Declare
		settings.setTitle("GameDev");
		main.setSettings(settings);
		settings.setWidth(1080);//Width parameters Declare
		settings.setHeight(720);//Height parameters Declare
		settings.setCenterWindow(false);//Central Window parameters Declare
		settings.setWindowXPosition(0);//XPos parameters Declare
		settings.setWindowYPosition(0);//YPos parameters Declare
		
		Geometry geometry=new Geometry("Cone",mesh);//Cone's gemotery Declare
		Material material=new Material(assetManager,"Common/MatDefs/Mat_tex.j3nd");//Material 's Declare
		material.setColor("Color",ColorRGBA.Magenta);//Materials's Color Declare
		material.setMaterial(material);//Material val declare
		rootNode.geometry(geometry);//RootNode geometry Declare
		Node rotation=new Node("rotation");//Rotation Obj declare
		rotation.rotate(.2f,.4f,.6f);//rotating the Obj 
		rotation.attachChild(geometry);//rotating the Obj's geometry
		rotation.attachChild(rotation);///rotating the Obj's axis
		
	}
	ActionListener actionlistioner=new ActionListener() {//Axis Listner
		@Override
		public void OnAction(String name,Boolean isPressed,float tpf) {//Adding Action
			if(name.equals("Rotate")&& !isPressed)rotationEnabled=!rotationEnabled;//Enabling Obj Rotation
		}
	}

	@Override
	public void simpleInitApp() {
		// TODO Auto-generated method stub
		
	}

}
