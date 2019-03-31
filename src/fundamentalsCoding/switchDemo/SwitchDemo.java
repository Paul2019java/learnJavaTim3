package fundamentalsCoding.switchDemo;

/*
What does the main function print?
*/
public class SwitchDemo {

    public static void main(String[] args) {

        String command = "x";

        switch (command) {
            case "LS":
                System.out.println("list");
                return;
            case "CD":
                System.out.println("change directory");
            default:
                System.out.println("wrong command");
            case "RUN":
                System.out.println("run command");
            case "RM":
                System.out.println("remove");
        }


        System.out.println(getCommandMessage(command));
    }

    private static String getCommandMessage(String command) {

        switch (command) {
            case "LS":
                return "list";
            //case "CD": return "change directory";
            default:
                return "wrong command";
            case "RUN":
                return "run command";
            case "RM":
                return "remove";
        }
    }
}
