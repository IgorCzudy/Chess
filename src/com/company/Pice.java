package com.company;

import java.awt.*;
import java.util.ArrayList;

public abstract class Pice {

    Boolean color; //black-1 white-0
    Pices pice;
    Point position;

    ArrayList<Point>  listOfPossibleMoves;
    ArrayList<Point>  listOfPossibleBeat;


    Pice(Boolean color, Pices pice, Point position){
        this.color=color;
        this.pice=pice;
        this.position=position;
        listOfPossibleBeat= new ArrayList<Point>();
        listOfPossibleMoves= new ArrayList<Point>();
    }

    void setPosition(Point position){
        this.position=position;
    }

    public Point getPosition(){
        return position;
    }
    public Pices getPice(){
        return pice;
    }
    public Boolean getColor(){
        return color;
    }

    public abstract ArrayList<Point> listOfPossibleMoves();
    public abstract ArrayList<Point> listOfPossibleBeat();
        /**
        public ArrayList<Point> listOfPossibleMoves(){
            listOfPossibleMoves = new ArrayList<Point> ();
            listOfPossibleMoves.add(new Point(4,4));
            listOfPossibleMoves.add(new Point(5,5));
            return listOfPossibleMoves;
        }
        public ArrayList<Point> listOfPossibleBeat(){
            listOfPossibleBeat = new ArrayList<Point> ();
            listOfPossibleBeat.add(new Point(1,1));
            listOfPossibleBeat.add(new Point(2,2));
            return listOfPossibleBeat;
        }
    */
    public void move(Point point){
        this.position = point;
    }
    abstract void beat();

}
