package com.haulmont.sample.petclinic.web.pet.cat;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.Cat;


@UiController("petclinic_Cat.edit")
@UiDescriptor("cat-edit.xml")
@EditedEntityContainer("catDc")
@LoadDataBeforeShow
public class CatEdit extends StandardEditor<Cat> {
}