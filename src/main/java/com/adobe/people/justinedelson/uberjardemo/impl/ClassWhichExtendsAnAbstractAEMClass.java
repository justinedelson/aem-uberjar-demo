package com.adobe.people.justinedelson.uberjardemo.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

import com.day.cq.dam.commons.process.AbstractAssetWorkflowProcess;
import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.metadata.MetaDataMap;

@Component
@Service
@Property(name = "process.label", value = "Demo Workflow")
public class ClassWhichExtendsAnAbstractAEMClass extends AbstractAssetWorkflowProcess {

    @Override
    public void execute(WorkItem item, WorkflowSession session, MetaDataMap args) throws WorkflowException {
        // TODO Auto-generated method stub

    }

}
