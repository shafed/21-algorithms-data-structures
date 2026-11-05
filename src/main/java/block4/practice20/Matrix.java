package block4.practice20;

public class Matrix<T extends Number> {
  private T[][] matrix;

  public Matrix(T[][] matrix) {
    this.matrix = matrix;
  }

  public double[][] sum(T[][] other) {
    double[][] res = new double[matrix.length][matrix[0].length];
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[i].length; j++) {
        res[i][j] = matrix[i][j].doubleValue() + other[i][j].doubleValue();
      }
    }
    return res;
  }

  public double[][] multiply(T[][] other) {
    if (matrix[0].length != other.length) {
      throw new IllegalArgumentException("Incompatible matrix dimensions");
    }

    double[][] res = new double[matrix.length][other[0].length];
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[i].length; j++) {
        for (int k = 0; k < matrix[0].length; k++) {
          res[i][j] += matrix[i][k].doubleValue() * other[k][j].doubleValue();
        }
      }
    }
    return res;
  }

  public static void printMatrix(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Integer[][] first = { { 1, 2, 3 }, { 4, 5, 6 } };
    Integer[][] second = { { 6, 5, 4 }, { 3, 2, 1 } };
    Integer[][] multiplier = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
    Matrix<Integer> example = new Matrix<>(first);

    System.out.println("Sum:");
    double[][] sum = example.sum(second);
    printMatrix(sum);

    System.out.println("Product:");
    double[][] product = example.multiply(multiplier);
    printMatrix(product);
  }

}
