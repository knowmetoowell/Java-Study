package interface_;

public class HyundaiTV implements TV{


    @Override
    public void powerOn() {
        System.out.println("HyundaiTV : 전원을 켭니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("HyundaiTV : 전원을 끕니다.");
    }

    @Override
    public void channelUp() {
        System.out.println("HyundaiTV : 채널 올립니다.");
    }

    @Override
    public void channelDown() {
        System.out.println("HyundaiTV : 채널 내립니다.");
    }

    @Override
    public void soundUp() {
        System.out.println("HyundaiTV : 소리를 올립니다.");
    }

    @Override
    public void soundDown() {
        System.out.println("HyundaiTV : 소리를 내립니다.");
    }
}
