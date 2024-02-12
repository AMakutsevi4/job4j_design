package ru.job4j.early;

public class PasswordValidator {

    private static final String[] ERROR_CASE = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        for (String s : ERROR_CASE) {
            if (password.toLowerCase().contains(s)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        for (char c : password.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                throw new IllegalArgumentException("Password should contain at least one uppercase letter");
            }
            if (!Character.isLowerCase(c)) {
                throw new IllegalArgumentException("Password should contain at least one lowercase letter");
            }
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Password should contain at least one figure");
            }
        }
        return password;
    }

}