package org.iesfm.genericZoo;

import java.util.List;
import java.util.Objects;

public class Zoo<E extends Animal> {
    private String name;
    private Cage<Herbivore> herbivoreCage;
    private Cage<Carnivore> carnivoreCage;
    private Cage<Animal> mixedCage;

    public Zoo(String name, Cage<Herbivore> herbivoreCage, Cage<Carnivore> carnivoreCage, Cage<Animal> mixedCage) {
        this.name = name;
        this.herbivoreCage = herbivoreCage;
        this.carnivoreCage = carnivoreCage;
        this.mixedCage = mixedCage;
    }

    public void addHerbivoreInHerbivoreCage(Herbivore animal){
        herbivoreCage.getAnimals().add(animal);
    }

    public void addCarnivoreInCarnivoreCage(Carnivore animal){
        carnivoreCage.getAnimals().add(animal);
    }

    public void addAnimalInMixedCage(Animal animal){
        mixedCage.getAnimals().add(animal);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cage<Herbivore> getHerbivoreCage() {
        return herbivoreCage;
    }

    public void setHerbivoreCage(Cage<Herbivore> herbivoreCage) {
        this.herbivoreCage = herbivoreCage;
    }

    public Cage<Carnivore> getCarnivoreCage() {
        return carnivoreCage;
    }

    public void setCarnivoreCage(Cage<Carnivore> carnivoreCage) {
        this.carnivoreCage = carnivoreCage;
    }

    public Cage<Animal> getMixedCage() {
        return mixedCage;
    }

    public void setMixedCage(Cage<Animal> mixedCage) {
        this.mixedCage = mixedCage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(name, zoo.name) && Objects.equals(herbivoreCage, zoo.herbivoreCage) && Objects.equals(carnivoreCage, zoo.carnivoreCage) && Objects.equals(mixedCage, zoo.mixedCage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, herbivoreCage, carnivoreCage, mixedCage);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", herbivoreCage=" + herbivoreCage +
                ", carnivoreCage=" + carnivoreCage +
                ", mixedCage=" + mixedCage +
                '}';
    }
}
