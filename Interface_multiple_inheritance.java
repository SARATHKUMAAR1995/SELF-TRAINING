package Training;

class Phone {
	void voiceCall() {
		System.out.println("Make VoiceClass");
	}

	void sms() {
		System.out.println("We Can send SMS");
	}
}

interface Camera {
	void click();

	void record();
}

interface player {
	void play();

	void pause();

	void stop();
}

class SmartPhone extends Phone implements Camera, player {

	public void click() {
		System.out.println("Take a Selfi");
	}

	public void record() {
		System.out.println("Take a video");
	}

	public void play() {
		System.out.println("Play Music");
	}

	public void pause() {
		System.out.println("Pause Music");
	}

	public void stop() {
		System.out.println("Stop Music");
	}
}

public class Interface_multiple_inheritance {

	public static void main(String[] args) {

		SmartPhone o = new SmartPhone();
		o.voiceCall();
		o.sms();
		o.click();
		o.record();
		o.play();
		o.pause();
		o.stop();

	}

}
