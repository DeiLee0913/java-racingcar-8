package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class OutputView {
    private static final String WINNER_PROMPT = "최종 우승자 : ";
    private static final String ERROR_PROMPT = "[ERROR] ";

    // 라운드별 자동차 status 출력
    public void printRoundResult(List<Car> cars) {
        for (Car car: cars) {
            System.out.println(cars.toString());
        }
        System.out.println();  // 라운드 간 공백 줄
    }

    // 최종 우승자 출력
    public void printWinners(List<String> winners) {
        System.out.print(WINNER_PROMPT + String.join(", ", winners));
    }

    // 예외 메시지 출력
    public void printError(String errMessage) {
        System.out.println(ERROR_PROMPT + errMessage);
    }
}
