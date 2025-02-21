package lotto;

import lotto.controller.LottoController;
import lotto.view.InputValidator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Application {
    public static void main(String[] args) {

        LottoController lottoController = new LottoController(new InputView(), new OutputView(), new InputValidator());
        lottoController.start();
    }
}
