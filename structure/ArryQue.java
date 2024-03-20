package structure;

public class ArryQue<T> {

    Object[] ArrayQueue;
    int Rear;
    int Front;

    int Size;

    public ArryQue(int Size) {

        this.Size = Size;
        ArrayQueue = new Object[this.Size];
        Front = -1;
        Rear = -1;

    }

    Boolean isFull() {
        return (Rear == Size - 1);
    }

    Boolean isEmpety() {
        return (Front == -1 || Front > Rear);
    }

    public void addQueue(Object newItwem) {
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
