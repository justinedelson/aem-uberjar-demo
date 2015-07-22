package com.adobe.people.justinedelson.uberjardemo.impl;

import org.apache.commons.lang.StringUtils;

import com.day.cq.wcm.api.Page;

public class ClassWhichHasAEMInterfacePassedIn {

    /**
     * Get the first length characters of the page title.
     */
    public String getTrimmedTitle(Page page, int length) {
        String title = page.getTitle();
        return StringUtils.left(title, length);
    }

}
