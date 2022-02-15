package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Queen extends Pice{
    Queen(Boolean color, Pices pice, Point position) {
        super(color, pice, position);
    }

    @Override
    public ArrayList<Point> listOfPossibleMoves() {
        super.listOfPossibleMoves.clear();
        int i =1 ;
        while (super.position.x+i >=0 && super.position.x+i <8 && !Core.ListOfAllCord().contains(new Point(super.position.x+i , super.position.y))){
            super.listOfPossibleMoves.add(new Point(super.position.x+i , super.position.y));
            i++;
        }
        i =1 ;
        while (super.position.x-i >=0 && super.position.x-i <8 && !Core.ListOfAllCord().contains(new Point(super.position.x-i , super.position.y))){
            super.listOfPossibleMoves.add(new Point(super.position.x-i , super.position.y));
            i++;
        }
        i =1 ;
        while (super.position.y-i >=0 && super.position.y-i <8 && !Core.ListOfAllCord().contains(new Point(super.position.x , super.position.y-i))){
            super.listOfPossibleMoves.add(new Point(super.position.x , super.position.y-i));
            i++;
        }
        i =1 ;
        while (super.position.y+i >=0 && super.position.y+i <8 && !Core.ListOfAllCord().contains(new Point(super.position.x , super.position.y+i))){
            super.listOfPossibleMoves.add(new Point(super.position.x , super.position.y+i));
            i++;
        }
        i = 1;
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

        return listOfPossibleMoves;
    }

    @Override
    public ArrayList<Point> listOfPossibleBeat() {
        super.listOfPossibleBeat.clear();
        int i = 1;
        while (super.position.x + i < 8 &&
                super.position.x + i >= 0 &&
                super.position.y  < 8 &&
                super.position.y >= 0) {
            if (Core.GetPice(new Point(super.position.x + i, super.position.y )) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x + i, super.position.y))).color != this.color) {
                listOfPossibleBeat.add(new Point(super.position.x + i, super.position.y ));
                break;
            }
            else if (Core.GetPice(new Point(super.position.x + i, super.position.y )) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x + i, super.position.y))).color == this.color) {
                break;
            }
            i++;
        }
        i = 1;
        while (super.position.x  < 8 &&
                super.position.x  >= 0 &&
                super.position.y + i < 8 &&
                super.position.y + i >= 0) {
            if (Core.GetPice(new Point(super.position.x , super.position.y + i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x , super.position.y + i))).color != this.color) {
                listOfPossibleBeat.add(new Point(super.position.x , super.position.y + i));
                break;
            }
            else if (Core.GetPice(new Point(super.position.x , super.position.y + i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x , super.position.y + i))).color == this.color) {
                break;
            }
            i++;
        }
        i = 1;
        while (super.position.x - i < 8 &&
                super.position.x - i >= 0 &&
                super.position.y  < 8 &&
                super.position.y  >= 0) {
            if (Core.GetPice(new Point(super.position.x - i, super.position.y )) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x - i, super.position.y ))).color != this.color) {
                listOfPossibleBeat.add(new Point(super.position.x - i, super.position.y ));
                break;
            }
            else if (Core.GetPice(new Point(super.position.x - i, super.position.y )) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x - i, super.position.y ))).color == this.color) {
                break;
            }
            i++;
        }
        i = 1;
        while (super.position.x  < 8 &&
                super.position.x >= 0 &&
                super.position.y - i < 8 &&
                super.position.y - i >= 0) {
            if (Core.GetPice(new Point(super.position.x , super.position.y - i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x , super.position.y - i))).color != this.color) {
                listOfPossibleBeat.add(new Point(super.position.x , super.position.y - i));
                break;
            }
            else if (Core.GetPice(new Point(super.position.x , super.position.y - i)) != null &&
                    Objects.requireNonNull(Core.GetPice(new Point(super.position.x , super.position.y - i))).color == this.color) {
                break;
            }
            i++;
        }
        i = 1;
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
