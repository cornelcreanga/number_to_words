package com.ntw;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.math.BigDecimal;
import java.util.Locale;

public class ICUTest {
    public static void main(String[] args) {
        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat( new Locale("RO", "RO"), RuleBasedNumberFormat.SPELLOUT );
        System.out.println(ruleBasedNumberFormat.format(127687557873.67));
        NumberToWords ntw = NumberToWordsFactory.getConvertor(Locale.forLanguageTag("ro-RO"));
        System.out.println(ntw.convert(new BigDecimal(127687557873.67)));
    }

}
