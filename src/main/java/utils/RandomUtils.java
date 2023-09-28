package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomUtils {

    public static String generateRandomEmail(String domain) {
        String email = RandomStringUtils.randomAlphanumeric(7);

        return email + domain;
    }
}
