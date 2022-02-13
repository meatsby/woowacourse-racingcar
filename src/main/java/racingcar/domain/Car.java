package racingcar.domain;

public class Car {
    private static final int THRESHOLD = 4;
    private static final String DELIMITER = " : ";
    private static final String DISTANCE = "-";

    private final String name;
    private final Engine engine;
    private int position = 0;

    public Car(String name) {
        this.name = name;
        this.engine = new Engine();
    }

    public void move(int power) {
        if (power >= THRESHOLD) {
            position++;
        }
    }

    public int startEngine() {
        return engine.ignite();
    }

    public int updateMaxPosition(int highScore) {
        return Math.max(position, highScore);
    }

    public boolean isMaxPosition(int highScore) {
        return position == highScore;
    }

    public String getName() {
        return name;
    }

    public String getCurrentPosition() {
        StringBuilder currentPosition = new StringBuilder(name + DELIMITER);
        for (int i = 0; i < position; i++) {
            currentPosition.append(DISTANCE);
        }
        return currentPosition.toString();
    }
}
