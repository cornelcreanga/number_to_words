package com.ntw;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class NumberToWordsRO implements NumberToWords {
    public static final String RON = "ron";
    public static final String BAN = "ban";
    public static final long TRILLION = 1_000_000_000_000l;
    public static final int BILLION = 1_000_000_000;
    public static final int MILLION = 1_000_000;
    public static final int THOUSAND = 1000;
    public static final int HUNDRED = 100;
    public static final String[] SYMBOLS = new String[]{"",
            "unu",
            "doi",
            "trei",
            "patru",
            "cinci",
            "șase",
            "șapte",
            "opt",
            "nouă",
            "zece",
            "unspre zece",
            "doisprezece",
            "treisprezece",
            "patrusprezece",
            "cincisprezece",
            "șaisprezece",
            "șaptesprezece",
            "optsprezece",
            "nouăsprezece",
            "douăzeci",
            "douăzeci și unu",
            "douăzeci și doi",
            "douăzeci și trei",
            "douăzeci și patru",
            "douăzeci și cinci",
            "douăzeci și șase",
            "douăzeci și șapte",
            "douăzeci și opt",
            "douăzeci și nouă",
            "treizeci",
            "treizeci și unu",
            "treizeci și doi",
            "treizeci și trei",
            "treizeci și patru",
            "treizeci și cinci",
            "treizeci și șase",
            "treizeci și șapte",
            "treizeci și opt",
            "treizeci și nouă",
            "patruzeci",
            "patruzeci și unu",
            "patruzeci și doi",
            "patruzeci și trei",
            "patruzeci și patru",
            "patruzeci și cinci",
            "patruzeci și șase",
            "patruzeci și șapte",
            "patruzeci și opt",
            "patruzeci și nouă",
            "cincizeci",
            "cincizeci și unu",
            "cincizeci și doi",
            "cincizeci și trei",
            "cincizeci și patru",
            "cincizeci și cinci",
            "cincizeci și șase",
            "cincizeci și șapte",
            "cincizeci și opt",
            "cincizeci și nouă",
            "șaizeci",
            "șaizeci și unu",
            "șaizeci și doi",
            "șaizeci și trei",
            "șaizeci și patru",
            "șaizeci și cinci",
            "șaizeci și șase",
            "șaizeci și șapte",
            "șaizeci și opt",
            "șaizeci și nouă",
            "șaptezeci",
            "șaptezeci și unu",
            "șaptezeci și doi",
            "șaptezeci și trei",
            "șaptezeci și patru",
            "șaptezeci și cinci",
            "șaptezeci și șase",
            "șaptezeci și șapte",
            "șaptezeci și opt",
            "șaptezeci și nouă",
            "optzeci",
            "optzeci și unu",
            "optzeci și doi",
            "optzeci și trei",
            "optzeci și patru",
            "optzeci și cinci",
            "optzeci și șase",
            "optzeci și șapte",
            "optzeci și opt",
            "optzeci și nouă",
            "nouăzeci",
            "nouăzeci și unu",
            "nouăzeci și doi",
            "nouăzeci și trei",
            "nouăzeci și patru",
            "nouăzeci și cinci",
            "nouăzeci și șase",
            "nouăzeci și șapte",
            "nouăzeci și opt",
            "nouăzeci și nouă",
            "o sută",
    };

    public NumberToWordsRO() {
        super();
    }

    @Override
    public String convert(BigDecimal number) {
        BigDecimal floatingPart = number.setScale(2, RoundingMode.HALF_EVEN).remainder(BigDecimal.ONE);
        BigDecimal fixedPart = number.subtract(number.remainder(BigDecimal.ONE));
        String s = trillions(fixedPart.longValue());
//        if (fixedPart.intValue() <= 19)
//            s += " " + RON;
//        else
//            s += " de " + RON;
        if (floatingPart.doubleValue() != 0) {
            int val = floatingPart.multiply(new BigDecimal(HUNDRED)).intValue();
            s = s + " virgulă " + convert(val);
        }
//            if (val == 1)
//                s += " " + BAN;
//            else if (val <= 19)
//                s += " " + BAN + "i";
//            else
//                s += " de " + BAN + "i";
//        }
        return s;
    }

    private String toBillions(long n) {
        String s = billions(n - (n / TRILLION) * TRILLION);
        return s.length()!=0?" "+s:s;
    }

    private String toMillions(long n) {
        String s = millions(n - (n / BILLION) * BILLION);
        return s.length()!=0?" "+s:s;
    }

    private String toThousands(long n) {
        String s = thousands(n - (n / MILLION) * MILLION);
        return s.length()!=0?" "+s:s;
    }

    private String toHundreds(long n) {
        String s = hundreds(n - (n / THOUSAND) * THOUSAND);
        return s.length()!=0?" "+s:s;
    }

    private String toSymbol(long n) {
        String s = hundreds(n - (n / HUNDRED) * HUNDRED);
        return s.length()!=0?" "+s:s;
    }

    private String trillions(long n) {
        if (n == 0)
            return "zero";
        if (n < TRILLION)
            return billions(n);
        if ((n >= TRILLION) && (n < 1_999_999_999_999l))
            return "un trilion" + toBillions(n);
        if ((n > 1_999_999_999_999l) && (n < 2_999_999_999_999l))
            return "două trilioane" + toBillions(n);
        return hundreds(n / (TRILLION)) + (n < 19_999_999_999_999l ? " bilioane" : " de bilioane") + toBillions(n);
    }

    private String billions(long n) {
        if (n == 0)
            return "zero";
        if (n < BILLION) return millions(n);
        if ((n >= BILLION) && (n < 1_999_999_999l))
            return "un miliard" + toMillions(n);
        if ((n > 1_999_999_999) && (n < 2_999_999_999l))
            return "două miliarde" + toMillions(n);
        return hundreds(n / BILLION) + (n < 19_999_999_999l ? " miliarde" : " de miliarde") + toMillions(n);
    }

    private String millions(long n) {
        if (n < MILLION) return thousands(n);
        if ((n >= MILLION) && (n < 1_999_999))
            return "un milion" + toThousands(n);
        if ((n > 1_999_999) && (n < 2_999_999))
            return "două milioane" + toThousands(n);
        return hundreds(n / MILLION) + (n < 19_999_999l ? " milioane" : " de milioane") + toThousands(n);
    }

    private String thousands(long n) {
        if (n < THOUSAND) return hundreds(n);
        if ((n >= THOUSAND) && (n < 1999))
            return "o mie" + toHundreds(n);
        if ((n > 1999) && (n < 2999))
            return "două mii" + toHundreds(n);
        return hundreds(n / THOUSAND) + (n < 19999l ? " mii" : " de mii") + toHundreds(n);
    }

    private String hundreds(long n) {
        if ((n >= 0) && (n < HUNDRED))
            return convert(n);
        if ((n >= HUNDRED) && (n < 199))
            return "o sută" + toSymbol(n - ((n / 100) * 100));
        if ((n > 199) && (n < 299))
            return "două sute" + toSymbol(n - ((n / 100) * 100));
        else return convert(n / HUNDRED) + " sute" + toSymbol(n - ((n / 100) * 100));
    }

    private String convert(long number) {
        return SYMBOLS[(int) number];
    }

}

