package com.dawidgalziewski.Pokemon;

public class Pokemon {
    public String type;
    public String name;
    public int power;
    public int health;

    public Pokemon(String type, String name, int power, int health) {
        this.type = type;
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public void ExitPokeBall(){
        System.out.println(this.name +  " exits pokeball");
    }

    public void ReturnToPokeBall(){
        System.out.println(this.name +  " returnst o pokeball");
    }
}

;
