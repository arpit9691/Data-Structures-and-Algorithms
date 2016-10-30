/**
 * Created by Arpit on 9/16/2016.
 */
public class TestTry {

    class Inner {
        void test() {
            if (TestTry.this.flag); {
                sample();
            }
        }
    }
    private boolean flag = true;
    public void sample() {
        System.out.println("Sample");
    }
    public TestTry() {
        (new Inner()).test();
    }
    public static void main(String args []) {
        new TestTry();
    }
}
