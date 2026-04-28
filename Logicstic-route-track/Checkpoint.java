abstract class Checkpoint {
    int id;
    String	name;
    double distance;
    int expected, actual;

    Checkpoint(int id, String name, double distance, int expected, int actual) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.expected = expected;
        this.actual = actual;
    }

    boolean delayed() {
        return actual > expected;
    }

    abstract double penalty();
    abstract String type();
}
