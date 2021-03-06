package oop.exam10;

public class SonyTV implements TV {
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("SonyTV : TV를 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("SonyTV : TV를 끕니다.");
	}
	
	public void channelUp() {
		System.out.println("SonyTV : 채널을 오립니다.");
	}
	
	public void channelDown() {
		System.out.println("SonyTV : 채널을 내립니다.");
	}
	
	public void soundUp() {
		if (speaker == null) {
			System.out.println("SonyTV : 소리를 키웁니다.");			
		} else {
			speaker.soundUp();
		}
	}
	
	public void soundDown() {
		if (speaker == null) {
			System.out.println("SonyTV : 소리를 줄입니다.");			
		} else {
			speaker.soundDown();
		}
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
}
