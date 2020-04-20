public class Flock implements Quackable {
  ArrayList quackers = new ArrayList();

  public void add(Quackable quacker) {
    quackers.add(quacker);
  }

  public void quack() {
    Iterator iterator = quackers.iterator();
    while (iterator.hasNext()) {
      Quackable quacker = (Quackable)iterator.next();
      quacker.quack();
    }
  }

  public void registerObserver(Observer observer) {
    Iterator iterator = ducks.iterator();
    while (iterator.hasNext()) {
      Quackable duck = (Quackable)iterator.next();
      duck.registerObserver(observer);
    }
  }
}