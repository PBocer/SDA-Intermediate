
public interface InterfaceWithDefaultMethods {

    void foo();

    default void stream() {
        System.out.println("stream");
    }

}
