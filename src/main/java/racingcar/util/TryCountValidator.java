package racingcar.util;

public class TryCountValidator {
    public void validate(String rawTryCount) {
        validateNotEmpty(rawTryCount);
        validatePositiveNumber(rawTryCount);
    }

    private void validateNotEmpty(String rawTryCount) {
        if (rawTryCount == null || rawTryCount.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] TryCount cannot be null or empty.");
        }
    }

    private void validatePositiveNumber(String rawTryCount) {
        try {
            int tryCount = Integer.parseInt(rawTryCount.trim());
            if (tryCount < 1) {
                throw new IllegalArgumentException("[ERROR] TryCount must be a positive number.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] TryCount must be a numeric value.");
        }
    }
}
