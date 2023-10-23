package generic;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@RequiredArgsConstructor
@Data
public class LombokGenericTest<T> {
    private T t;

}

class test {
    public static void main(String[] args) {
        LombokGenericTest<String> t = new LombokGenericTest<>();
        t.setT("afqf");
        System.out.println(t.getT());
    }
}