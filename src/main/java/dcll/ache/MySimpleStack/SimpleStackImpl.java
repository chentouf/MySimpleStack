package dcll.ache.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by hello on 3/16/15.
 *
 * un commentaire repond a l'exigence #2
 */
public class SimpleStackImpl implements SimpleStack {
    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public int getSize(){
        return wrappedStack.size();
    }
    public void push(Item item){
        wrappedStack.push(item);
    }
    public Item peek() throws EmptyStackException{
        return (Item) wrappedStack.peek();
    }
    public Item pop() throws EmptyStackException{
        return (Item) wrappedStack.pop();
    }

}
