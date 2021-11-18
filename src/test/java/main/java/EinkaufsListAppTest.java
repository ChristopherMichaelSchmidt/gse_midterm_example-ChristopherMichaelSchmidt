package main.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufsListAppTest {

    public ArrayList<Einkauf> test1;
    public HashSet<Einkauf> test2;
    @BeforeEach
    void setUp(){
        test1= new ArrayList<>();
        Einkauf testeinkauf = new Einkauf("Äpfel", 4.0);
        Einkauf testeinkauf2 = new Einkauf("Birnen", 5.0);
        test1.add(testeinkauf);
        test1.add(testeinkauf2);

        test2 = new HashSet<>();
        test2.add(testeinkauf);
        test2.add(testeinkauf2);



    }

    @Test
     void sum() {

          assertEquals(EinkaufsListApp.sum(test1),9);
    }

    @Test
    void testSum() {
        assertEquals(EinkaufsListApp.sum(test2), 9);
    }


}