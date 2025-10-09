public class VariableTest {
    int instanceVar = 10;

    public void printInstanceVar() {

        System.out.println("instanceVar = " + instanceVar);
        int localVar = 5;
        System.out.println("localVar = " + localVar);

    }
    public static void main(String[] args) {
        VariableTest obj = new VariableTest();
        obj.printInstanceVar();

    }
}
