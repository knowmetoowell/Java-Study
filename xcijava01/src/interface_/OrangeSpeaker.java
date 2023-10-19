package interface_;

public class OrangeSpeaker implements Speaker {
    @Override
    public void soundUp() {
        System.out.println("Orange Speaker : 소리를 올립니다.");
    }

    @Override
    public void soundDown() {
        System.out.println("Orange Speaker : 소리를 내립니다..");
    }
}
