package com.haulmont.sample.petclinic.web.visit.catvisit;

import com.haulmont.cuba.gui.actions.picker.LookupAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.Pet;
import com.haulmont.sample.petclinic.entity.visit.CatVisit;

import javax.inject.Inject;
import javax.inject.Named;


@UiController("petclinic_CatVisit.edit")
@UiDescriptor("cat-visit-edit.xml")
@EditedEntityContainer("catVisitDc")
@LoadDataBeforeShow
public class CatVisitEdit extends StandardEditor<CatVisit> {


    
}