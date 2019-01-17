package com.haulmont.sample.petclinic.entity.pet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "PETCLINIC_RAT")
@Entity(name = "petclinic_Rat")
public class Rat extends Pet {
    @Column(name = "TAIL_LENGTH")
    protected Integer tailLength;

    public Integer getTailLength() {
        return tailLength;
    }

    public void setTailLength(Integer tailLength) {
        this.tailLength = tailLength;
    }
}