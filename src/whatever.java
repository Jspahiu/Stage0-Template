public class whatever {
    void main() {
        double num1 = 5.2;
        double num2 = 6.5;
        
        double add_numbers_var = add_numbers(num1, num2); 
        double subtract_numbers_var = subtract_numbers(num1, num2);
        double multiply_numbers_var = multiply_numbers(num1, num2);
        double divide_numbers_var = divide_numbers(num1, num2);

        IO.println(add_numbers_var);
        IO.println(subtract_numbers_var);
        IO.println(multiply_numbers_var);
        IO.println(divide_numbers_var);
    }

    double add_numbers(double num1, double num2) {
        return num1 + num2;
    }

    double subtract_numbers(double num1, double num2) {
        return num1 - num2;
    }

    double multiply_numbers(double num1, double num2) {
        return num1*num2;
    }

    double divide_numbers(double num1, double num2) {
        return num1/num2;
    }
}
