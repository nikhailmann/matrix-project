class Main {
  public static void main(String[] args) {
    try {
      Matrix test = new Matrix(3, 2);
      test.set(0, 0, 1);
      test.set(1, 0, 2);
      test.set(2, 0, 3);
      test.set(0, 1, 10);
      test.set(1, 1, 20);
      test.set(2, 1, 30);
      System.out.println(test.get(0,0));
      System.out.println(test.get(1,0));
      System.out.println(test.get(2,0));
      System.out.println(test.get(0,1));
      System.out.println(test.get(1,1));
      System.out.println(test.get(2,1));

      Matrix test2 = new Matrix(3, 2);
      test2.set(0, 0, 9);
      test2.set(1, 0, 5);
      test2.set(2, 0, 89);
      test2.set(0, 1, 100);
      test2.set(1, 1, -20);
      test2.set(2, 1, 69);
      System.out.println(test2.get(0,0));
      System.out.println(test2.get(1,0));
      System.out.println(test2.get(2,0));
      System.out.println(test2.get(0,1));
      System.out.println(test2.get(1,1));
      System.out.println(test2.get(2,1));

      Matrix added = Matrix.add(test, test2);
      System.out.println(added.get(0,0));
      System.out.println(added.get(1,0));
      System.out.println(added.get(2,0));
      System.out.println(added.get(0,1));
      System.out.println(added.get(1,1));
      System.out.println(added.get(2,1));
      
      Matrix subtracted = Matrix.sub(test, test2);
      System.out.println(subtracted.get(0,0));
      System.out.println(subtracted.get(1,0));
      System.out.println(subtracted.get(2,0));
      System.out.println(subtracted.get(0,1));
      System.out.println(subtracted.get(1,1));
      System.out.println(subtracted.get(2,1));

      Matrix multtest = new Matrix(2, 3);
      multtest.set(0, 0, 1);
      multtest.set(1, 0, 3);
      multtest.set(0, 1, 4);
      multtest.set(1, 1, 5);
      multtest.set(0, 2, -2);
      multtest.set(1, 2, -6);

      Matrix multtest2 = new Matrix(3, 4);
      multtest2.set(0, 0, 5);
      multtest2.set(1, 0, 3);
      multtest2.set(2, 0, -2);
      multtest2.set(0, 1, 2);
      multtest2.set(1, 1, 6);
      multtest2.set(2, 1, 9);
      multtest2.set(0, 2, 8);
      multtest2.set(1, 2, 4);
      multtest2.set(2, 2, 7);
      multtest2.set(0, 3, -1);
      multtest2.set(1, 3, 5);
      multtest2.set(2, 3, -3);

      Matrix multiplied = Matrix.mult(multtest, multtest2);
      System.out.println(multiplied.get(0,0));
      System.out.println(multiplied.get(1,0));
      System.out.println(multiplied.get(0,1));
      System.out.println(multiplied.get(1,1));
      System.out.println(multiplied.get(0,2));
      System.out.println(multiplied.get(1,2));
      System.out.println(multiplied.get(0,3));
      System.out.println(multiplied.get(1,3));
      System.out.println(multiplied.get(2,3));

      Matrix scalarmultiplied = Matrix.mult(multtest, -10);
      System.out.println(scalarmultiplied.get(0,0));
      System.out.println(scalarmultiplied.get(1,0));
      System.out.println(scalarmultiplied.get(0,1));
      System.out.println(scalarmultiplied.get(1,1));
      System.out.println(scalarmultiplied.get(0,2));
      System.out.println(scalarmultiplied.get(1,2));

      Matrix transposetest = new Matrix(2, 3);
      transposetest.set(0,0,6);
      transposetest.set(1,0,1);
      transposetest.set(0,1,4);
      transposetest.set(1,1,-9);
      transposetest.set(0,2,24);
      transposetest.set(1,2,8);
      Matrix transposed = Matrix.transpose(transposetest);
      System.out.println(transposed.get(0,0));
      System.out.println(transposed.get(1,0));
      System.out.println(transposed.get(2,0));
      System.out.println(transposed.get(0,1));
      System.out.println(transposed.get(1,1));
      System.out.println(transposed.get(2,1));


      



    } catch (MatrixException e) {
      System.out.print("error: "+ e.getMessage());
    }




     }
  }