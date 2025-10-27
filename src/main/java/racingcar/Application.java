package racingcar;

import racingcar.controller.CarRacingController;
import racingcar.util.CarFactory;
import racingcar.util.NameParser;
import racingcar.util.NameValidator;
import racingcar.util.TryCountValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        NameParser nameParser = new NameParser();
        NameValidator nameValidator = new NameValidator();
        TryCountValidator tryCountValidator = new TryCountValidator();
        CarFactory carFactory = new CarFactory();

        CarRacingController carRacingController = new CarRacingController
                (inputView, outputView, nameParser, nameValidator, tryCountValidator, carFactory);

        carRacingController.run();
    }
}
