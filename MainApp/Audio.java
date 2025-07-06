
package MainApp;

public class Audio {//Class Declare
	public Audio audio;//Audio Obj declare
	public Audio(Audio audio) {
		this.audio=audio;
	}
	public String getAudio(Audio audio) {
		return audio;
	}
	public Boolean setAudio(Boolean isAudioPlayable) {//Checking the Audio
		return isAudioPlayable=true;
	}
	public  String playAudio() {//Playing the Audio  
		public audio.play();
	}

}
