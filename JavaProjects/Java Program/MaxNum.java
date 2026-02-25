class Maximum {
    int a, b, c;

    Maximum(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void findMax() {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Maximum Number: " + max);
    }

    public static void main(String[] args) {
        Maximum obj = new Maximum(10, 25, 15);
        obj.findMax();
    }
}

