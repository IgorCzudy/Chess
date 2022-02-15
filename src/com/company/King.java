package com.company;

import java.awt.*;
import java.util.ArrayList;

public class King extends Pice{
    King(Boolean color, Pices pice, Point position) {
        super(color, pice, position);
    }

    @Override
    public ArrayList<Point> listOfPossibleMoves() {

        listOfPossibleMoves.clear();
        if ( Core.GetPice(new Point(this.position.x+1,this.position.y+1))==null) listOfPossibleMoves.add(new Point(this.position.x+1,this.position.y+1));
        if ( Core.GetPice(new Point(this.position.x-1,this.position.y-1))==null) listOfPossibleMoves.add(new Point(this.position.x-1,this.position.y-1));
        if ( Core.GetPice(new Point(this.position.x-1,this.position.y+1))==null) listOfPossibleMoves.add(new Point(this.position.x-1,this.position.y+1));
        if ( Core.GetPice(new Point(this.position.x+1,this.position.y-1))==null) listOfPossibleMoves.add(new Point(this.position.x+1,this.position.y-1));
        if ( Core.GetPice(new Point(this.position.x+1,this.position.y))==null) listOfPossibleMoves.add(new Point(this.position.x+1,this.position.y));
        if ( Core.GetPice(new Point(this.position.x,this.position.y+1))==null) listOfPossibleMoves.add(new Point(this.position.x,this.position.y+1));
        if ( Core.GetPice(new Point(this.position.x-1,this.position.y))==null) listOfPossibleMoves.add(new Point(this.position.x-1,this.position.y));
        if ( Core.GetPice(new Point(this.position.x,this.position.y-1))==null) listOfPossibleMoves.add(new Point(this.position.x,this.position.y-1));

        if (this.position.x<=0){
            listOfPossibleMoves.remove(new Point(this.position.x-1,this.position.y+1));
            listOfPossibleMoves.remove(new Point(this.position.x-1,this.position.y));
            listOfPossibleMoves.remove(new Point(this.position.x-1,this.position.y-1));
        }
        if (this.position.y<=0){
            listOfPossibleMoves.remove(new Point(this.position.x+1,this.position.y-1));
            listOfPossibleMoves.remove(new Point(this.position.x,this.position.y-1));
            listOfPossibleMoves.remove(new Point(this.position.x-1,this.position.y-1));
        }
        if (this.position.x>=7){
            listOfPossibleMoves.remove(new Point(this.position.x+1,this.position.y+1));
            listOfPossibleMoves.remove(new Point(this.position.x+1,this.position.y));
            listOfPossibleMoves.remove(new Point(this.position.x+1,this.position.y-1));
        }
        if (this.position.y>=7){
            listOfPossibleMoves.remove(new Point(this.position.x+1,this.position.y+1));
            listOfPossibleMoves.remove(new Point(this.position.x,this.position.y+1));
            listOfPossibleMoves.remove(new Point(this.position.x-1,this.position.y+1));
        }

        return listOfPossibleMoves;
    }

    @Override
    public ArrayList<Point> listOfPossibleBeat() {
        listOfPossibleBeat.clear();
        ArrayList<Point> listOfEnemy;
        if (!color && Core.GetBlackPice(new Point(this.position.x+1,this.position.y+1))!=null) listOfPossibleBeat.add(new Point(this.position.x+1,this.position.y+1));
        if (!color && Core.GetBlackPice(new Point(this.position.x-1,this.position.y-1))!=null) listOfPossibleBeat.add(new Point(this.position.x-1,this.position.y-1));
        if (!color && Core.GetBlackPice(new Point(this.position.x-1,this.position.y+1))!=null) listOfPossibleBeat.add(new Point(this.position.x-1,this.position.y+1));
        if (!color && Core.GetBlackPice(new Point(this.position.x+1,this.position.y-1))!=null) listOfPossibleBeat.add(new Point(this.position.x+1,this.position.y-1));
        if (!color && Core.GetBlackPice(new Point(this.position.x+1,this.position.y))!=null) listOfPossibleBeat.add(new Point(this.position.x+1,this.position.y));
        if (!color && Core.GetBlackPice(new Point(this.position.x,this.position.y+1))!=null) listOfPossibleBeat.add(new Point(this.position.x,this.position.y+1));
        if (!color && Core.GetBlackPice(new Point(this.position.x-1,this.position.y))!=null) listOfPossibleBeat.add(new Point(this.position.x-1,this.position.y));
        if (!color && Core.GetBlackPice(new Point(this.position.x,this.position.y-1))!=null) listOfPossibleBeat.add(new Point(this.position.x,this.position.y-1));

        if (color && Core.GetWhitePice(new Point(this.position.x+1,this.position.y+1))!=null) listOfPossibleBeat.add(new Point(this.position.x+1,this.position.y+1));
        if (color && Core.GetWhitePice(new Point(this.position.x-1,this.position.y-1))!=null) listOfPossibleBeat.add(new Point(this.position.x-1,this.position.y-1));
        if (color && Core.GetWhitePice(new Point(this.position.x-1,this.position.y+1))!=null) listOfPossibleBeat.add(new Point(this.position.x-1,this.position.y+1));
        if (color && Core.GetWhitePice(new Point(this.position.x+1,this.position.y-1))!=null) listOfPossibleBeat.add(new Point(this.position.x+1,this.position.y-1));
        if (color && Core.GetWhitePice(new Point(this.position.x+1,this.position.y))!=null) listOfPossibleBeat.add(new Point(this.position.x+1,this.position.y));
        if (color && Core.GetWhitePice(new Point(this.position.x,this.position.y+1))!=null) listOfPossibleBeat.add(new Point(this.position.x,this.position.y+1));
        if (color && Core.GetWhitePice(new Point(this.position.x-1,this.position.y))!=null) listOfPossibleBeat.add(new Point(this.position.x-1,this.position.y));
        if (color && Core.GetWhitePice(new Point(this.position.x,this.position.y-1))!=null) listOfPossibleBeat.add(new Point(this.position.x,this.position.y-1));

        return listOfPossibleBeat;
    }


}
