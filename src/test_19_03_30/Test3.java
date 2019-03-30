package test_19_03_30;

public class Test3 {

    void test(int x, int y){
        System.out.println("test");
    }

    //String test(int x, int y){   //WRONG - same signature
    String test(int x, double y){
        System.out.println("test");
        return "test2";
    }
}
