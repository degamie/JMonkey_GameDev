package MainApp;

import com.jme3.scene.plugins.ogre.SceneLoader;

public class ScenePerformer extends MainApp {
	ScenePerformer( SceneLoader scenePerformer){
		this.scenePerformer=scenePerformer;
	}
	public SceneLoader scenePerformer=new SceneLoader();
	public void setScenePerformer(SceneLoader scenePerformer) {this.scenePerformer=scenePerformer;}//Binding ScenePerformer

	public String getScenePerformer(SceneLoader scenePerformer) {
		return scenePerformer;
	}

}
