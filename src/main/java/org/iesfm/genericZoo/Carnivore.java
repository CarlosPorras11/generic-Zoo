package org.iesfm.genericZoo;

import java.util.Objects;

public class Carnivore extends Animal {
    private String meatFeed;

    public Carnivore(String specie, int age, String name, String meatFeed) {
        super(specie, age, name);
        this.meatFeed = meatFeed;
    }

    @Override
    public void showFeed() {
        System.out.println("Soy carnivoro");
    }

    @Override
    public void showSpecificInfo() {
        System.out.println("Tipo de carne: " + meatFeed);
    }

    public String getMeatFeed() {
        return meatFeed;
    }

    public void setMeatFeed(String meatFeed) {
        this.meatFeed = meatFeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carnivore that = (Carnivore) o;
        return Objects.equals(meatFeed, that.meatFeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatFeed);
    }

    @Override
    public String toString() {
        return "Carnivores{" +
                "feed='" + meatFeed + '\'' +
                '}';
    }
}
