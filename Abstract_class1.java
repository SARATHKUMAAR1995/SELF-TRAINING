package Training;

abstract class Mobile {
	abstract void brand();

	void VoiceCall() {
		System.out.println("You can Make Voice Call");
	}

	abstract void camera();

	abstract void touchDisplay();

}

class samsung extends Mobile {
	void brand() {
		System.out.println("Samsung brand");
	}

	void camera() {
		System.out.println("16 Mega Pixel Camera");
	}

	void touchDisplay() {
		System.out.println("5.5 inch Display");
	}
}

class Nokia extends Mobile {
	void brand() {
		System.out.println("Nokia brand");
	}

	void camera() {
		System.out.println("8 Mega Pixel Camera");
	}

	void touchDisplay() {
		System.out.println("5 inch Display");
	}

	void fingerPrint() {
		System.out.println("Fast Finger Sensor..");
	}
}

public class Abstract_class1 {

	public static void main(String[] args) {
		samsung s = new samsung();
		s.brand();
		s.VoiceCall();
		s.touchDisplay();
		s.camera();
		System.out.println("-------------------------");
		Nokia N1 = new Nokia();
		N1.brand();
		N1.VoiceCall();
		N1.camera();
		N1.touchDisplay();
		N1.fingerPrint();

	}

}
