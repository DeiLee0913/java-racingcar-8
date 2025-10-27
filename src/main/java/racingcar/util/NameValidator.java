package racingcar.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NameValidator {
    public void validate(String[] names) {
        validateNotEmpty(names);
        validateDuplicate(names);
        validateLengthWithinLimit(names);
    }

    // 유효한 자동차 이름이 최소 하나인지 확인
    private void validateNotEmpty(String[] names) {
        if(names.length == 0) {
            throw new IllegalArgumentException("[ERROR] At least one car name should be valid.");
        }
    }

    private void validateDuplicate(String[] names) {
        Set<String> uniqueNames = new HashSet<>(Arrays.asList(names));
        if (uniqueNames.size() != names.length) {
            throw new IllegalArgumentException("[ERROR] Duplicate car names are not found.");
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
