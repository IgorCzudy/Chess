package com.company;

import java.awt.*;
import java.util.ArrayList;

import static com.company.Core.ListOfPice;

public class Bishop extends Pice{

    Bishop(Boolean color, Pices pice, Point position) {
        super(color, pice, position);
    }

    @Override
    public ArrayList<Point> listOfPossibleMoves() {
        int i =1;
        while (super.position.x + i < 8 && super.position.x + i < 0 &&super.position.y + i < 8 && super.position.y + i < 0){
            if (Core.ListOfAllCord().contains(new Point(super.position.x + i,super.position.y + i))){
                break;
            }
            super.listOfPossibleMoves.add(new Point(super.position.x + i,super.position.y + i));
            i++;
        }
        i =1;
        while (super.position.x - i < 8 && super.position.x - i < 0 &&super.position.y - i < 8 && super.position.y - i < 0){
            if (Core.ListOfAllCord().contains(new Point(super.position.x - i,super.position.y - i))){
                break;
            }
            super.listOfPossibleMoves.add(new Point(super.position.x - i,super.position.y - i));
            i++;
        }
        i =1;
        while (super.position.x + i < 8 && super.position.x + i < 0 &&super.position.y - i < 8 && super.position.y - i < 0){
            if (Core.ListOfAllCord().contains(new Point(super.position.x - i,super.position.y - i))){
                break;
            }
            super.listOfPossibleMoves.add(new Point(super.position.x + i,super.position.y - i));
            i++;
        }
        i =1;
        while (super.position.x - i < 8 && super.position.x - i < 0 &&super.position.y + i < 8 && super.position.y + i < 0){
            if (Core.ListOfAllCord().contains(new Point(super.position.x - i,super.position.y - i))){
                break;
            }
            super.listOfPossibleMoves.add(new Point(super.position.x - i,super.position.y + i));
            i++;
        }
        return super.listOfPossibleMoves;
    }

    @Override
    public ArrayList<Point> listOfPossibleBeat() {
        int i =1;
        while (super.position.x + i < 8 && super.position.x + i < 0 &&super.position.y + i < 8 && super.position.y + i < 0){
            if (Core.ListOfAllCord().contains(new Point(super.position.x + i,super.position.y + i))){
                break;
            }
            super.listOfPossibleMoves.add(new Point(super.position.x + i,super.position.y + i));
            i++;
        }
        i =1;
        while (super.position.x - i < 8 && super.position.x - i < 0 &&super.position.y - i < 8 && super.position.y - i < 0){
            if (Core.ListOfAllCord().contains(new Point(super.position.x - i,super.position.y - i))){
                break;
            }
            super.listOfPossibleMoves.add(new Point(super.position.x - i,super.position.y - i));
            i++;
        }
        i =1;
        while (super.position.x + i < 8 && super.position.x + i < 0 &&super.position.y - i < 8 && super.position.y - i < 0){
            if (Core.ListOfAllCord().contains(new Point(super.position.x - i,super.position.y - i))){
                break;
            }
            super.listOfPossibleMoves.add(new Point(super.position.x + i,super.position.y - i));
            i++;
        }
        i =1;
        while (super.position.x - i < 8 && super.position.x - i < 0 &&super.position.y + i < 8 && super.position.y + i < 0){
            if (Core.ListOfAllCord().contains(new Point(super.position.x - i,super.position.y - i))){
                break;
            }
            super.listOfPossibleMoves.add(new Point(super.position.x - i,super.position.y + i));
            i++;
        }
        return super.listOfPossibleBeat;
    }

    @Override
    void beat() {

    }
}
