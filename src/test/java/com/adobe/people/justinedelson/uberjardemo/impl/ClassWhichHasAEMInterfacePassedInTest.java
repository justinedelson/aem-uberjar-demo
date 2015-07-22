package com.adobe.people.justinedelson.uberjardemo.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.day.cq.wcm.api.Page;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class ClassWhichHasAEMInterfacePassedInTest {

    @Tested
    private ClassWhichHasAEMInterfacePassedIn instance;

    @Mocked
    private Page page;

    @Test
    public void test_that_long_string_is_trimmed() {
        new Expectations() {{
            page.getTitle();
            result = "a really really really really really long string";
        }};

        assertEquals("a really", instance.getTrimmedTitle(page, 8));
    }

}
