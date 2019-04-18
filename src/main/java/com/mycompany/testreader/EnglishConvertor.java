/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testreader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Prithivi Raj Pandey
 */
public class EnglishConvertor {

    String strBSDate = "";

    String EnglishConvertor(String Englishdate) {
        try {
            final DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD");
            Calendar objCalender = Calendar.getInstance();
            objCalender.setTime(formatter.parse(Englishdate.toString()));
            int CurrentDay = objCalender.get(Calendar.DAY_OF_YEAR);
            int CurrentYear = objCalender.get(Calendar.YEAR);
            int[] npDateData = GetNepaliDateDataArray(CurrentYear);

            int enDayOfYear = CurrentDay;

            int npYear = npDateData[0];

            //Initializing Nepali month to Poush (9)
            int npMonth = 9;

            int npDaysInMonth = npDateData[2];

            //Initializing temp nepali days
            int npTempDays = npDateData[2] - npDateData[1] + 1;

            //Looping through Nepali date data array to get exact Nepali month, Nepali year & Nepali daysInMonth information
            for (int i = 3; enDayOfYear > npTempDays; i++) {
                npTempDays += npDateData[i];
                npDaysInMonth = npDateData[i];
                npMonth++;

                if (npMonth > 12) {
                    npMonth -= 12;
                    npYear++;
                }
            }

            //Calculating Nepali day
            int npDay = npDaysInMonth - (npTempDays - enDayOfYear);
            int npDaylength = String.valueOf(npDay).length();
            int npMonthlength = String.valueOf(npMonth).length();

            String nepaliDay = "";
            String nepaliMonth = "";
            if (npDaylength < 2) {
                String zero = "0";
                StringBuilder sb = new StringBuilder(String.valueOf(zero));
                sb.append(npDay);
                String zeroaddedDay = sb.toString();
                nepaliDay = zeroaddedDay;

            }
            if (npMonthlength < 2) {
                String zero = "0";
                StringBuilder sb = new StringBuilder(String.valueOf(zero));
                sb.append(npMonth);
                String zeroaddedMonth = sb.toString();
                nepaliMonth = zeroaddedMonth;
            }
            if (npDaylength < 2 && !(npMonthlength < 2)) {
                strBSDate = npYear + "/" + npMonth + "/" + nepaliDay;
            } else if (npMonthlength < 2 && !(npDaylength < 2)) {
                strBSDate = npYear + "/" + nepaliMonth + "/" + npDay;
            } else if (npMonthlength < 2 && npDaylength < 2) {
                strBSDate = npYear + "/" + nepaliMonth + "/" + nepaliDay;
            } else {
                strBSDate = npYear + "/" + npMonth + "/" + npDay;
            }

            //strBSDate = npYear  + "/"+npMonth + "/" + npDay;
            //strBSDate = String.format("{0}-{1}-{2}", npMonth, npDay,npYear);
            return strBSDate;

        } catch (Exception e) {
            System.out.println("inside date convertor " + e.getLocalizedMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
            //throw new IndexOutOfBoundsException(e.getMessage());

        }
        return null;

    }

private int[] GetNepaliDateDataArray(int year) {
        switch (year) {

            case 1919:
                return new int[]{1975, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1920:
                return new int[]{1976, 17, 29, 29, 30, 31, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1921:
                return new int[]{1977, 18, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1922:
                return new int[]{1978, 18, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1923:
                return new int[]{1979, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1924:
                return new int[]{1980, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 1925:
                return new int[]{1981, 18, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1926:
                return new int[]{1982, 18, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1927:
                return new int[]{1983, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1928:
                return new int[]{1984, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 1929:
                return new int[]{1985, 18, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1930:
                return new int[]{1986, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 29, 30};

            case 1931:
                return new int[]{1987, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1932:
                return new int[]{1988, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 30, 29, 30};

            case 1933:
                return new int[]{1989, 18, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1934:
                return new int[]{1990, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 29, 30};

            case 1935:
                return new int[]{1991, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1936:
                return new int[]{1992, 17, 29, 30, 29, 31, 31, 31, 31, 32, 31, 31, 30, 29, 30};

            case 1937:
                return new int[]{1993, 18, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1938:
                return new int[]{1994, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1939:
                return new int[]{1995, 17, 29, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1940:
                return new int[]{1996, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1941:
                return new int[]{1997, 18, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1942:
                return new int[]{1998, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1943:
                return new int[]{1999, 17, 29, 29, 30, 31, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1944:
                return new int[]{2000, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1945:
                return new int[]{2001, 18, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1946:
                return new int[]{2002, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1947:
                return new int[]{2003, 17, 29, 29, 30, 31, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1948:
                return new int[]{2004, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1949:
                return new int[]{2005, 17, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1950:
                return new int[]{2006, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1951:
                return new int[]{2007, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 1952:
                return new int[]{2008, 17, 30, 29, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1953:
                return new int[]{2009, 18, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1954:
                return new int[]{2010, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1955:
                return new int[]{2011, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 1956:
                return new int[]{2012, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1957:
                return new int[]{2013, 18, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1958:
                return new int[]{2014, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1959:
                return new int[]{2015, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 1960:
                return new int[]{2016, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1961:
                return new int[]{2017, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 29, 30};

            case 1962:
                return new int[]{2018, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1963:
                return new int[]{2019, 17, 29, 30, 29, 31, 31, 31, 31, 32, 31, 31, 30, 29, 30};

            case 1964:
                return new int[]{2020, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1965:
                return new int[]{2021, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1966:
                return new int[]{2022, 17, 29, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1967:
                return new int[]{2023, 17, 29, 30, 29, 31, 31, 31, 31, 32, 31, 31, 30, 29, 30};

            case 1968:
                return new int[]{2024, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1969:
                return new int[]{2025, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1970:
                return new int[]{2026, 17, 29, 29, 30, 31, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1971:
                return new int[]{2027, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1972:
                return new int[]{2028, 17, 30, 29, 30, 30, 31, 31, 32, 31, 32, 30, 30, 29, 30};

            case 1973:
                return new int[]{2029, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1974:
                return new int[]{2030, 17, 29, 29, 30, 31, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1975:
                return new int[]{2031, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1976:
                return new int[]{2032, 17, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1977:
                return new int[]{2033, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1978:
                return new int[]{2034, 17, 29, 29, 30, 31, 30, 32, 31, 32, 31, 31, 29, 30, 30};

            case 1979:
                return new int[]{2035, 17, 30, 29, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1980:
                return new int[]{2036, 17, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1981:
                return new int[]{2037, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1982:
                return new int[]{2038, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 1983:
                return new int[]{2039, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1984:
                return new int[]{2040, 17, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 1985:
                return new int[]{2041, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1986:
                return new int[]{2042, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 1987:
                return new int[]{2043, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1988:
                return new int[]{2044, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 29, 30};

            case 1989:
                return new int[]{2045, 18, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1990:
                return new int[]{2046, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 30, 29, 30};

            case 1991:
                return new int[]{2047, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1992:
                return new int[]{2048, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1993:
                return new int[]{2049, 17, 29, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1994:
                return new int[]{2050, 17, 29, 30, 29, 31, 31, 31, 31, 32, 31, 31, 30, 29, 30};

            case 1995:
                return new int[]{2051, 18, 31, 29, 30, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1996:
                return new int[]{2052, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1997:
                return new int[]{2053, 17, 29, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 1998:
                return new int[]{2054, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 1999:
                return new int[]{2055, 17, 30, 29, 30, 30, 31, 31, 32, 31, 32, 30, 30, 29, 30};

            case 2000:
                return new int[]{2056, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2001:
                return new int[]{2057, 17, 29, 29, 30, 31, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2002:
                return new int[]{2058, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 2003:
                return new int[]{2059, 17, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 2004:
                return new int[]{2060, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2005:
                return new int[]{2061, 17, 29, 29, 30, 31, 30, 32, 31, 32, 31, 31, 29, 30, 29};

            case 2006:
                return new int[]{2062, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 2007:
                return new int[]{2063, 17, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 2008:
                return new int[]{2064, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2009:
                return new int[]{2065, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 2010:
                return new int[]{2066, 17, 30, 29, 29, 31, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 2011:
                return new int[]{2067, 17, 30, 29, 30, 30, 31, 31, 32, 32, 31, 30, 30, 29, 30};

            case 2012:
                return new int[]{2068, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2013:
                return new int[]{2069, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 29, 30, 30};

            case 2014:
                return new int[]{2070, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 2015:
                return new int[]{2071, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 29, 30};

            case 2016:
                return new int[]{2072, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2017:
                return new int[]{2073, 17, 29, 29, 30, 31, 31, 31, 31, 32, 31, 31, 30, 29, 30};

            case 2018:
                return new int[]{2074, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 2019:
                return new int[]{2075, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2020:
                return new int[]{2076, 17, 29, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2021:
                return new int[]{2077, 17, 29, 30, 29, 31, 31, 31, 31, 32, 31, 31, 30, 29, 30};

            case 2022:
                return new int[]{2078, 17, 30, 29, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 2023:
                return new int[]{2079, 17, 30, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2024:
                return new int[]{2080, 16, 29, 29, 30, 30, 31, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2025:
                return new int[]{2081, 17, 29, 30, 29, 31, 31, 31, 32, 31, 31, 30, 30, 30, 29};

            case 2026:
                return new int[]{2082, 17, 29, 30, 30, 30, 31, 31, 32, 31, 31, 30, 30, 30, 29};

            case 2027:
                return new int[]{2083, 17, 29, 30, 30, 30, 31, 31, 32, 31, 31, 30, 30, 30, 29};

            case 2028:
                return new int[]{2084, 17, 29, 30, 30, 30, 31, 32, 31, 32, 30, 31, 30, 30, 29};

            case 2029:
                return new int[]{2085, 17, 29, 30, 30, 30, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2030:
                return new int[]{2086, 17, 29, 30, 30, 30, 31, 31, 32, 31, 31, 31, 30, 29, 30};

            case 2031:
                return new int[]{2087, 17, 30, 30, 30, 30, 30, 31, 32, 32, 30, 31, 30, 30, 29};

            case 2032:
                return new int[]{2088, 16, 29, 30, 30, 30, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            case 2033:
                return new int[]{2089, 17, 29, 30, 30, 30, 30, 32, 31, 32, 31, 30, 30, 30, 29};

            default:
                // throw new ArgumentOutOfRangeException(year.ToString(), "English year is out of range. Can not convert to Nepali date");
                throw new IndexOutOfBoundsException("English year is out of range. Can not convert to Nepali date");
        }
    }
}
