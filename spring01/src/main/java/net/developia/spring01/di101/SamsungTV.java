package net.developia.spring01.di101;


public class SamsungTV implements TV {
    private Speaker speaker;

    public void setSpeaker(Speaker speaker) {
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
        speaker.soundUp();
    }

    @Override
    public void soundDown() {
        speaker.soundDown();
    }
}

