package br.struts2.rest.controller;

import br.struts2.rest.domain.Employee;
import br.struts2.rest.repository.EmployeeRepository;
import com.opensymphony.xwork2.ModelDriven;
import lombok.Getter;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import java.util.Map;

/**
 * Created by allan on 30/08/16.
 */
public class EmployeeController implements ModelDriven<Object> {
    @Getter
    private String id;
    @Getter
    private Object model;
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private static Map<String, Employee> map;

    public EmployeeController() {
        map = employeeRepository.findAllEmployee();
    }

    public HttpHeaders index() {
        model = map;
        return new DefaultHttpHeaders("index").disableCaching();
    }

    public String add() {
        Integer empId = Integer.parseInt(id);
        Employee employee = new Employee(empId, "Caçador", "Armas");
        model = employee;
        return "SUCCESS";
    }

    public void setId(String id) {
        model = employeeRepository.getEmployeeById(id);
        this.id = id;
    }
}
