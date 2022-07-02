package com.example.appnaruto;

public class Character {
    public String name;
    public String clan;
    public String village;
    public String jutsu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getJutsu() {
        return jutsu;
    }

    public void setJutsu(String jutsu) {
        this.jutsu = jutsu;
    }

    public Character(String name, String clan, String village, String jutsu) {
        this.name = name;
        this.clan = clan;
        this.village = village;
        this.jutsu = jutsu;
    }
}
