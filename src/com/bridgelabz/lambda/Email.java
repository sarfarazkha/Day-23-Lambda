package com.bridgelabz.lambda;

import java.util.regex.Pattern;
@FunctionalInterface
interface EmailId {
    void validUser(String email);
}

class RegexLambdaExpression2 {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        EmailId function = (email) -> {
            boolean check = Pattern.matches("^([a-z]{3}[.][a-z]{3}@[a-z]{2}[.][a-z]{2}[.][a-z]{2})$", email);
            if (check == true) {
                System.out.println("Email is Valid");
            } else
                System.out.println("Enter valid email");
        };
        function.validUser("abc.xyz@bl.co.in");
    }
}
