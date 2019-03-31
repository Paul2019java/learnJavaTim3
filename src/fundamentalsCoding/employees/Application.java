package fundamentalsCoding.employees;


import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) throws IOException {
        // 1. read Resources/employees.csv (get file lines as Strings)
        Path localEmployeesPath = getLocalResourcesPath(
                "employees.csv");

        List<String> lines = ReadEmployees.getAllLines(localEmployeesPath);


        // 2. filter empty and commented lines
        List<String> validLines = getValidLines(lines);
        //ReadEmployees.printList(validLines);

        // 3. deserialize data from List<String> to List<Employee>
        // deserialize: text (employees.csv) ---> List<Employee>
        // serialize: java object ---> text (String)
        List<Employee> employees = getEmployees(validLines);
/*        for(Employee employee : employees){
            System.out.println(employee);
        }*/

        // 4. calculate/print statistics
        //4.1
        // count employers from employee.csv
        Set<Employer> employers = getEmployers(employees);
        System.out.println("Nr. of employers: " + employers.size());
    }

    private static Set<Employer> getEmployers(List<Employee> employees) {

        Set<Employer> employers = new TreeSet<>();

        for(Employee employee : employees){
            employers.add(employee.getEmployer());
        }

        return employers;
    }

    private static List<Employee> getEmployees(List<String> validLines) {
        List<Employee> employees = new ArrayList<>();

        for(String line : validLines){
            Employee employee = lineToEmployee(line);
            employees.add(employee);
        }

        return employees;
    }

    private static Employee lineToEmployee(String line) {
        // line: name, city, employer
        // line: Dorina,Brasov,Consignor
        String[] tokens = line.split(",");

        if(tokens.length < 3){
            throw new Error("Invalid line found!!!");
        }

        String name = tokens[0];
        String city = tokens[1];
        Employer employer = Employer.valueOf(
                tokens[2].toUpperCase());

        return new Employee(name, city, employer);
    }

    private static List<String> getValidLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        for(String line : lines){
            if(isValid(line)){
                validLines.add(line);
            }
        }
        return validLines;
    }

    private static boolean isValid(String line) {

        String trimmedLine = line.trim();

        boolean lineIsCommented = trimmedLine.startsWith("//");
        boolean lineIsEmpty = trimmedLine.isEmpty();

        //boolean lineIsValid = false == (lineIsCommented || lineIsEmpty);
        // boolean lineIsValid = (! lineIsCommented) && (! lineIsEmpty);
        boolean lineIsValid = (false == lineIsCommented)
                && (false == lineIsEmpty);

        return lineIsValid;
    }

    private static Path getLocalPath(String... morePaths) {
        String localDir = System.getProperty("user.dir");
        Path localPath = Path.of(localDir, morePaths);

        return localPath;
    }

    public static Path getLocalResourcesPath(String... morePaths){
        String resourcesLocalPath = getLocalPath("Resources")
                .toString();

        return Path.of(resourcesLocalPath, morePaths);
    }


}
