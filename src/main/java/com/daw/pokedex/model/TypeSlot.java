package com.daw.pokedex.model;

public class TypeSlot {
    private Type type;
    private int slot;

    public TypeSlot(Type type, int slot) {
        this.type = type;
        this.slot = slot;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
