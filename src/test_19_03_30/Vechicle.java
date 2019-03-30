package test_19_03_30;

public interface Vechicle {

    void message();


    default String textMessage(){
        return "vechicle";
    }

    private static String textStaticMessage(){
        return "static vechicle";
    }
}
