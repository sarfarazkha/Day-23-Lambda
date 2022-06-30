package com.bridgelabz.lambda;

import java.util.regex.Pattern;
@FunctionalInterface
interface PasswordRule1 {
    void validUser(String password);
}

class RegexLambdaExpression4 {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        PasswordRule1 function = (password)->{
            boolean check = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&]).{8,}$",password);
            if (check == true) {
                System.out.println("Password is Valid");
            }else
                System.out.println("Enter valid password");
        };
        function.validUser("Saffu@2000");
    }
}