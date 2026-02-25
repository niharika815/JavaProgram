class MatrixMultiply {

    int[][] matrix;
    int rows, cols;


    MatrixMultiply(int[][] mat, int r, int c) {
        matrix = mat;
        rows = r;
        cols = c;
    }

    MatrixMultiply multiply(MatrixMultiply obj) {
        int[][] result = new int[this.rows][obj.cols];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < obj.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.matrix[i][k] * obj.matrix[k][j];
                }
            }
        }

        return new MatrixMultiply(result, this.rows, obj.cols);
    }

    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat1 = { {1, 2}, {3, 4} };
        int[][] mat2 = { {5, 6}, {7, 8} };

        MatrixMultiply m1 = new MatrixMultiply(mat1, 2, 2);
        MatrixMultiply m2 = new MatrixMultiply(mat2, 2, 2);

        MatrixMultiply result = m1.multiply(m2);

        System.out.println("Multiplication Result:");
        result.display();
    }
}
