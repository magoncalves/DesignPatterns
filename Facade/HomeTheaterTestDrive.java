public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        Dvd dvd = new Dvd();
        Cd cd = new Cd();
        Projector projector = new Projector();
        Lights lights = new Lights();
        Screen screen = new Screen();
        Popper popper = new Popper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}