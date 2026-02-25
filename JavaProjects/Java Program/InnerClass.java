class OuterClass {

    int outerData = 10;

    class InnerClass {
        void display() {
            System.out.println("Outer Data: " + outerData);
            System.out.println("Inside Inner Class");
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}

