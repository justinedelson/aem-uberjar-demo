package com.adobe.people.justinedelson.uberjardemo.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;

import com.adobe.people.justinedelson.uberjardemo.TitleTrimmer;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.PageManagerFactory;

@Component
@Service
public class ComponentWhichHasAEMInterfaceInjected implements TitleTrimmer {

    @Reference
    private PageManagerFactory pageManagerFactory;
 
    /**
     * Get the first length characters of the title of the page containing the provided Resource.
     */ 
    public String getTrimmedTitle(Resource resource, int length) {
        PageManager pageManager = pageManagerFactory.getPageManager(resource.getResourceResolver());
        Page page = pageManager.getContainingPage(resource);
        if (page == null) {
           return null;
        }
        String title = page.getTitle();
        return StringUtils.left(title, length);
    }
}
