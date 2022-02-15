package com.company;

import com.GUI.Map;

import javax.swing.text.Position;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Core {

    public static ArrayList<Pice> ListOfPice;

    public Core(){
        makeListOfPice();
    }

    static public ArrayList<Point> ListOfAllCord(){
        ArrayList<Point> points = new ArrayList<Point>();
        for (Pice pice : ListOfPice){
            points.add(pice.position);
        }
        return points;
    }

    public static boolean IsAnyPicesHere(Point position){
        for (int i = 0 ; i<ListOfPice.size();i++){
            if (ListOfPice.get(i).getPosition().equals(position)){
                return true;
            }
        }
    return false;
    }

    public static Pice GetPice(Point position){
        for (Pice pice : ListOfPice) {
            if (pice.getPosition().equals(position)) {
                return pice;
            }
        }
        return null;
    }

    static public ArrayList<Pice> GetListOfPice(){
        return ListOfPice;
    }

    void makeListOfPice(){
        ListOfPice = new ArrayList<>();
        for (int i =0;i<8;i++){
            ListOfPice.add(new Pawn(true,Pices.PAWN, new Point(1,i)));
            ListOfPice.add(new Pawn(false,Pices.PAWN, new Point(6,i)));
        }
        ListOfPice.add(new Rook(true,Pices.ROOK, new Point(0,0)));
        ListOfPice.add(new Rook(true,Pices.ROOK, new Point(0,7)));
        ListOfPice.add(new Rook(false,Pices.ROOK, new Point(7,7)));
        ListOfPice.add(new Rook(false,Pices.ROOK, new Point(7,0)));

        ListOfPice.add(new Bishop(true,Pices.BISHOP, new Point(0,2)));
        ListOfPice.add(new Bishop(true,Pices.BISHOP, new Point(0,5)));
        ListOfPice.add(new Bishop(false,Pices.BISHOP, new Point(7,2)));
        ListOfPice.add(new Bishop(false,Pices.BISHOP, new Point(7,5)));

        ListOfPice.add(new Knight(true,Pices.KNIGHT, new Point(0,1)));
        ListOfPice.add(new Knight(true,Pices.KNIGHT, new Point(0,6)));
        ListOfPice.add(new Knight(false,Pices.KNIGHT, new Point(7,1)));
        ListOfPice.add(new Knight(false,Pices.KNIGHT, new Point(7,6)));

        ListOfPice.add(new Queen(true,Pices.QUEEN, new Point(0,3)));
        ListOfPice.add(new Queen(false,Pices.QUEEN, new Point(7,3)));

        ListOfPice.add(new King(true,Pices.KING, new Point(0,4)));
        ListOfPice.add(new King(false,Pices.KING, new Point(7,4)));

    }
}
