package com.Application;

import com.jdbc.Cities;

import java.io.*;
import java.util.List;

public class JustChoiceYourCity {
    public void guessTheCity(List <Cities> list2){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Please choice a city for info: ");
            String theCity = null;
            while(!(theCity = br.readLine()).equals("exit")){           //Пользователь должен ввести город без учета регистра
                for (Cities aCity: list2) {                             //но только на английском языке.
                    if (theCity.length() == 0) {
                        System.out.println("Your statement is empty. Please write something!"); break;
                    } else if (theCity.length() == 1) {
                        System.out.println("Incomplete input format! Please try again.");break;
                      } else if (theCity.length()==aCity.getName_city().length()){  //Здесь введется исправление регистра.
                        theCity = theCity.substring(0, 1).toUpperCase()             //для сопоставления с данными.
                                + theCity.substring(1).toLowerCase();
                            if (theCity.equals(aCity.getName_city())){
                                System.out.println(aCity + "\n");
                                break;
                            }
                        }

                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
