package io.robe.common.utils;

import io.robe.common.TestUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by serayuzgur on 28/05/16.
 */
public class StringsOperationsTest {

    @Test
    public void constructor() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        TestUtils.privateConstructor(StringsOperations.class);
    }

    @Test
    public void capitalizeFirstChar() throws Exception {
        String expected = "Id";
        String data = "id";
        Assert.assertEquals(expected, StringsOperations.capitalizeFirstChar(data));
    }

    @Test
    public void unCapitalizeFirstChar() throws Exception {
        String expected = "id";
        String data = "Id";
        Assert.assertEquals(expected, StringsOperations.unCapitalizeFirstChar(data));
    }
}