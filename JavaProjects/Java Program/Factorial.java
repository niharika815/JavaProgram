class Factorial {

    int number;

    Factorial(int num) {
        number = num;
    }

    long calculateFactorial() {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial(5); 
        long result = obj.calculateFactorial();
        System.out.println("Factorial of 5 is: " + result);
    }
}

