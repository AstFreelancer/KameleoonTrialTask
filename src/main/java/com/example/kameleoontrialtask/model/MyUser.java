package com.example.kameleoontrialtask.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "MYUSER")
public class MyUser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private Date reg_date;

    public MyUser(Integer id, String name, String email, String password, Date reg_date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.reg_date = reg_date;
    }

    public MyUser() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date creationDate) {
        this.reg_date = creationDate;
    }


}
