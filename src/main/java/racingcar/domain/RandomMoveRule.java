package racingcar.domain;

public class RandomMoveRule implements MoveRule {
    private static final int MOVE_THRESHOLD = 4;

    @Override
    public boolean canMove(int randomNumber) {
        return randomNumber % MOVE_THRESHOLD == 0;
    }
}
