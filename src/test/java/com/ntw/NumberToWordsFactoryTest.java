package com.ntw;

import org.junit.Test;

import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class NumberToWordsFactoryTest {
    @Test
    public void testGetRoConvertor() throws Exception {
        assertThat(NumberToWordsFactory.getConvertor(Locale.forLanguageTag("ro-RO")), notNullValue());
    }

    @Test(expected = ConvertorNotFoundException.class)
    public void testGetEnConvertor() throws Exception {
        NumberToWordsFactory.getConvertor(Locale.forLanguageTag("en-EN"));
    }

}


