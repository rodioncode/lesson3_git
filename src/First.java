class First {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        First first = new First();
        first.func2();
    }

    public void func2() {
        Main main = new Main();
        main.func1();
        main.a = 2;
        Main main2 = new Main();
        Main main3 = new Main();
        Main main4 = new Main();
        main2.a = 5;
        System.out.print(main.a);
        System.out.print(main2.a);
        System.out.print(main3.a);
        System.out.print(main4.a);
        Main.func_static();
    }

    static void func4() {
        Main.func_static();
    }
}