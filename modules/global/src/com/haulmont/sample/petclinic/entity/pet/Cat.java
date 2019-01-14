package com.haulmont.sample.petclinic.entity.pet;

import javax.persistence.*;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@DiscriminatorValue("CAT")
@Table(name = "PETCLINIC_CAT")
@Entity(name = "petclinic_Cat")
public class Cat extends Pet {
    @Column(name = "CLAW_LENGTH")
    protected Integer clawLength;

    public Integer getClawLength() {
        return clawLength;
    }

    public void setClawLength(Integer clawLength) {
        this.clawLength = clawLength;
    }
}