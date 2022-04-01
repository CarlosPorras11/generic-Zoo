package org.iesfm.genericZoo;

import java.util.List;
import java.util.Objects;

public class Cage<E extends Animal>{
    private int numCage;
    private List<E> animals;

    public Cage(int numCage, List<E> animals) {
        this.numCage = numCage;
        this.animals = animals;
    }

    public int getNumCage() {
        return numCage;
    }

    public void setNumCage(int numCage) {
        this.numCage = numCage;
    }

    public List<E> getAnimals() {
        return animals;
    }

    public void setAnimals(List<E> animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cage<?> cage = (Cage<?>) o;
        return numCage == cage.numCage && Objects.equals(animals, cage.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCage, animals);
    }

    @Override
    public String toString() {
        return "Cage{" +
                "numCage=" + numCage +
                ", animals=" + animals +
                '}';
    }
}
