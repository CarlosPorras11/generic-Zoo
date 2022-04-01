package org.iesfm.genericZoo;

import java.util.Objects;
import java.util.Set;

public class Herbivore extends Animal{
    private Set<String> plantsFeed;

    public Herbivore(String specie, int age, String name, Set<String> plantsFeed) {
        super(specie, age, name);
        this.plantsFeed = plantsFeed;
    }

    @Override
    public void showFeed() {
        System.out.println("Soy herbivoro");
    }

    @Override
    public void showSpecificInfo() {
        System.out.println("Tipo de plantas de las que se alimenta: " + plantsFeed);
    }

    public Set<String> getPlantsFeed() {
        return plantsFeed;
    }

    public void setPlantsFeed(Set<String> plantsFeed) {
        this.plantsFeed = plantsFeed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(plantsFeed, herbivore.plantsFeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plantsFeed);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantsFeed=" + plantsFeed +
                '}';
    }
}
