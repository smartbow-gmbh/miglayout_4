package net.miginfocom.examples;

import net.miginfocom.layout.AC;

public class TestMigLayout
{
    public static void main(String[] args) {
        AC acWorkingSolution1 = new AC().size(" ").gap().size(" ");
        AC acWorkingSolution2 = new AC().size(":").gap().size(":");
        AC acNPE = new AC().size("").gap().size("");
    }
}