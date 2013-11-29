package com.ntw;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class NumberToWordsFactory {

    private static Map<Locale,NumberToWords> convertors = new HashMap<Locale,NumberToWords>();

    static{
        convertors.put(Locale.forLanguageTag("ro-RO"),new NumberToWordsRO());
    }

    public static NumberToWords getConvertor(Locale locale){
        NumberToWords convertor = convertors.get(locale);
        if (convertor==null)
            throw new ConvertorNotFoundException("no convertor found for "+locale);
        return convertor;
    }

}
