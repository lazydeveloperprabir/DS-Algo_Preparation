/**
 * inheritance1
 */
public class inheritance1 {

    public void show(){
        System.out.println("In Parent");
    }

    public static void main(String[] args) {
        inheritance1 par = new child();
        par.show();
    }
}

class child extends inheritance1{
    public void show(){
        System.out.println("In child");
    }
}