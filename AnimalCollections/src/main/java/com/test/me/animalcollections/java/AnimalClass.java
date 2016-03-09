package com.test.me.animalcollections.java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package com.roman.tp2testdrivenassign2.java;

/**
 *
 * @author Roman
 */
public class AnimalClass {

    private String species;
    private String gender;
    private String name;
    
    
    public AnimalClass() {
    }

    public AnimalClass(String species, String gender) {
        this.species = species;
        this.gender = gender;
    }
    public String getPetName()
    {
        return name;
    }
    public void setPetName(String name)
    {
        this.name = name;
    }
    public String getSpecies()
    {
        return species;
    }
   

    
    
}
