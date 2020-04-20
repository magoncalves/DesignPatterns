public class CountingDuckFactory extends AbstractDuckFactory {
  public Quackable createMallardDuck() {
    return new QuackCounter(MallardDuck());
  }

  public Quackable createRedheadDuck() {
    return new QuackCounter(RedheadDuck());
  }

  public Quackable createDuckCall() {
    return new QuackCounter(DuckCall());
  }

  public Quackable createRubberDuck() {
    return new QuackCounter(RubberDuck());
  }
}