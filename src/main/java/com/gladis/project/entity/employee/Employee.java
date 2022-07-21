package com.gladis.project.entity.employee;

public class Employee {

    private Integer id;

    private String firstName;

    private String lastName;

    private String pesel;

    private String idCardNumber;

    private String phoneNumber;

    public Employee(
            Integer id,
            String firstName,
            String lastName,
            String pesel,
            String idCardNumber,
            String phoneNumber
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
