package ru.job4j.early;

public class PasswordValidator {
    private static final String[] ERROR_CASE = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        boolean upperChar = false;
        boolean lowerChar = false;
        boolean digitChar = false;
        boolean specialChar = false;

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperChar = true;
            }
            if (Character.isLowerCase(c)) {
                lowerChar = true;
            }
            if (Character.isDigit(c)) {
                digitChar = true;
            }
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                specialChar = true;
            }
            if (upperChar && lowerChar && digitChar && specialChar) {
                break;
            }
        }
        if (!upperChar) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lowerChar) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!digitChar) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!specialChar) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        for (String q : ERROR_CASE) {
            if (q.toLowerCase().contains(q)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
