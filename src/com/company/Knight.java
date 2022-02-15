package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Knight extends Pice{
    Knight(Boolean color, Pices pice, Point position) {
        super(color, pice, position);
    }

    @Override
    public ArrayList<Point> listOfPossibleMoves() {
        listOfPossibleMoves.clear();

        if (super.position.x-2>=0 &&
                super.position.x-2<8 &&
                super.position.y+1>=0 &&
                super.position.y+1<8 &&
        Core.GetPice(new Point(super.position.x-2 , super.position.y+1))==null){
            listOfPossibleMoves.add(new Point(super.position.x-2 , super.position.y+1));
        }
        if (super.position.x-1>=0 &&
                super.position.x-1<8 &&
                super.position.y+2>=0 &&
                super.position.y+2<8 &&
                Core.GetPice(new Point(super.position.x-1 , super.position.y+2))==null){
            listOfPossibleMoves.add(new Point(super.position.x-1 , super.position.y+2));
        }
        if (super.position.x+1>=0 &&
                super.position.x+1<8 &&
                super.position.y+2>=0 &&
                super.position.y+2<8 &&
                Core.GetPice(new Point(super.position.x+1 , super.position.y+2))==null){
            listOfPossibleMoves.add(new Point(super.position.x+1 , super.position.y+2));
        }
        if (super.position.x+2>=0 &&
                super.position.x+2<8 &&
                super.position.y+1>=0 &&
                super.position.y+1<8 &&
                Core.GetPice(new Point(super.position.x+2 , super.position.y+1))==null){
            listOfPossibleMoves.add(new Point(super.position.x+2 , super.position.y+1));
        }
        if (super.position.x+2>=0 &&
                super.position.x+2<8 &&
                super.position.y-1>=0 &&
                super.position.y-1<8 &&
                Core.GetPice(new Point(super.position.x+2 , super.position.y-1))==null){
            listOfPossibleMoves.add(new Point(super.position.x+2 , super.position.y-1));
        }
        if (super.position.x+1>=0 &&
                super.position.x+1<8 &&
                super.position.y-2>=0 &&
                super.position.y-2<8 &&
                Core.GetPice(new Point(super.position.x+1 , super.position.y-2))==null){
            listOfPossibleMoves.add(new Point(super.position.x+1 , super.position.y-2));
        }
        if (super.position.x-2>=0 &&
                super.position.x-2<8 &&
                super.position.y-1>=0 &&
                super.position.y-1<8 &&
                Core.GetPice(new Point(super.position.x-2 , super.position.y-1))==null){
            listOfPossibleMoves.add(new Point(super.position.x-2 , super.position.y-1));
        }
        if (super.position.x-1>=0 &&
                super.position.x-1<8 &&
                super.position.y-2>=0 &&
                super.position.y-2<8 &&
                Core.GetPice(new Point(super.position.x-1 , super.position.y-2))==null){
            listOfPossibleMoves.add(new Point(super.position.x-1 , super.position.y-2));
        }

        return listOfPossibleMoves;
    }

    @Override
    public ArrayList<Point> listOfPossibleBeat() {
        listOfPossibleBeat.clear();

        if (super.position.x-2>=0 &&
                super.position.x-2<8 &&
                super.position.y+1>=0 &&
                super.position.y+1<8 &&
                Core.GetPice(new Point(super.position.x-2 , super.position.y+1))!=null&&
                Objects.requireNonNull(Core.GetPice(new Point(super.position.x - 2, super.position.y + 1))).color!=this.color){
            listOfPossibleBeat.add(new Point(super.position.x-2 , super.position.y+1));
        }
        if (super.position.x-1>=0 &&
                super.position.x-1<8 &&
                super.position.y+2>=0 &&
                super.position.y+2<8 &&
                Core.GetPice(new Point(super.position.x-1 , super.position.y+2))!=null &&
                Objects.requireNonNull(Core.GetPice(new Point(super.position.x - 1, super.position.y + 2))).color!=this.color){
            listOfPossibleBeat.add(new Point(super.position.x-1 , super.position.y+2));
        }
        if (super.position.x+1>=0 &&
                super.position.x+1<8 &&
                super.position.y+2>=0 &&
                super.position.y+2<8 &&
                Core.GetPice(new Point(super.position.x+1 , super.position.y+2))!=null&&
                Objects.requireNonNull(Core.GetPice(new Point(super.position.x + 1, super.position.y + 2))).color!=this.color){
            listOfPossibleBeat.add(new Point(super.position.x+1 , super.position.y+2));
        }
        if (super.position.x+2>=0 &&
                super.position.x+2<8 &&
                super.position.y+1>=0 &&
                super.position.y+1<8 &&
                Core.GetPice(new Point(super.position.x+2 , super.position.y+1))!=null&&
                Objects.requireNonNull(Core.GetPice(new Point(super.position.x + 2, super.position.y + 1))).color!=this.color){
            listOfPossibleBeat.add(new Point(super.position.x+2 , super.position.y+1));
        }
        if (super.position.x+2>=0 &&
                super.position.x+2<8 &&
                super.position.y-1>=0 &&
                super.position.y-1<8 &&
                Core.GetPice(new Point(super.position.x+2 , super.position.y-1))!=null&&
                Objects.requireNonNull(Core.GetPice(new Point(super.position.x + 2, super.position.y - 1))).color!=this.color){
            listOfPossibleBeat.add(new Point(super.position.x+2 , super.position.y-1));
        }
        if (super.position.x+1>=0 &&
                super.position.x+1<8 &&
                super.position.y-2>=0 &&
                super.position.y-2<8 &&
                Core.GetPice(new Point(super.position.x+1 , super.position.y-2))!=null&&
                Objects.requireNonNull(Core.GetPice(new Point(super.position.x + 1, super.position.y - 2))).color!=this.color){
            listOfPossibleBeat.add(new Point(super.position.x+1 , super.position.y-2));
        }
        if (super.position.x-2>=0 &&
                super.position.x-2<8 &&
                super.position.y-1>=0 &&
                super.position.y-1<8 &&
                Core.GetPice(new Point(super.position.x-2 , super.position.y-1))!=null&&
                Objects.requireNonNull(Core.GetPice(new Point(super.position.x - 2, super.position.y - 1))).color!=this.color){
            listOfPossibleBeat.add(new Point(super.position.x-2 , super.position.y-1));
        }
        if (super.position.x-1>=0 &&
                super.position.x-1<8 &&
                super.position.y-2>=0 &&
                super.position.y-2<8 &&
                Core.GetPice(new Point(super.position.x-1 , super.position.y-2))!=null&&
                Objects.requireNonNull(Core.GetPice(new Point(super.position.x - 1, super.position.y - 2))).color!=this.color){
            listOfPossibleBeat.add(new Point(super.position.x-1 , super.position.y-2));
        }
        return listOfPossibleBeat;
    }


}
