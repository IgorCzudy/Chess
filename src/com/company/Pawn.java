package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Pawn extends Pice{

    Pawn(Boolean color, Pices pice, Point position) {
        super(color, pice, position);
    }

    @Override
    public ArrayList<Point> listOfPossibleMoves() {
        super.listOfPossibleMoves.clear();
        Point point;
        if (!color) point = new Point(position.x-1,position.y);
        else point = new Point(position.x+1,position.y);
        if (!Core.ListOfAllCord().contains(point)) {
            super.listOfPossibleMoves.add(point);
        }
        return super.listOfPossibleMoves;
    }

    @Override
    public ArrayList<Point> listOfPossibleBeat() {
        super.listOfPossibleBeat.clear();
        Point pointL, pointR;


        if (!color) {
            pointL = new Point(position.x-1,position.y-1);
            pointR = new Point(position.x-1,position.y+1);
        }
        else {
            pointL = new Point(position.x+1,position.y-1);
            pointR = new Point(position.x+1,position.y+1);
        }

        if(pointL.x>0 && Core.ListOfAllCord().contains(pointL)){
            super.listOfPossibleBeat.add(pointL);
        }
        if(pointR.x<8 && Core.ListOfAllCord().contains(pointR)){
            super.listOfPossibleBeat.add(pointR);
        }
        return super.listOfPossibleBeat;
    }


    @Override
    void beat() {

    }
}
