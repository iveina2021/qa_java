package com.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test(expected = Exception.class)
    public void getFoodShouldThrowExceptionForUnknownAnimalKind() throws Exception {
        animal.getFood("UnknownAnimalKind");
    }

    @Test
    public void getFamilyShouldReturnAnimalFamilyInfo() {
        String family = animal.getFamily();
        Assertions.assertThat(family).isEqualTo("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }

}
