package com.haulmont.sample.petclinic.web.visit.visit;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.visit.CatVisit;
import com.haulmont.sample.petclinic.entity.visit.Visit;

import javax.inject.Inject;

@UiController("petclinic_Visit.browse")
@UiDescriptor("visit-browse.xml")
@LookupComponent("visitsTable")
@LoadDataBeforeShow
public class VisitBrowse extends StandardLookup<Visit> {


    @Inject
    protected ScreenBuilders screenBuilders;

    @Inject
    protected GroupTable<Visit> visitsTable;

    @Inject
    protected Metadata metadata;

    @Subscribe("createBtn.createCatVisit")
    protected void onCreateBtnCreateCatVisit(Action.ActionPerformedEvent event) {
        CatVisit catVisit = metadata.create(CatVisit.class);
        showCreateEditorForVisit(catVisit);
    }

    @Subscribe("createBtn.createVisit")
    protected void onCreateVisit(Action.ActionPerformedEvent event) {
        Visit visit = metadata.create(Visit.class);
        showCreateEditorForVisit(visit);
    }

    private void showCreateEditorForVisit(Visit visit) {
        screenBuilders.editor(visitsTable)
                .editEntity(visit)
                .build()
                .show();
    }


}