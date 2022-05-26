package com.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalFoodTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        });
    }

    private final String animalKind;
    private final List<String> expectedFood;

    public AnimalFoodTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Test
    public void getFoodShouldReturnListOfFoodByAnimalKind() throws Exception {
        Animal animal = new Animal();

        List<String> food = animal.getFood(animalKind);

        Assertions.assertThat(food).isEqualTo(expectedFood);
    }
}
