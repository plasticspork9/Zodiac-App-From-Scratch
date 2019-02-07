package com.example.zodiacappfromscratch.model;

import java.util.List;

public class Zodiac {
    private List<ZodiacModel> zodiac;

    public Zodiac(List<ZodiacModel> zodiacModelList) {
        this.zodiac = zodiacModelList;
    }

    public List<ZodiacModel> getZodiac() {
        return zodiac;
    }

    public void setZodiac(List<ZodiacModel> zodiac) {
        this.zodiac = zodiac;
    }
}
