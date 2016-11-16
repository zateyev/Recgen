package ru.tpu.recgen;

import ru.tpu.recgen.entity.RecGen;

public class Runner {
    public static void main(String[] args) {
        int recNum = 7;
        RecGen recGen = new RecGen(recNum);
        recGen.generate();
    }
}
