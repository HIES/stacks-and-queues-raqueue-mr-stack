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
            top++;
            stack[top] = item;

            
        }
        else
        {   
            
             Object[] tempStack = new Object[stack.length];
            Object[] stack = new Object[(tempStack.length)*2];
            for(int i = 0; i < tempStack.length; i++)
            {
                stack[i] = tempStack[i];
            }
            
            stack[top] = item;
            

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
        stack[top] = null;
        top--;
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
        if(top == -1 || stack[top] == null)
            return true;
        
        else
            return false;
        
    }

    public int size()
    {
        return top+1;
    }
}