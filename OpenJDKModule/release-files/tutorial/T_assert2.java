// openjml -esc T_assert2.java

public class T_assert2 {

  public void example(int i) {
    int neg;
    if (i > 0) {
      neg = -i;
    } else {
      neg = i;
    }
    //@ assert neg < 0;
  }
}
