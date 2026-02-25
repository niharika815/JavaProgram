class SwapNumbers {
    int num;

    SwapNumbers(int n) {
        num = n;
    }

    void swap(SwapNumbers obj) {
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }

    void display() {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        SwapNumbers obj1 = new SwapNumbers(5);
        SwapNumbers obj2 = new SwapNumbers(10);

        System.out.println("Before Swapping:");
        obj1.display();
        obj2.display();

        obj1.swap(obj2);

        System.out.println("After Swapping:");
        obj1.display();
        obj2.display();
    }
}

