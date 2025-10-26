package racingcar.controller;

import racingcar.util.NameParser;
import racingcar.util.NameValidator;
import racingcar.util.TryCountValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class CarRacingController {
    // TODO: 컨트롤러 구현 완료시 필요 필드에 FINAL 추가
    private InputView inputView;
    private OutputView outputView;

    private NameParser nameParser;
    private NameValidator nameValidator;
    private TryCountValidator tryCountValidator;

    public CarRacingController(InputView inputView, OutputView outputView,
                        NameParser nameParser, NameValidator nameValidator,  TryCountValidator tryCountValidator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.nameParser = nameParser;
        this.nameValidator = nameValidator;
        this.tryCountValidator = tryCountValidator;
    }
    public void run() {
        // 1. 입력 받기
        String rawNames = inputView.readCarNames();
        String rawTryCount = inputView.readTryCount();

        // 2. 입력 검증 및 변환
        String[] names = nameParser.parseNames(rawNames);
        nameValidator.validate(names);
        tryCountValidator.validate(rawTryCount);

        // 3. 자동차 객체 생성 및 게임 초기화
        // TODO: Car 객체 생성 로직 추가 예정

        // 4. 시도 횟수만큼 게임 진행
        // TODO: PlayRounds() 구현 예정

        // 5. 우승자 계산 및 출력
        List<String> winners;
        outputView.printWinners(winners);
    }
}
