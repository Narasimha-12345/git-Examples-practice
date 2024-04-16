public interface MyInterface {
    int MY_CONSTANT = 42;  // Public, Static, and Final

    
    default void defaultMethod() {  // Public and Default
        System.out.println("Default method in interface");
    }

    static void staticMethod() {  // Public and Static
        System.out.println("Static method in interface");
    }

    private void privateMethod() {  // Private
        System.out.println("Private method in interface");
    }
}

public class Main implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }

    public static void main(String[] args) {
        Main instance = new Main();

        System.out.println(MyInterface.MY_CONSTANT);  // Accessing constant

        instance.myMethod();  // Accessing overridden method
        instance.defaultMethod();  // Accessing default method
        MyInterface.staticMethod();  // Accessing static method
    }
}
