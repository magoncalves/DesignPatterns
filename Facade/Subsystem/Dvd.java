public class Dvd {
    Movie movie;

    public void on() {
        System.out.println("Dvd on");
    }

    public void play(Movie movie) {
        this.movie = movie;
    }

    public void off() {
        System.out.println("Dvd off");
    }
}