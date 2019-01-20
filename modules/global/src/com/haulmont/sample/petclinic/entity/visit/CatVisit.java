package com.haulmont.sample.petclinic.entity.visit;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("CATVISIT")
@Entity(name = "petclinic_CatVisit")
public class CatVisit extends Visit {
    @Column(name = "CAT_TREE_REQUIRED")
    protected Boolean catTreeRequired;

    public Boolean getCatTreeRequired() {
        return catTreeRequired;
    }

    public void setCatTreeRequired(Boolean catTreeRequired) {
        this.catTreeRequired = catTreeRequired;
    }
}