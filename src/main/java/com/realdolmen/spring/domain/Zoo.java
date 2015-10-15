package com.realdolmen.spring.domain;

/**
 * Created by ewtax45 on 15/10/2015.
 */
public interface Zoo {
    public void addAnimal(Animal a);
    public void releaseAnimal(Animal a);
    public String getName();
    public int countAnimals();
}
