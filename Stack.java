import java.lang.Exception;
import java.util.EmptyStackException;

public class Stack<E>
{
    private int top;
    private Object[] stack;

    public Stack()
    {
        stack = new Object[3];
        top = -1;    

    }

    public void push(E item)
    {
        if(top < stack.length-1)
        {
            //top++;
            stack[++top] = item;

        }
        else
        {   
                
            Object[] newStack = new Object[stack.length*2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            //Object[(stack.length)*2];
            
            newStack[top++] = item;
            stack = newStack;

        }
    }

    public E pop()
    {
        if(top == -1 || stack[top] == null)
        {
            throw new EmptyStackException();
        }
        else
        {
            E del = (E)stack[top];

            stack[top--] = null;
            //top--;
            return del;
        }

    }

    public E peek()
    {
        if(top == -1 || stack[top] == null)
            throw new EmptyStackException();

        else
            return (E)stack[top];

    }

    public boolean isEmpty()
    {
        if(top == -1)
            return true;

        else
            return false;

    }

    public int size()
    {
        return top+1;
    }
}