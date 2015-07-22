package com.adobe.people.justinedelson.uberjardemo.impl;

import org.apache.sling.api.resource.Resource;

import com.day.cq.wcm.foundation.ParagraphSystem;

public class ClassWhichUsesAnInstanceMethodFromAPI {
    
    /**
     * Count the number of paragraphs in a parsys.
     * 
     * @param resource the parsys resource
     * @return the count
     */
    public int countParagraphs(Resource resource) {
        return new ParagraphSystem(resource).paragraphs().size();
    }

}
