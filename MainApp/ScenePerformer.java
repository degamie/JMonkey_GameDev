package MainApp;

import com.jme3.scene.plugins.ogre.SceneLoader;

public class ScenePerformer extends MainApp {
	public SceneLoader scenePerformer=new SceneLoader();
	public ScenePerformer(SceneLoader scenePerformer) {
		this.scenePerformer=scenePerformer;
	}
	public void setScenePerformer(SceneLoader scenePerformer) {this.scenePerformer=scenePerformer;}//Binding ScenePerformer

	public String getScenePerformer(SceneLoader scenePerformer) {
		return scenePerformer;
	}

	

}
