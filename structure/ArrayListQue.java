package structure;
import java.util.ArrayList;
public class ArrayListQue<T> {

  ArrayList[] ArrayQueue;
  int Rear;
  int Front;

  int Size;



  public ArrayListQue (int Size) {

    this.Size = Size;
    ArrayQueue = new  ArrayList[this.Size];
    Front = -1;
    Rear = -1;

}



Boolean isFull() {
  return (Rear == Size - 1);
}

Boolean isEmpety() {
  return (Front == -1 || Front > Rear);
}

public void addQueue(ArrayList newItwem) {
  if (isFull()) {
      System.out.println("queue is ful");
      return;
  }

  Rear = Rear + 1;
  ArrayQueue[Rear] = newItwem;
  if (Front == -1)
      Front = 0;

}

public T deleteQueue() {
  if (isEmpety()) {

      System.out.println("queue is empety");
      return null;

  }
  T objectOut = (T) ArrayQueue[Front];
  Front = Front + 1;
  return objectOut;
}
}
    

