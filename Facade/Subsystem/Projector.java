public class Projector {
    Input input;

    public void on() {
        System.out.println("Projector on");
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void wideScreenMode() {
        System.out.println("Projector wide screen");
    }

    public void off() {
        System.out.println("Projector off");
    }
}