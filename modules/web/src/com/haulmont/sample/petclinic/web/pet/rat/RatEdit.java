package com.haulmont.sample.petclinic.web.pet.rat;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.Rat;


@UiController("petclinic_Rat.edit")
@UiDescriptor("rat-edit.xml")
@EditedEntityContainer("ratDc")
@LoadDataBeforeShow
public class RatEdit extends StandardEditor<Rat> {
}