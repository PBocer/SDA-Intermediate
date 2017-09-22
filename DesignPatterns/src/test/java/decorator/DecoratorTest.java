package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {

    @Test
    public void decoratorTest(){

//        BufferedReader br = new BufferedReader(new FileReader("plik.txt"));

        UsdDollarDecorator usdDollar = new UsdDollarDecorator(new Dollar());

        SgdDollarDecorator sgdDollar = new SgdDollarDecorator(new Dollar());

        System.out.println(usdDollar.getName());
        System.out.println(sgdDollar.getName());
    }

}