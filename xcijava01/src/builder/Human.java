package builder;


import lombok.Builder;

@Builder // field 가 많을 떄 쓰면 좋음
public class Human {
    private String name;
    private String birth;
    private boolean gender;
    private double height;


    //@Builder 쓰면 아래코드 자동생성됨 (class 파일에서 복붙함)
    /*
    Human(String name, String birth, boolean gender, double height) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.height = height;
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private String name;
        private String birth;
        private boolean gender;
        private double height;

        HumanBuilder() {
        }

        public HumanBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder birth(String birth) {
            this.birth = birth;
            return this;
        }

        public HumanBuilder gender(boolean gender) {
            this.gender = gender;
            return this;
        }

        public HumanBuilder height(double height) {
            this.height = height;
            return this;
        }

        public Human build() {
            return new Human(this.name, this.birth, this.gender, this.height);
        }

        public String toString() {
            return "Human.HumanBuilder(name=" + this.name + ", birth=" + this.birth + ", gender=" + this.gender + ", height=" + this.height + ")";
        }
    }*/
}