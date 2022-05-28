package com.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatShouldReturnListOfPredatorFood() throws Exception {
        List<String> food = feline.eatMeat();
        Assertions.assertThat(food).containsExactly("Животные", "Птицы", "Рыба");
    }

    @Test
    public void getFamilyShouldReturnFeline() {
        String family = feline.getFamily();
        Assertions.assertThat(family).isEqualTo("Кошачьи");
    }

    @Test
    public void getKittensShouldReturnOne() {
        int kittens = feline.getKittens();
        Assertions.assertThat(kittens).isEqualTo(1);
    }

    @Test
    public void getKittensShouldReturnProvidedValue() {
        int kittens = feline.getKittens(5);
        Assertions.assertThat(kittens).isEqualTo(5);
    }
}





