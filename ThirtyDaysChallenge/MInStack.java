package ThirtyDaysChallenge;

class Element{
    int value;
    int min;
    Element next;

    public Element(int value,int min){
        this.value = value;
        this.min = min;
    }
}

class MinimumStack{
    private Element top;

    public MinimumStack() {
    }

    public void push(int x) {
        if(top == null){
            top = new Element(x,x);
        } else{
            Element e = new Element(x, Math.max(x, top.min));
            e.next = top;
            top =e;
        }
    }
    
    public void pop() {
        if(top == null){
            return;
        }

    }
    
    public int top() {
        return -1;
    }
    
    public int getMin() {
        return -1;
        
    }

}

public class MInStack {

    public static void main(String[] args) {
        
    }

}