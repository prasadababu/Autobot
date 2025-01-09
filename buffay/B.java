package buffay;

public class B extends A{
  
   void test(){
    int h=i;
    System.out.println(i);
   }
    public static void main(String[] args) {
        B obj= new B();
        obj.test();
        System.out.println();
    }
}
