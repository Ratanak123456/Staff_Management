package co.istad.classwork;

import java.math.BigDecimal;

public class Staff {
    private String id;
    private String name;
    private String gender;
    private String position;
    private BigDecimal salary ;
    private boolean status;

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Staff (){
        id = "0";
        name = "Unknow";
        gender = "Unknow";
        salary = BigDecimal.valueOf(0);
        position = "Unknow";
        status = false;
    }

    public Staff(String id, String name , String gender , String position, BigDecimal salary , boolean status){
        this.id = id;
        this.name= name;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
        this.status = status;
    }


}
