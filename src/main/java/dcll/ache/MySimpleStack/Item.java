package dcll.ache.MySimpleStack;

/**
 * Created by hello on 3/16/15.
 */
public class Item {
    private Object value;

    Item (Object value){
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
