package com.vedroid.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shops")
public class Shop {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(name = "employees_number")
    private Integer emplNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmplNumber() {
        return emplNumber;
    }

    public void setEmplNumber(Integer emplNumber) {
        this.emplNumber = emplNumber;
    }
}