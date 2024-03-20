package structure;

import java.util.ArrayList;

public class ArryQueueDemo {
    public static void main(String args[]){

        ArryQue<String> queue = new ArryQue<String>(4);

        queue.addQueue("A");
        queue.addQueue("b");
        queue.addQueue("d");
        queue.addQueue("t");
        queue.addQueue("t");
        queue.addQueue("t");
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
        System.out.println(queue.deleteQueue());
    }
    }
    

