package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

import static com.company.Core.ListOfPice;

public class Bishop extends Pice {

    Bishop(Boolean color, Pices pice, Point position) {
        super(color, pice, position);
    }

    @Override
    public ArrayList<Point> listOfPossibleMoves() {

        super.listOfPossibleMoves.clear();

        int i = 1;

        while (super.position.x + i < 8 &&
                super.position.x + i >= 0 &&
                super.position.y + i < 8 &&
                super.position.y + i >= 0 &&
                Core.GetPice(new Point(super.position.x + i, super.position.y + i)) == null) {
            listOfPossibleMoves.add(new Point(super.position.x + i, super.position.y + i));
            i++;
        }
        i = 1;
        while (super.position.x + i < 8 &&
                super.position.x + i >= 0 &&
                super.position.y - i < 8 &&
                super.position.y - i >= 0 &&
                Core.GetPice(new Point(super.position.x + i, super.position.y - i)) == null) {
            listOfPossibleMoves.add(new Point(super.position.x + i, super.position.y - i));
            i++;
        }
        i = 1;
        while (super.position.x - i < 8 &&
                super.position.x - i >= 0 &&
                super.position.y + i < 8 &&
                super.position.y + i >= 0 &&
                Core.GetPice(new Point(super.position.x - i, super.position.y + i)) == null) {
            listOfPossibleMoves.add(new Point(super.position.x - i, super.position.y + i));
            i++;
        }
        i = 1;
        while (super.position.x - i < 8 &&
                super.position.x - i >= 0 &&
                super.position.y - i < 8 &&
                super.position.y - i >= 0 &&
                Core.GetPice(new Point(super.position.x - i, super.position.y - i)) == null) {
            listOfPossibleMoves.add(new Point(super.position.x - i, super.position.y - i));
            i++;
        }
        return super.listOfPossibleMoves;
    }

    @Override
    public ArrayList<Point> listOfPossibleBeat() {

        super.listOfPossibleBeat.clear();

        int i = 1;
        while (super.position.x + i < 8 &&
                super.position.x + i >= 0 &&
                super.position.y + i < 8 &&
                super.position.y + i >= 0) {
            if (Core.GetPice(new Point(super.position.x + i, super.position.y + i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x + i, super.position.y + i))).color != this.color) {
                listOfPossibleBeat.add(new Point(super.position.x + i, super.position.y + i));
                break;
            }
            else if (Core.GetPice(new Point(super.position.x + i, super.position.y + i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x + i, super.position.y + i))).color == this.color) {
                break;
            }
            i++;
        }
        i = 1;
        while (super.position.x - i < 8 &&
                super.position.x - i >= 0 &&
                super.position.y + i < 8 &&
                super.position.y + i >= 0) {
            if (Core.GetPice(new Point(super.position.x - i, super.position.y + i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x - i, super.position.y + i))).color != this.color) {
                listOfPossibleBeat.add(new Point(super.position.x - i, super.position.y + i));
                break;
            }
            else if (Core.GetPice(new Point(super.position.x - i, super.position.y + i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x - i, super.position.y + i))).color == this.color) {
                break;
            }
            i++;
        }
        i = 1;
        while (super.position.x + i < 8 &&
                super.position.x + i >= 0 &&
                super.position.y - i < 8 &&
                super.position.y - i >= 0) {
            if (Core.GetPice(new Point(super.position.x + i, super.position.y - i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x + i, super.position.y - i))).color != this.color) {
                listOfPossibleBeat.add(new Point(super.position.x + i, super.position.y - i));
                break;
            }
            else if (Core.GetPice(new Point(super.position.x + i, super.position.y - i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x + i, super.position.y - i))).color == this.color) {
                break;
            }
            i++;
        }
        i = 1;
        while (super.position.x - i < 8 &&
                super.position.x - i >= 0 &&
                super.position.y - i < 8 &&
                super.position.y - i >= 0) {
            if (Core.GetPice(new Point(super.position.x - i, super.position.y - i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x - i, super.position.y - i))).color != this.color) {
                listOfPossibleBeat.add(new Point(super.position.x - i, super.position.y - i));
                break;
            }
            else if(Core.GetPice(new Point(super.position.x - i, super.position.y - i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x - i, super.position.y - i))).color == this.color) {
                break;
            }
            i++;
        }
        return super.listOfPossibleBeat;
    }
}
