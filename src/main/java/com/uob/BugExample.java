public class BugExample {
    public int divide(int a, int b) {
        // BUG: division by zero possible
        return a / b;
    }
}
