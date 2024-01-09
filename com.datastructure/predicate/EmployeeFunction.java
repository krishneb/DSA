package predicate;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeFunction {

    public void sort(List<Employee> list) {
        List<String> distinctList = list.stream().map(obj-> obj.getName())
                .distinct()
                .collect(Collectors.toList());
        Map<String, Employee> map = new HashMap<>();

        distinctList.forEach(obj-> {
            list.forEach(s-> {
                if(obj.equalsIgnoreCase(s.getName())){
                    map.put(obj,s);
                }
            });
        });


        map.forEach((key,value)->{
            System.out.println(value.toString());
        });
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Krishnendu", 44, "ECE", "Howrah");
        Employee e2 = new Employee("Krishnendu", 10, "ECE", "Howrah");
        Employee e3 = new Employee("Sourav", 74, "EI", "Bharampur");
        Employee e4 = new Employee("Saha", 86, "AEIE", "SaltLake");
        Employee e5 = new Employee("Saha", 89, "AEIE", "SaltLake");
        Employee e6 = new Employee("Sourav", 75, "EI", "Bharampur");


        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        EmployeeFunction empFuncction = new EmployeeFunction();
        empFuncction.sort(list);
    }
}
