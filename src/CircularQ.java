public class CircularQ {

    // Data fields
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQ(int aSize){
        queue = new int[aSize];
        front = -1;
        rear = -1;
        size = aSize;
    }

    public boolean isEmpty(){ return front == -1;}

    public boolean isFull(){
        boolean full = false;
        // case 1 --> front = 0 && rear = size - 1
        if (front == 0 && rear == size - 1)
            full = true;
        else if (front == rear + 1)
            full = true;
        return full;
    }

    public void enqueue(int val){
        if(isFull())
            System.out.println("Can't enqueue");
        else {
            if(front == -1)
                front = 0;

            // increment rear
            rear++;
            if(rear == size)
                rear = 0;

            // now insert
            queue[rear] = val;

            System.out.println(val + " inserted ");
        }
    }

    // dequeue
    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Empty ... cannot dequeue");
            return -1;
        }
        else{
            int temp = queue[front];
            if (front == rear){ // Q has one element so reset pointers
                front = -1;
                rear = -1;
            }
            else{
                front++;
                if (front == size) front = 0;
            }
            return temp;
        }
    }

    public String toString(){
        String result = "|  ";
        if (front == -1 && rear == -1)
            return " | ... |";
        else {
            result += "F --> ";

            for(int i = front; i != rear; i++){
                result += queue[i] + " | ";
                if (i == size) i = 0;
            }

            result += " R --> " + queue[rear] + " |";
            return result;
        }
    }
}
