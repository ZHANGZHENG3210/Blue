package Main;
public class FinalMethod {
    private int number=10;
    public void doSomeThing(){
        System.out.println("外部类");
    }
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        FinalMethod finalMethod=new FinalMethod();
        FinalMethod.Test test=finalMethod.new Test();
        test.doSomeThing();
    }
        class Test {

            int x;

            Test() {
                System.out.println(FinalMethod.this.add(1,2));
            }

            public void doSomeThing() {
                System.out.println("内部类" + number);
                FinalMethod.this.doSomeThing();
            }

            public int sub(int a, int b) {
                return a - b;
            }
        }

}
