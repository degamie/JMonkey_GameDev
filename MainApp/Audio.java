package MainApp;

public class Audio {//Class Declare
	public float speed=0.0f;	//speed initailize
	public Audio audio;//Audio Obj declare
	public Audio fastForward(float speed,Audio audio) {//fastForward funct declare 
		if(speed==0)return 0;//Base cond
		while(speed!=0) {//Iterating Through speed
		else if(speed>0) {speed+=1.75;}//Checking Speed >0 aND incr 1.75
			else speed=0;}//Speed initial val declare
			return audio.play(speed);//Printing Output
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
