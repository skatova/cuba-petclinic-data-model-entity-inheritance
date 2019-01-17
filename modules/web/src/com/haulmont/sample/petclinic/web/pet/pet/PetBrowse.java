package com.haulmont.sample.petclinic.web.pet.pet;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.actions.list.CreateAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.sample.petclinic.entity.pet.Bird;
import com.haulmont.sample.petclinic.entity.pet.Cat;
import com.haulmont.sample.petclinic.entity.pet.Pet;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.pet.Rat;
import org.apache.poi.ss.formula.functions.Rate;

import javax.inject.Inject;
import javax.inject.Named;

@UiController("petclinic_Pet.browse")
@UiDescriptor("pet-browse.xml")
@LookupComponent("petsTable")
@LoadDataBeforeShow
public class PetBrowse extends StandardLookup<Pet> {


    @Inject
    protected ScreenBuilders screenBuilders;

    @Inject
    protected GroupTable<Pet> petsTable;

    @Inject
    protected Metadata metadata;

    @Subscribe("createBtn.createCat")
    protected void onCreateBtnCreateCat(Action.ActionPerformedEvent event) {
        showCreateEditorForPet(metadata.create(Cat.class));
    }

    @Subscribe("createBtn.createBird")
    protected void onCreateBtnCreateBird(Action.ActionPerformedEvent event) {
        showCreateEditorForPet(metadata.create(Bird.class));
    }

    @Subscribe("createBtn.createRat")
    protected void onCreateBtnCreateRat(Action.ActionPerformedEvent event) {
        showCreateEditorForPet(metadata.create(Rat.class));
    }

    
    private void showCreateEditorForPet(Pet pet) {
        screenBuilders.editor(petsTable)
                .editEntity(pet)
                .build()
                .show();
    }


}