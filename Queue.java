import java.lang.Exception;
import java.util.NoSuchElementException;

public class Queue<E>
{
    private int size;
    private Node front;
    private Node back;
    private class Node<E>
    {
        private E data;
        private Node next;

        public Node(E data)
        {
            this.data = data;
            next = null;
        }
    }

    public Queue()
    {
        
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if(front == null)
            return true;
        else
            return false;
    }

    public void enqueue(E item)
    {
        if(front == null)
        {
            front = new Node(item);
            back = front;
            size++;
        }
        else
        {
            back.next = new Node(item);
            back = back.next;
            size++;
        }

    }

    public E dequeue()
    {
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
         
            E del = (E) front.data;
            Node temp = front.next;
            front = null;
            front = temp;
            size--;
            if(size == 0)
                back = null;
            return del;
            
        }
        
 
    }

    public E peek()
    {
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
        return (E)front.data;
         }   
    }
        
    public static void main(String[] args)
    {
        Queue<String> q = new Queue<>();
        q.enqueue("first");
        q.enqueue("second");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}