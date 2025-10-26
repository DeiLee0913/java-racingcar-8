package racingcar.controller;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class CarRaicingController {
    public InputView inputView;
    public OutputView outputView;

    CarRaicingController(InputView inputView, OutputView outputView) {
        inputView = inputView;
        outputView = outputView;
    }
    public void run() {
        // 1. 입력 받기
        String rawNames = inputView.readCarNames();
        String rawTryCount = inputView.readTryCount();

        // 2. 입력 검증 및 변환

        // 3. 자동차 객체 생성 및 게임 초기화

        // 4. 시도 횟수만큼 게임 진행

        // 5. 우승자 계산 및 출력
        List<String> winners;
        outputView.printWinners(winners);
    }
}
