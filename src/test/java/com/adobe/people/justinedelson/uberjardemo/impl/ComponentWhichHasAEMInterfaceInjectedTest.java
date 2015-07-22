package com.adobe.people.justinedelson.uberjardemo.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.PageManagerFactory;

@RunWith(MockitoJUnitRunner.class)
public class ComponentWhichHasAEMInterfaceInjectedTest {

    @InjectMocks
    private ComponentWhichHasAEMInterfaceInjected instance;

    @Mock
    private Page page;

    @Mock
    private PageManager pageManager;

    @Mock
    private PageManagerFactory pageManagerFactory;

    @Mock
    private Resource resource;

    @Mock
    private ResourceResolver resourceResolver;

    @Test
    public void test_that_long_string_is_trimmed() {
        when(resource.getResourceResolver()).thenReturn(resourceResolver);
        when(pageManagerFactory.getPageManager(resourceResolver)).thenReturn(pageManager);
        when(pageManager.getContainingPage(resource)).thenReturn(page);
        when(page.getTitle()).thenReturn("a really really really really really long string");

        assertEquals("a really", instance.getTrimmedTitle(resource, 8));
    }

}
