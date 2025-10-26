package racingcar.util;

import java.util.Arrays;
import java.util.regex.Pattern;

public class NameParser {
    private static final Pattern DELIMITER = Pattern.compile(",");

    public String[] parseNames(String nameInput) {
        // 공백 문자열 예외 처리
        if(nameInput == null || nameInput.trim().isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름을 입력해주세요.");
        }

        // 토큰 내부의 공백 제거해서 Array로 반환
        return Arrays.stream(DELIMITER.split(nameInput))
                .map(String::trim)
                .filter(name -> !name.isEmpty())
                .toArray(String[]::new);
    }
}
