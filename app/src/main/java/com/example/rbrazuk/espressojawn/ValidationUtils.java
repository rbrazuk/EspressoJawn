package com.example.rbrazuk.espressojawn;

public class ValidationUtils {

    public static boolean validateEmail(String email) {
        return(email.equals("rbrazuk@tonicdesign.com"));
    }

    public static boolean validatePassword(String password) {
        return(password.equals("password"));
    }
}
