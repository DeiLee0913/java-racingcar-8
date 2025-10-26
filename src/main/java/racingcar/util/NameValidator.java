package racingcar.util;

public class NameValidator {
    public void validate(String[] names) {
        validateNotEmpty(names);
        validateLengthWithinLimit(names);
    }

    // 유효한 자동차 이름이 최소 하나인지 확인
    private void validateNotEmpty(String[] names) {
        if(names.length == 0) {
            throw new IllegalArgumentException("[ERROR] At least one car name should be valid.");
        }
    }
    // 이름이 5글자 이하인지 확인
    private void validateLengthWithinLimit(String[] names) {
        for(String name: names) {
            if(name.length() > 5) {
                throw new IllegalArgumentException("[ERROR] Name is too long.");
            }
        }
    }
}
