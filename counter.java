class Counter {
    static int objectCount = 0;

    Counter() {
        objectCount++; // Increment the object count when a new object is created
    }

    static void showCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter.showCount(); // Initially, no objects are created, so count is 0

        Counter counter1 = new Counter();
        Counter.showCount(); // One object is created, so count is 1

        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter.showCount(); // Three objects are created, so count is 3
    }
}
