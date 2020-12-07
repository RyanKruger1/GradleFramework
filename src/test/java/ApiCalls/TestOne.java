package ApiCalls;

import org.testng.annotations.Test;

public class TestOne {

    @Test(groups = "smoke")
    public static void makeCall1()
    {
        System.out.println("smoke");
    }

    @Test(groups = "reg")
    public static void makeCall2()
    {
        System.out.println("reg");
    }

    @Test(groups = "reg")
    public static void makeCall3()
    {
        System.out.println("reg");
    }

    @Test(groups = "reg")
    public static void makeCall4()
    {
        System.out.println("reg");
    }

    @Test(groups = "corli")
    public static void makeCallCorli()
    {
        System.out.println("Hello Corli");
    }
}
