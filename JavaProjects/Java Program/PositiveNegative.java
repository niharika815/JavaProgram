class PositiveNegative {
    int number;

    PositiveNegative(int num) {
        number = num;
    }

    void checkNumber() {
        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative(-5);
        obj.checkNumber();
    }
}
