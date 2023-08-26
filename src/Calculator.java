class Calculator {

  int num = 5;
  /*
   * Method Overloading when we have different number of parameters
   * we should have the same return type
   */
  public int add(int a, int b) {
    return a+b;
  }

  public int add(int a, int b, int c) {
    return a+b+c;
  }
}
