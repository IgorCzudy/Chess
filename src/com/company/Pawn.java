package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Pawn extends Pice{

    Pawn(Boolean color, Pices pice, Point position) {
        super(color, pice, position);
    }

    @Override
    public ArrayList<Point> listOfPossibleMoves() {
        super.listOfPossibleMoves.clear();
        Point point;
        if (!super.wasMoved) {
            Point point2;
            if (!color) point2 = new Point(position.x-2, position.y);
            else point2 = new Point(position.x+2, position.y );

            if (!Core.ListOfAllCord().contains(point2)) super.listOfPossibleMoves.add(point2);

        }

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

        if (!this.color){
            if (this.position.y>0 &&
                    Core.GetPice(new Point(super.position.x - 1, super.position.y - 1)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(this.position.x - 1, this.position.y - 1))).color!=this.color){
                listOfPossibleBeat.add(new Point(this.position.x-1, this.position.y - 1));
            }
             if (this.position.y<7 &&
                    Core.GetPice(new Point(super.position.x - 1, super.position.y + 1)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(this.position.x - 1, this.position.y + 1))).color!=this.color){
                listOfPossibleBeat.add(new Point(this.position.x - 1, this.position.y + 1));
            }
        }
        else{
            if (this.position.y>0 &&
                    Core.GetPice(new Point(super.position.x + 1, super.position.y - 1)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(this.position.x + 1, this.position.y - 1))).color!=this.color){
                listOfPossibleBeat.add(new Point(this.position.x+1, this.position.y - 1));

            }
             if (this.position.x<7 &&
                    Core.GetPice(new Point(super.position.x + 1, super.position.y + 1)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(this.position.x + 1, this.position.y + 1))).color!=this.color){
                listOfPossibleBeat.add(new Point(this.position.x+1, this.position.y + 1));

            }
        }

        return super.listOfPossibleBeat;
    }

    void check() {
        if (!color && position.y == 0) {
            Pice pice = Core.GetPice(position);
            Core.GetListOfPice().remove(Core.GetPice(position));
            Core.GetListOfPice().add(new Queen(pice.color, pice.pice, pice.position));
        }
        if (color && position.y == 8) {
            Pice pice = Core.GetPice(position);
            Core.GetListOfPice().remove(Core.GetPice(position));
            Core.GetListOfPice().add(new Queen(pice.color, pice.pice, pice.position));
        }
    }

}
