package com.haulmont.sample.petclinic.web.pet.bird;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.Bird;


@UiController("petclinic_Bird.edit")
@UiDescriptor("bird-edit.xml")
@EditedEntityContainer("birdDc")
@LoadDataBeforeShow
public class BirdEdit extends StandardEditor<Bird> {
}