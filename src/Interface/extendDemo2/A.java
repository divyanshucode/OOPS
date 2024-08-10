package Interface.extendDemo2;
//access modifier for overridden method should be same as in parent or public
//e,g, parent class method is protected
//child class which is overriding it should also be protected or better than protected like public else it will give error
public interface A
{
    //static interface should always have a body
    //always call via the interface name
    static void greeting(){
        System.out.println("static method");
    }

    default void fun(){
        System.out.println("I AM IN A");
    }
}
