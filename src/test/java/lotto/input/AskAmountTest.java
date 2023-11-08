package lotto.input;

import static lotto.exception.ErrorType.AmountUnitException;
import static org.junit.jupiter.api.Assertions.assertThrows;

import lotto.domain.MoneyManagement;
import lotto.exception.ErrorType;
import lotto.exception.LottoException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AskAmountTest {

    @Test
    @DisplayName("로또 구입 금액이 1000원 단위가 아닐 경우에 AmountUnitException 타입 오류 발생")
    void notUnitTest(){
        //given
        String amount = "5001";

        //when & then
        LottoException lottoException = assertThrows(LottoException.class,
                () -> MoneyManagement.from(amount));

        ErrorType exceptionType = lottoException.getExceptionType();
        Assertions.assertThat(exceptionType).isEqualTo(AmountUnitException);
    }

}
