package co.istad.staffmanagement;

import java.math.BigDecimal;

public class Staff {
    private String id;
    private String name;
    private String gender;
    private String position;
    private BigDecimal salary;
    private Boolean status;

    public Staff() {

    }

    public Staff(String id, String name, String gender, String position, BigDecimal salary, Boolean status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}