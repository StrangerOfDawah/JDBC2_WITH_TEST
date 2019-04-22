package com.jdbc;

public class Cities{
   private int id_City;
   private String name_city;
   private String country_code;
   private String district;
   private int population;

    public Cities() {
    }

    public Cities(String name_city) {
        this.name_city = name_city;
    }

    public Cities(int id_City, String name_city, String country_code, String district, int population) {
            this.id_City = id_City;
            this.name_city = name_city;
            this.country_code = country_code;
            this.district = district;
            this.population = population;
        }

        public String getName_city() {
            return name_city;
        }

        @Override
        public String toString() {
            return "InfoOfCities: \n" + "City's Id: " + id_City + "\n" +
                    "City's name: " + name_city + "\n" +
                    "Country's code: " + country_code + "\n" +
                    "The district: " + district + "\n" +
                    "A population: " +population ;

    }
}
