package com.daw.pokedex.model;

import java.util.List;

public class PokemonSummary {
    private int id;
    private String name;
    private int weight;
    private List<TypeSlot> types;
    private List<AbilitySlot> abilities;
    private Sprite sprites;

    public PokemonSummary(int id, String name, int weight, List<TypeSlot> types, List<AbilitySlot> abilities, Sprite sprites) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.types = types;
        this.abilities = abilities;
        this.sprites = sprites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<TypeSlot> getTypes() {
        return types;
    }

    public void setTypes(List<TypeSlot> types) {
        this.types = types;
    }

    public List<AbilitySlot> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<AbilitySlot> abilities) {
        this.abilities = abilities;
    }

    public Sprite getSprites() {
        return sprites;
    }

    public void setSprites(Sprite sprites) {
        this.sprites = sprites;
    }
}
