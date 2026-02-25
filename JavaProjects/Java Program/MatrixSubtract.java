class MatrixSubtract {

    int[][] matrix;
    int rows, cols;

    MatrixSubtract(int[][] mat, int r, int c) {
        matrix = mat;
        rows = r;
        cols = c;
    }

    MatrixSubtract subtract(MatrixSubtract obj) {
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j] - obj.matrix[i][j];
            }
        }

        return new MatrixSubtract(result, rows, cols);
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

        int[][] mat1 = { {9, 8}, {7, 6} };
        int[][] mat2 = { {1, 2}, {3, 4} };

        MatrixSubtract m1 = new MatrixSubtract(mat1, 2, 2);
        MatrixSubtract m2 = new MatrixSubtract(mat2, 2, 2);

        MatrixSubtract result = m1.subtract(m2);

        System.out.println("Subtraction Result:");
        result.display();
    }
}

