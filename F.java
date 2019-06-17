package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */

class G {
  public void print() {

    System.out.println("A");
  }
}

class H extends G {
  @Override
  public void print() {

    System.out.println("B");
  }
}

public class F {
  public static void main(String[] args) {

    G g = new G();
    G g1 = new H();
    H h = new H();

    get(g);
    get(g1);
    get(h);

  }

  /**
   * @param g
   */
  private static void get(G g) {

    g.print();

  }
}

// OUTPUT: ABB
