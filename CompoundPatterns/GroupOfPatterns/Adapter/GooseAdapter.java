public class GooseAdapter implements Quackable {
  // Adapter
  Goose goose;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
  }

  public void quack() {
    goose.honk();
  }
}