public class Amplifier {
    Dvd dvd;
    int volume;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}