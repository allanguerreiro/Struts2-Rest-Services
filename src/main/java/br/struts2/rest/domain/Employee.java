package br.struts2.rest.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by allan on 30/08/16.
 */
public class Employee {
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String company;

    public Employee(Integer id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }
}
