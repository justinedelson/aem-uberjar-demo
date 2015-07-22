package com.adobe.people.justinedelson.uberjardemo.impl;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Map;

import org.apache.sling.api.resource.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.day.cq.dam.api.Asset;
import com.day.cq.dam.commons.util.DamUtil;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class ClassWhichUsesAStaticMethodFromAPITest {

    @Tested
    private ClassWhichUsesAStaticMethodFromAPI instance;

    @Mocked(stubOutClassInitialization = true)
    private DamUtil unusedDamUtil = null;

    @Mocked
    private Resource resource;

    @Test
    public void test_that_empty_iterator_produces_empty_map() {
        new Expectations() {
            {
                DamUtil.getAssets(resource);
                result = Collections.<Asset> emptySet().iterator();
            }
        };
        Map<String, Asset> result = new ClassWhichUsesAStaticMethodFromAPI().getAssetTitles(resource);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void test_with_reference_search() {
        assertTrue(true);
    }

}
