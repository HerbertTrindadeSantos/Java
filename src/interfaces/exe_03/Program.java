package interfaces.exe_03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        File file = new File("/home/herbert/Documentos/out/in.txt");

        List<Employee> employeeList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while (line != null){
                String fields[] = line.split(",");
                employeeList.add(new Employee(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(employeeList);

        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
