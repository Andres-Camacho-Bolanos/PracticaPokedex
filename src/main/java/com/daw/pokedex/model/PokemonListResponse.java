package com.daw.pokedex.model;

import java.util.List;

public class PokemonListResponse {
    private int count;
    private List<PokemonSummary> items;

    public PokemonListResponse(int count, List<PokemonSummary> items) {
        this.count = count;
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<PokemonSummary> getItems() {
        return items;
    }

    public void setItems(List<PokemonSummary> items) {
        this.items = items;
    }
}
