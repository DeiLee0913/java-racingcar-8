package racingcar.domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(MoveRule rule, int randomNumber) {
        if(rule.canMove(randomNumber)) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String toString() {
        return name + " : " + "-".repeat(position);
    }
}
