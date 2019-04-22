package com.jdbcTest;

import com.jdbc.Cities;
import org.junit.Test;

import static org.junit.Assert.*;

public class CitiesTest {
    @Test
    public void getName_cityTest() {
        Cities city = new Cities("Moscow");
        assertEquals("Moscow",city.getName_city());
    }
}