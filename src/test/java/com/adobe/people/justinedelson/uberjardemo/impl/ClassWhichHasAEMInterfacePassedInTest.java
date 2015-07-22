package com.adobe.people.justinedelson.uberjardemo.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.day.cq.wcm.api.Page;

public class ClassWhichHasAEMInterfacePassedInTest {

    private ClassWhichHasAEMInterfacePassedIn instance;

    @Before
    public void setup() {
        instance = new ClassWhichHasAEMInterfacePassedIn();
    }

    @Test
    public void test_that_long_string_is_trimmed() {
        Page page = mock(Page.class);
        when(page.getTitle()).thenReturn("a really really really really really long string");
        assertEquals("a really", instance.getTrimmedTitle(page, 8));
    }

}
