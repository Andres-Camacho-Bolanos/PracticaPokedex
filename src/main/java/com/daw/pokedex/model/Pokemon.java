package com.daw.pokedex.model;

import java.util.List;

public class Pokemon {
    private int id;
    private String name;
    private String description;
    private int height;
    private int weight;
    private int base_experience;
    private List<TypeSlot> types;
    private List<AbilitySlot> abilities;
    private Sprite sprites;
    private List<StatSlot> stats;
    private List<Evolution> evolutions;

    public Pokemon(int id, String name, String description, int height, int weight, int base_experience, List<TypeSlot> types, List<AbilitySlot> abilities, Sprite sprites, List<StatSlot> stats, List<Evolution> evolutions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.height = height;
        this.weight = weight;
        this.base_experience = base_experience;
        this.types = types;
        this.abilities = abilities;
        this.sprites = sprites;
        this.stats = stats;
        this.evolutions = evolutions;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
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

    public List<StatSlot> getStats() {
        return stats;
    }

    public void setStats(List<StatSlot> stats) {
        this.stats = stats;
    }

    public List<Evolution> getEvolutions() {
        return evolutions;
    }

    public void setEvolutions(List<Evolution> evolutions) {
        this.evolutions = evolutions;
    }

}
