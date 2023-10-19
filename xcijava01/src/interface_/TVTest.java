package interface_;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TVTest {
    public static void main(String[] args) {
//        TV tv = new HyundaiTV();
//        tv.powerOn();
//        tv.channelUp();
//        tv.channelUp();
//        tv.soundUp();
//        tv.powerOff();

        Properties pr = new Properties();
        try {
            pr.load(new FileInputStream("src/interface_/product.properties"));
            String tvClass = pr.getProperty("tv");
            String speakerClass = pr.getProperty("speaker");
            Class tvClazz = Class.forName(tvClass);
            Class speakerClazz = Class.forName(speakerClass);
            TV tv = (TV) tvClazz.getConstructor(null).newInstance();
            Speaker speaker = (Speaker) speakerClazz.getConstructor(null).newInstance();
            //tv.setSpeaker(speaker); -> SamsungTV에 셋스피커 안만들어서 난 안됨 그냥 밑에꺼로 ㄱㄱ
            tv.powerOn();
            tv.channelUp();
            tv.channelUp();
            tv.soundUp();
            tv.powerOff();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        TVConfig tvConfig = new TVConfig();
        TV tv2 = tvConfig.samsungTV();
        tv2.powerOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.soundUp();
        tv2.powerOff();
    }
}
