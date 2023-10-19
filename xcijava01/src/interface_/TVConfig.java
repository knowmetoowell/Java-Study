package interface_;


public class TVConfig {

    public SamsungTV samsungTV() {
        return new SamsungTV(speaker());
    }
    public Speaker speaker() {
        return new OrangeSpeaker();
        //return new HarmanSpeaker();
    }
}
