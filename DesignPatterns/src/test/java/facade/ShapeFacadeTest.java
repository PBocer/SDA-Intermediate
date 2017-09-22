package facade;

import org.junit.Test;



public class ShapeFacadeTest {

    @Test
    public void test(){
        ShapeFacade facade = new ShapeFacade();
        facade.drawAll();
    }

}