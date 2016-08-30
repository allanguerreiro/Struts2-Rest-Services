package br.struts2.rest.repository;

import br.struts2.rest.domain.Employee;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by allan on 30/08/16.
 */
public class EmployeeRepository {
    private static Map<String, Employee> map = new HashMap<String, Employee>();

    public EmployeeRepository() {
        map.put("1", new Employee(1, "João", "Floresta"));
        map.put("2", new Employee(2, "Maria", "Floresta"));
        map.put("3", new Employee(3, "Bruxa", "Doces"));
    }

    public Employee getEmployeeById(String id) {
        return map.get(id);
    }

    public Map<String, Employee> findAllEmployee() {
        return map;
    }
}
