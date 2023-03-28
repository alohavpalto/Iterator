import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

  protected Random random;
  protected int min;
  protected int max;

  public Randoms(int min, int max) {
    this.min = min;
    this.max = max;
    this.random = new Random();
  }

  @Override
  public Iterator<Integer> iterator() {
    return new RandomsIterator(this);
  }

  private class RandomsIterator implements Iterator<Integer> {

    private Randoms randoms;

    public RandomsIterator(Randoms randoms) {
      this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Integer next() {
      return randoms.random.nextInt(randoms.max - randoms.min + 1) + randoms.min;
    }
  }
}
