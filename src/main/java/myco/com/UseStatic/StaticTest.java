package myco.com.UseStatic;

public class StaticTest {
    public static void main(String[] args) {
        int testVar = 45;
        UseStatic.a = 9;
        UseStatic.meth(testVar);
        int staticVar = UseStatic.b* testVar;
        System.out.println(staticVar);
    }
}
