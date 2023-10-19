package oop8;


import lombok.Builder;

@Builder // field 가 많을 떄 쓰면 좋음
public class Human {
    private String name;
    private String birth;
    private boolean gender;
    private double height;
}
