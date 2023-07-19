package caseStudies.vendingMachine.states;

import caseStudies.vendingMachine.State;

import java.util.*;

public class SelectProduct implements State {
    @Override
    public void selectProduct(int code) {
        int row = code/10;
        int slot = code%10;

    }
}
