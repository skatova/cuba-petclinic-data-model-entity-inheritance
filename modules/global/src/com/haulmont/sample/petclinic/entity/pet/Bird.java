package com.haulmont.sample.petclinic.entity.pet;

import javax.persistence.*;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@DiscriminatorValue("BIRD")
@Table(name = "PETCLINIC_BIRD")
@Entity(name = "petclinic_Bird")
public class Bird extends Pet {
    @Column(name = "WING_SPREAD")
    protected Integer wingSpread;

    @Column(name = "BEAK_LENGTH")
    protected Integer beakLength;

    public Integer getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(Integer beakLength) {
        this.beakLength = beakLength;
    }

    public Integer getWingSpread() {
        return wingSpread;
    }

    public void setWingSpread(Integer wingSpread) {
        this.wingSpread = wingSpread;
    }
}