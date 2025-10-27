package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameParserTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 공백_포함_이름_문자열_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run(" pobi , woni  ", "1");
                    assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
                },
                MOVING_FORWARD, STOP
        );
    }

    @Test
    void 빈_이름_문자열_입력_예외_테스트() {
        assertThatThrownBy(() -> runException("", "3"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 구분자만_있는_이름_문자열_예외_테스트() {
        assertThatThrownBy(() -> runException("", "3"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름_한_개_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi", "1");
                    assertThat(output()).contains("pobi : -", "최종 우승자 : pobi");
                },
                MOVING_FORWARD, STOP
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

}
