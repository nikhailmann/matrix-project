/**
 * Matrix.java
 * This class creates Matrices and allows certain operations to be performed on them 
 * @author Nikhail Mann
 */
public class Matrix {
    private double[][] mat;

    /**
     * Constructor method for a new Matrix
     * @param r - number of rows in matrix 
     * @param c - number of columns in matrix
     */
    public Matrix (int r, int c) {
        mat = new double[r][c];
    }

    /**
     * The set method sets a specified index in a matrix to a specified value
     * @param r - row index of matrix
     * @param c - column index of matrix
     * @param val - number value that the specified index of the matrix should be set to
     */
    public void set (int r, int c, double val) throws MatrixException {
        if (r<0 || c<0 || r>=mat.length || c >= mat[0].length) {
            throw new MatrixException("setting matrix value outside of range");
        }
        mat[r][c] = val;
    }

    /**
     * The get method returns whatever value is in a specified index of a matrix
     * @param r - row index of matrix
     * @param c - column index of matrix
     * @return the value at the specified index in the matrix
     */
    public double get(int r, int c) throws MatrixException {
        if (r<0 || c<0 || r>=mat.length || c >= mat[0].length) {
            throw new MatrixException("index value outside of matrix range");
        }
        return mat[r][c];
    }

    /**
     * The add static method takes two matrices and adds them together, if they can be added.
     * @param a - First Matrix
     * @param b - Second Matrix
     * @return a new matrix that is the result of the two input matrices being added together
     */
    public static Matrix add(Matrix a, Matrix b) throws MatrixException {
        if (a == null || b == null) {
            throw new MatrixException("At least one of the matrices are null!");
        }
        if (a.mat.length != b.mat.length) {
            throw new MatrixException("Unable to perform addition: the matrices dont have the same number of rows!");
        }
        if (a.mat[0].length != b.mat[0].length) {
            throw new MatrixException("Unable to perform addition: the matrices dont have the same number of columns!");
        }
        int rows = a.mat.length;
        int cols = a.mat[0].length;
        Matrix answer = new Matrix(rows, cols);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                double number = a.get(i, j) + b.get(i,j);
                answer.set(i, j, number);
            }
        }
        return answer;
    }

    /**
     * The sub static method takes two matrices and subtracts them, if they can be subtracted.
     * @param a - First Matrix
     * @param b - Second Matrix
     * @return a new matrix that is the result of the two input matrices being subtracted
     */
    public static Matrix sub(Matrix a, Matrix b) throws MatrixException {
        if (a == null || b == null) {
            throw new MatrixException("At least one of the matrices are null!");
        }
        if (a.mat.length != b.mat.length) {
            throw new MatrixException("Unable to perform subtraction: the matrices dont have the same number of rows!");
        }
        if (a.mat[0].length != b.mat[0].length) {
            throw new MatrixException("Unable to perform subtraction: the matrices dont have the same number of columns!");
        }
        int rows = a.mat.length;
        int cols = a.mat[0].length;
        Matrix answer = new Matrix(rows, cols);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                double number = a.get(i, j) - b.get(i,j);
                answer.set(i, j, number);
            }
        }
        return answer;
    }

    /**
     * The mult static method takes two matrices and multiplies them, if they can be multiplied.
     * @param a - First Matrix
     * @param b - Second Matrix
     * @return a new matrix that is the result of the two input matrices being multiplied
     */
    public static Matrix mult(Matrix a, Matrix b) throws MatrixException {
        if (a == null || b == null) {
            throw new MatrixException("At least one of the matrices are null!");
        }
        if (a.mat[0].length != b.mat.length) {
            throw new MatrixException("Cannot multiply these matrices! Invalid Dimensions");
        }
        int rows = a.mat.length;
        int cols = b.mat[0].length;
        int colsOfA = a.mat[0].length;
        Matrix answer = new Matrix(rows, cols);
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                double sum = 0;
                answer.set(i, j, sum);
                for(int k = 0; k < colsOfA; k++) {
                    sum += a.get(i, k) * b.get(k, j);
                    answer.set(i, j, sum);
                }
            }
        }
        return answer;
    }

    /**
     * This mult static method (overload) takes one matrix and performs scalar multiplication on it with a specified value
     * @param a - Inputted Matrix
     * @param b - Constant to multiply the matrix by
     * @return a new matrix that is the result of the matrix being scalar multiplied
     */
    public static Matrix mult(Matrix a, double b) throws MatrixException {
        if (a == null) {
            throw new MatrixException("The matrix input is null!");
        }
        int rows = a.mat.length;
        int cols = a.mat[0].length;
        Matrix answer = new Matrix(rows, cols);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                double number = a.get(i, j) * b;
                answer.set(i, j, number);
            }
        }
        return answer;
    }

    /**
     * The transpose static method takes a matrix and transposes it, if applicable
     * @param a - Inputted Matrix
     * @return a new matrix that is the result of the input matrix being transposed 
     */
    public static Matrix transpose(Matrix a) throws MatrixException {
        if (a == null) {
            throw new MatrixException("The matrix input is null!");
        }
        int rows = a.mat.length;
        int cols = a.mat[0].length;
        Matrix answer = new Matrix (cols, rows);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j ++) {
                double value = a.get(i, j);
                answer.set(j, i, value);
            }
        }
        return answer;
    }

}