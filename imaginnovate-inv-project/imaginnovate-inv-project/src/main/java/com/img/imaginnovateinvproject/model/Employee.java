package com.img.imaginnovateinvproject.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name="employee_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @NotNull
    @Column(name="first_name", nullable = false)
    private String firstName;

    @NotNull
    @Column(name="last_name", nullable = false)
    private String lastName;

    @NotNull
    @Column(name="email", nullable = false)
    private String email;

    @NotNull
    @Column(name="phone_number", nullable = false)
    private String[] phoneNumber;

    @NotNull
    @Column(name="doj", nullable = false)
    private Date doj;

    @NotNull
    @Column(name="salary", nullable = false)
    private Integer salary;

}
