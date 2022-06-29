package com.bridgelabz.lambda;

import java.util.regex.Pattern;
@FunctionalInterface
interface PasswordRule {
    void validUser(String password);
}
class RegexLambdaExpression {

    public static void main(String[] args) {
        PasswordRule function = (password)->{
            boolean check = Pattern.matches("^(?=.*[0-9]{1,})(?=.*[a-z])(?=.*[A-Z]){1,}(?=.*[*.!@$%^&]).{8,}$",password);
            if (check == true) {
                System.out.println("Password is Valid");
            }else
                System.out.println("Password Is Invalid");
        };
        function.validUser("Saffu@2000");
    }
}



