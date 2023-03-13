public class Main {
    public static void main(String[] args) {

        CircularQ nq = new CircularQ(10);
        nq.dequeue();

        System.out.println(nq);

        nq.enqueue(12);
        nq.enqueue(2);

        nq.enqueue(23);

        System.out.println(nq);
    }
}