package interface_;

public class SamsungTV implements TV {

    private Speaker speaker;

    public SamsungTV(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void powerOn() {
        System.out.println("SamsungTV : 전원을 켭니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("SamsungTV : 전원을 끕니다.");
    }

    @Override
    public void channelUp() {
        System.out.println("SamsungTV : 채널 올립니다.");
    }

    @Override
    public void channelDown() {
        System.out.println("SamsungTV : 채널 내립니다.");
    }

    @Override
    public void soundUp() {
        if (speaker == null) {
            System.out.println("SamsungTV : 소리를 올립니다.");
        } else {
            speaker.soundUp();
        }
    }

    @Override
    public void soundDown() {
        if (speaker == null) {
            System.out.println("SamsungTV : 소리를 내립니다.");
        } else {
            speaker.soundDown();
        }
    }
}
