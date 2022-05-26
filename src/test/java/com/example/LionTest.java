package com.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Test
    public void hasManeShouldReturnTrueIfLionCreatedWithMaleGender() throws Exception {
        Lion lion = new Lion("Самец");
        boolean hasMane = lion.doesHaveMane();
        Assertions.assertThat(hasMane).isTrue();
    }

    @Test
    public void hasManeShouldReturnTrueIfLionCreatedWithFemaleGender() throws Exception {
        Lion lion = new Lion("Самка");
        boolean hasMane = lion.doesHaveMane();
        Assertions.assertThat(hasMane).isFalse();
    }

    @Test(expected = Exception.class)
    public void throwExceptionWhenLionCreatedWithUnknownGender() throws Exception {
        Lion lion = new Lion("UnknownGender");
    }

    @Test
    public void lionGetKittensShouldReturnTheSameAsFelineGetKittens() throws Exception {
        Lion lion = new Lion("Самец");
        Feline feline = mock(Feline.class);
        lion.feline = feline;

        when(feline.getKittens()).thenReturn(5);

        int kittens = lion.getKittens();

        Assertions.assertThat(kittens).isEqualTo(5);
    }

    @Test
    public void getFoodShouldReturnFelineGetFood() throws Exception {
        Lion lion = new Lion("Самец");
        Feline feline = mock(Feline.class);
        lion.feline = feline;

        lion.getFood();

        Mockito.verify(feline).getFood("Хищник");
    }
}

