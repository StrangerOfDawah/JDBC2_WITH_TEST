package com.Application;

import com.jdbc.Cities;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JustChoiceYourCityTest {


    @Test
    public void guessTheCity() {
        JustChoiceYourCity theCity = new JustChoiceYourCity();
        Cities expect = new Cities(3580, "Moscow", "RUS", "Moscow (City)", 8389200);

    }
}