public class GenericClass<T> { //generic class
  private T val;

  public GenericClass(T val) {
    this.val = val;
  }

  public T data() { //generic method
    return val;
  }

  public void show() {
    System.out.println("Object type:"+ val.getClass());
  }

}
