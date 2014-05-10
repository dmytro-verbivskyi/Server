package com.vedroid.server.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SHOPS")
@SequenceGenerator(initialValue = 1, name = "idgen", sequenceName = "entityshopseq")
public class Shop extends Identifiable {

    @Basic
    @Column(name = "NAME", nullable = false)
    private String name;

    @Basic
    @Column(name = "EMPLOYEES_NUMBER", nullable = false)
    private Integer emplNumber;

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