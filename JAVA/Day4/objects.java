public class objects {
    int a,b;
    objects(){
        System.out.println("this is dafault construcor");
        a=10;
        b=20;
    }
    objects(objects obj){
        System.out.println("This is a object constructor");
        this.a=obj.a;
        this.b=obj.b;
    }
    int c;
    void display(){
        c=a+b;
        System.out.println("sum is"+c);
    }
    public static void main(String[] args) {
        // Creating an object of the class
        objects obj = new objects();
        objects obj1=new objects(obj);
        obj1.display();
    }
}