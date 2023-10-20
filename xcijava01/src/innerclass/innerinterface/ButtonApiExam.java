package innerclass.innerinterface;


class Button {

    OnClickListener ocl;

    public void setOcl(OnClickListener ocl) {
        this.ocl = ocl;
    }

    interface OnClickListener {
        public void onClick();
    }

    void onClick() {
        ocl.onClick();
    }

}

public class ButtonApiExam {
    public static void main(String[] args) {
        //개발자 1. 클릭하면 음악 재생
        Button btn1 = new Button();
        btn1.setOcl(new Button.OnClickListener(){
            @Override
            public void onClick() {
                System.out.println("개발자1 : 음악재생");
            }
        });
        btn1.onClick();
        //개발자 1. 클릭하면 음악 재생
        Button btn2 = new Button();
        btn2.setOcl(new Button.OnClickListener(){
            @Override
            public void onClick() {
                System.out.println("개발자2 : 네이버 접속");
            }
        });
        btn2.onClick();

    }
}
