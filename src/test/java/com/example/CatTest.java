package com.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class CatTest {

    private final Feline feline = new Feline();
    private final Cat cat = new Cat(feline);

    @Test
    public void getSoundShouldReturnMeow() {
        String sound = cat.getSound();

        Assertions.assertThat(sound).isEqualTo("Мяу");
    }

    @Test
    public void getFoodShouldReturnFelineEatMeat() throws Exception {
        List<String> food = cat.getFood();

        Assertions.assertThat(food).isEqualTo(feline.eatMeat());
    }

    @Test
    public void predatorInstanceIsTheSameWhichPassedToConstructor() {
        Assertions.assertThat(cat.predator).isEqualTo(feline);
    }

}