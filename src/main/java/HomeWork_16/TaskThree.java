package HomeWork_16;


public class TaskThree {
    public static String errorsCheck(String password) {
        StringBuilder errors = new StringBuilder();
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCase = true;
            } else if (Character.isLowerCase(c)) {
                lowerCase = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            }
        }
        if (password.length() < 8 || password.length() > 20) {
            errors.append("Пароль должен быть длиной от 8 до 20 символов.");
        }
        if (!upperCase) {
            errors.append("Пароль должен содержать хотя бы одну заглавную букву");
        }
        if (!lowerCase) {
            errors.append("Пароль должен содержать хотя бы одну строчную букву.");
        }
        if (!digit) {
            errors.append("Пароль должен содержать хотя бы одну цифру.");
        }
        if(password.contains(" ")){
            errors.append("Пароль не должен содержать пробелов.");
        }
        if (errors.length() > 0) {
            return errors.toString();
        }
        return "Вы написали хороший пароль, молодец";
    }

    public static void main(String[] args) {
        String[] pass = {
                "MyPassword123",
                "ffffff66",
                "ShlechtPass",
                "aSdf3h",
                "avalanche gt2020"};
        for (String password : pass) {
            System.out.println(errorsCheck(password));
        }
    }
}
