package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
    @AfterTest
    public void lastexecution()
    {
        System.out.println("i will come at the end");
    }
    @Test(groups={"smoke"})
    public void Demo()

    {
        System.out.println("Om Gan Ganapathaye Namaha");//automation
    }

    @Test
    public void SecondTest()
    {

        System.out.println("Suchet");
    }
    @AfterSuite
    public void Afsuite()
    {
        System.out.println("iam no:1 from last");
    }
}
