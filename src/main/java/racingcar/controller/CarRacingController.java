package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.RandomMoveRule;
import racingcar.domain.RacingGame;
import racingcar.util.CarFactory;
import racingcar.util.NameParser;
import racingcar.util.NameValidator;
import racingcar.util.TryCountValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class CarRacingController {
    private InputView inputView;
    private OutputView outputView;

    private NameParser nameParser;
    private NameValidator nameValidator;
    private TryCountValidator tryCountValidator;
    private CarFactory carFactory;

    public CarRacingController(InputView inputView, OutputView outputView,
                        NameParser nameParser, NameValidator nameValidator,
                               TryCountValidator tryCountValidator, CarFactory carFactory) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.nameParser = nameParser;
        this.nameValidator = nameValidator;
        this.tryCountValidator = tryCountValidator;
        this.carFactory = carFactory;
    }

    public void run() {
        // 1. 입력 받기
        String rawNames = inputView.readCarNames();
        String rawTryCount = inputView.readTryCount();

        // 2. 입력 검증 및 변환
        String[] names = nameParser.parseNames(rawNames);
        nameValidator.validate(names);
        int tryCount = tryCountValidator.validate(rawTryCount);

        // 3. 자동차 객체 생성 및 게임 초기화
        List<Car> cars = carFactory.createCars(names);
        RacingGame racingGame = new RacingGame(cars, new RandomMoveRule());

        // 4. 시도 횟수만큼 게임 진행
        for(int i = 0; i < tryCount; i++) {
            racingGame.playOneRound();
            outputView.printRoundResult(racingGame.getCars());
        }

        // 5. 우승자 계산 및 출력
        List<String> winners = racingGame.findWinners();
        outputView.printWinners(winners);
    }
}
