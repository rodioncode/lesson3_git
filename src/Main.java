import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int a = 1;
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        First first = new First();
    }

    public void func1() {
        System.out.print(a);
    }
    public static void func_static() {
        System.out.print("Hello and welcome!");
    }
    public void func2() {}
    protected void func3() {}

}

