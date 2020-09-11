package com.example.cihangir.dag04Java;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaTest {
    @Test // Annotatie
    void JavaTest(){

        System.out.println("Hallo Java!");
    }


    @Test // Annotatie
    void JavaTest1(){
        double doubleVar1 = 1.033;
        double doubleVar2 = 0.033;
        double difference = doubleVar1 - doubleVar2;
        boolean isGelijk = difference == 1.0;
        Offset<Double> offset = Offset.offset(1.0E-2);
        assertThat(difference).isEqualTo(1.0,offset);

    }

    @Test // Annotatie
    void JavaTest2(){
        double doubleVar1 = 1.033;
        double doubleVar2 = 0.033;
        double difference = doubleVar1 - doubleVar2;
        boolean isGelijk = difference == 1.0;
        assertThat(difference).isEqualTo(1.0);

    }

    @Test // Annotatie
    void JavaTest3(){
        byte b1 = 1;
        char char1 = 'a';
        char char2 = 'b';
        System.out.println("String test " + char1 + char2);

    }




}


