package oops2;

class Phone{
	public void voiceCall() {
		System.out.println("Voice calling with Phone");
	}
}
class SmartPhone extends Phone{
	public void videoCall() {
		System.out.println("Video calling with SmartPhone");
	}
}
class Communication{
	public void call(Phone p) {
		p.voiceCall();
	}
	public void call(SmartPhone sm) {
		sm.videoCall();
	}
}
public class CompileTimepolymorphism {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		SmartPhone sp = new SmartPhone();
		Phone p2 = new SmartPhone();
		
		Communication comm = new Communication();
		comm.call(p1);
		comm.call(sp);
		comm.call(p2);
	}
}

