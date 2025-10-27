package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RacingGame {
    private final List<Car> cars;
    private final MoveRule moveRule;

    public RacingGame(List<Car> cars, MoveRule moveRule) {
        this.cars = cars;
        this.moveRule = moveRule;
    }

    public void playOneRound() {
        for(Car car: cars) {
            int randomNumber = pickNumberInRange(0, 9);
            car.move(moveRule, randomNumber);
        }
    }

    // 현재 상태 조회(읽기 전용 리스트)
    public List<Car> getCars() {
        return List.copyOf(cars);
    }

    // 우승자 계산
    public List<String> findWinners() {
        int max = cars.stream().mapToInt(Car::getPosition).max().orElse(0);
        return cars.stream().
                filter(c->c.getPosition() == max)
                .map(Car::getName).collect(Collectors.toList());
    }
}


