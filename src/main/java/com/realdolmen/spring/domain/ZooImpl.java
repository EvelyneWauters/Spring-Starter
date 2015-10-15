package com.realdolmen.spring.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ewtax45 on 15/10/2015.
 */
public class ZooImpl implements Zoo {
    private String name;
    private List<Animal> animalList = new ArrayList<>();



    public ZooImpl(String name) {
        this.name = name;
    }



    @Override
    public void addAnimal(Animal a) {
        animalList.add(a);
    }

    @Override
    public void releaseAnimal(Animal a) {
        animalList.remove(a);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int countAnimals() {
        System.out.println(animalList.size());
        return animalList.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : animalList) {
            sb.append(String.format("%s ", animal.getName()));
        }
        return String.format("name: %s, size: %d; animals: %s", name, animalList.size(), sb.toString());
    }
}
