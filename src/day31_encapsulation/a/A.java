package day31_encapsulation.a;

public class A {

    private String prvt1="private 1";
    private String prvt2;
    private String prvt3;

    public String getPrvt3() {
        return prvt3;
    }

    public void setPrvt3(String prvt3) {
        this.prvt3 = prvt3;
    }

    String dflt;
    protected String prtctd;
    public String pblc;

    public String getPrvt1() {
        return prvt1;
    }

    public void setPrvt2(String prvt2) {
        this.prvt2 = prvt2;
    }

}
