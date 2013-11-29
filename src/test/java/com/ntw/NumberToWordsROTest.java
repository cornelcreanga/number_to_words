package com.ntw;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class NumberToWordsROTest {
    @Test
    public void testConvertNumberToWords() throws Exception {
        NumberToWordsRO ntw = new NumberToWordsRO();
        assertThat(ntw.convert(new BigDecimal("0")),equalTo("zero ron"));
        assertThat(ntw.convert(new BigDecimal("1")),equalTo("unu ron"));
        assertThat(ntw.convert(new BigDecimal("2")),equalTo("doi ron"));
        assertThat(ntw.convert(new BigDecimal("3")),equalTo("trei ron"));
        assertThat(ntw.convert(new BigDecimal("4")),equalTo("patru ron"));
        assertThat(ntw.convert(new BigDecimal("5")),equalTo("cinci ron"));
        assertThat(ntw.convert(new BigDecimal("6")),equalTo("șase ron"));
        assertThat(ntw.convert(new BigDecimal("7")),equalTo("șapte ron"));
        assertThat(ntw.convert(new BigDecimal("8")),equalTo("opt ron"));
        assertThat(ntw.convert(new BigDecimal("9")),equalTo("nouă ron"));
        assertThat(ntw.convert(new BigDecimal("10")),equalTo("zece ron"));
        assertThat(ntw.convert(new BigDecimal("11")),equalTo("unspre zece ron"));
        assertThat(ntw.convert(new BigDecimal("12")),equalTo("doisprezece ron"));
        assertThat(ntw.convert(new BigDecimal("13")),equalTo("treisprezece ron"));
        assertThat(ntw.convert(new BigDecimal("14")),equalTo("patrusprezece ron"));
        assertThat(ntw.convert(new BigDecimal("15")),equalTo("cincisprezece ron"));
        assertThat(ntw.convert(new BigDecimal("16")),equalTo("șaisprezece ron"));
        assertThat(ntw.convert(new BigDecimal("17")),equalTo("șaptesprezece ron"));
        assertThat(ntw.convert(new BigDecimal("18")),equalTo("optsprezece ron"));
        assertThat(ntw.convert(new BigDecimal("19")),equalTo("nouăsprezece ron"));
        assertThat(ntw.convert(new BigDecimal("20")),equalTo("douăzeci de ron"));
        assertThat(ntw.convert(new BigDecimal("21")),equalTo("douăzeci și unu de ron"));
        assertThat(ntw.convert(new BigDecimal("22")),equalTo("douăzeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("23")),equalTo("douăzeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("24")),equalTo("douăzeci și patru de ron"));
        assertThat(ntw.convert(new BigDecimal("25")),equalTo("douăzeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("26")),equalTo("douăzeci și șase de ron"));
        assertThat(ntw.convert(new BigDecimal("27")),equalTo("douăzeci și șapte de ron"));
        assertThat(ntw.convert(new BigDecimal("28")),equalTo("douăzeci și opt de ron"));
        assertThat(ntw.convert(new BigDecimal("29")),equalTo("douăzeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("30")),equalTo("treizeci de ron"));
        assertThat(ntw.convert(new BigDecimal("31")),equalTo("treizeci și unu de ron"));
        assertThat(ntw.convert(new BigDecimal("32")),equalTo("treizeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("33")),equalTo("treizeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("34")),equalTo("treizeci și patru de ron"));
        assertThat(ntw.convert(new BigDecimal("35")),equalTo("treizeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("36")),equalTo("treizeci și șase de ron"));
        assertThat(ntw.convert(new BigDecimal("37")),equalTo("treizeci și șapte de ron"));
        assertThat(ntw.convert(new BigDecimal("38")),equalTo("treizeci și opt de ron"));
        assertThat(ntw.convert(new BigDecimal("39")),equalTo("treizeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("40")),equalTo("patruzeci de ron"));
        assertThat(ntw.convert(new BigDecimal("41")),equalTo("patruzeci și unu de ron"));
        assertThat(ntw.convert(new BigDecimal("42")),equalTo("patruzeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("43")),equalTo("patruzeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("44")),equalTo("patruzeci și patru de ron"));
        assertThat(ntw.convert(new BigDecimal("45")),equalTo("patruzeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("46")),equalTo("patruzeci și șase de ron"));
        assertThat(ntw.convert(new BigDecimal("47")),equalTo("patruzeci și șapte de ron"));
        assertThat(ntw.convert(new BigDecimal("48")),equalTo("patruzeci și opt de ron"));
        assertThat(ntw.convert(new BigDecimal("49")),equalTo("patruzeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("50")),equalTo("cincizeci de ron"));
        assertThat(ntw.convert(new BigDecimal("51")),equalTo("cincizeci și unu de ron"));
        assertThat(ntw.convert(new BigDecimal("52")),equalTo("cincizeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("53")),equalTo("cincizeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("54")),equalTo("cincizeci și patru de ron"));
        assertThat(ntw.convert(new BigDecimal("55")),equalTo("cincizeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("56")),equalTo("cincizeci și șase de ron"));
        assertThat(ntw.convert(new BigDecimal("57")),equalTo("cincizeci și șapte de ron"));
        assertThat(ntw.convert(new BigDecimal("58")),equalTo("cincizeci și opt de ron"));
        assertThat(ntw.convert(new BigDecimal("59")),equalTo("cincizeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("60")),equalTo("șaizeci de ron"));
        assertThat(ntw.convert(new BigDecimal("61")),equalTo("șaizeci și unu de ron"));
        assertThat(ntw.convert(new BigDecimal("62")),equalTo("șaizeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("63")),equalTo("șaizeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("64")),equalTo("șaizeci și patru de ron"));
        assertThat(ntw.convert(new BigDecimal("65")),equalTo("șaizeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("66")),equalTo("șaizeci și șase de ron"));
        assertThat(ntw.convert(new BigDecimal("67")),equalTo("șaizeci și șapte de ron"));
        assertThat(ntw.convert(new BigDecimal("68")),equalTo("șaizeci și opt de ron"));
        assertThat(ntw.convert(new BigDecimal("69")),equalTo("șaizeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("70")),equalTo("șaptezeci de ron"));
        assertThat(ntw.convert(new BigDecimal("71")),equalTo("șaptezeci și unu de ron"));
        assertThat(ntw.convert(new BigDecimal("72")),equalTo("șaptezeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("73")),equalTo("șaptezeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("74")),equalTo("șaptezeci și patru de ron"));
        assertThat(ntw.convert(new BigDecimal("75")),equalTo("șaptezeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("76")),equalTo("șaptezeci și șase de ron"));
        assertThat(ntw.convert(new BigDecimal("77")),equalTo("șaptezeci și șapte de ron"));
        assertThat(ntw.convert(new BigDecimal("78")),equalTo("șaptezeci și opt de ron"));
        assertThat(ntw.convert(new BigDecimal("79")),equalTo("șaptezeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("80")),equalTo("optzeci de ron"));
        assertThat(ntw.convert(new BigDecimal("81")),equalTo("optzeci și unu de ron"));
        assertThat(ntw.convert(new BigDecimal("82")),equalTo("optzeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("83")),equalTo("optzeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("84")),equalTo("optzeci și patru de ron"));
        assertThat(ntw.convert(new BigDecimal("85")),equalTo("optzeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("86")),equalTo("optzeci și șase de ron"));
        assertThat(ntw.convert(new BigDecimal("87")),equalTo("optzeci și șapte de ron"));
        assertThat(ntw.convert(new BigDecimal("88")),equalTo("optzeci și opt de ron"));
        assertThat(ntw.convert(new BigDecimal("89")),equalTo("optzeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("90")),equalTo("nouăzeci de ron"));
        assertThat(ntw.convert(new BigDecimal("91")),equalTo("nouăzeci și unu de ron"));
        assertThat(ntw.convert(new BigDecimal("92")),equalTo("nouăzeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("93")),equalTo("nouăzeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("94")),equalTo("nouăzeci și patru de ron"));
        assertThat(ntw.convert(new BigDecimal("95")),equalTo("nouăzeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("96")),equalTo("nouăzeci și șase de ron"));
        assertThat(ntw.convert(new BigDecimal("97")),equalTo("nouăzeci și șapte de ron"));
        assertThat(ntw.convert(new BigDecimal("98")),equalTo("nouăzeci și opt de ron"));
        assertThat(ntw.convert(new BigDecimal("99")),equalTo("nouăzeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("100")),equalTo("o sută de ron"));
        assertThat(ntw.convert(new BigDecimal("16")),equalTo("șaisprezece ron"));
        assertThat(ntw.convert(new BigDecimal("23")),equalTo("douăzeci și trei de ron"));
        assertThat(ntw.convert(new BigDecimal("145")),equalTo("o sută patruzeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("245")),equalTo("două sute patruzeci și cinci de ron"));
        assertThat(ntw.convert(new BigDecimal("1000")),equalTo("o mie de ron"));
        assertThat(ntw.convert(new BigDecimal("1400")),equalTo("o mie patru sute de ron"));
        assertThat(ntw.convert(new BigDecimal("2012")),equalTo("două mii doisprezece de ron"));
        assertThat(ntw.convert(new BigDecimal("152342")),equalTo("o sută cincizeci și doi de mii trei sute patruzeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("999999")),equalTo("nouă sute nouăzeci și nouă de mii nouă sute nouăzeci și nouă de ron"));
        assertThat(ntw.convert(new BigDecimal("1000200")),equalTo("un milion două sute de ron"));
        assertThat(ntw.convert(new BigDecimal("2000110")),equalTo("două milioane o sută zece de ron"));
        assertThat(ntw.convert(new BigDecimal("165124842")),equalTo("o sută șaizeci și cinci de milioane o sută douăzeci și patru de mii opt sute patruzeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("100000000")),equalTo("o sută de milioane de ron"));
        assertThat(ntw.convert(new BigDecimal("365124842")),equalTo("trei sute șaizeci și cinci de milioane o sută douăzeci și patru de mii opt sute patruzeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("1000000001")),equalTo("un miliard unu de ron"));
        assertThat(ntw.convert(new BigDecimal("31365124842")),equalTo("treizeci și unu de miliarde trei sute șaizeci și cinci de milioane o sută douăzeci și patru de mii opt sute patruzeci și doi de ron"));
        assertThat(ntw.convert(new BigDecimal("1111365124842")),equalTo("un trilion o sută unspre zece de miliarde trei sute șaizeci și cinci de milioane o sută douăzeci și patru de mii opt sute patruzeci și doi ron"));
        assertThat(ntw.convert(new BigDecimal("3331365124842")),equalTo("trei trilioane trei sute treizeci și unu de miliarde trei sute șaizeci și cinci de milioane o sută douăzeci și patru de mii opt sute patruzeci și doi ron"));
        assertThat(ntw.convert(new BigDecimal("23.45")),equalTo("douăzeci și trei de ron și patruzeci și cinci de bani"));
        assertThat(ntw.convert(new BigDecimal("12.03")),equalTo("doisprezece ron și trei bani"));
        assertThat(ntw.convert(new BigDecimal("0.34")),equalTo("zero ron și treizeci și patru de bani"));
    }


}