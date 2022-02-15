package com.company;

import java.awt.*;
import java.util.ArrayList;

public class King extends Pice{
    King(Boolean color, Pices pice, Point position) {
        super(color, pice, position);
    }

    @Override
    public ArrayList<Point> listOfPossibleMoves() {
        return null;
    }

    @Override
    public ArrayList<Point> listOfPossibleBeat() {
        return null;
    }


    @Override
    void beat() {

    }
}
