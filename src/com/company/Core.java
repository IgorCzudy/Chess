package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

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
    static public ArrayList<Point> ListOfAllBlackCord(){
        ArrayList<Point> points = new ArrayList<Point>();
        for (Pice pice : ListOfPice){
            if (pice.color){
                for (Point point : pice.listOfPossibleMoves()){
                    if (!points.contains(point)) points.add(point);
                }
            }
        }
        return points;
    }
    static public ArrayList<Point> ListOfAllWhiteCord(){
        ArrayList<Point> points = new ArrayList<Point>();
        for (Pice pice : ListOfPice){
            if (!pice.color){
                for (Point point : pice.listOfPossibleMoves()){
                    if (!points.contains(point)) points.add(point);
                }
            }
        }
        return points;
    }

    public static boolean IsWhiteMate(){
        Pice blackKing = null;
        ArrayList<Point> listOfPlaceAttactByWhitePice = new ArrayList<Point>();

        for (Pice pice : ListOfPice) {
            if (!pice.getColor() && pice.pice == Pices.KING) {
                blackKing = pice;
            }
            if (pice.getColor()) {
                listOfPlaceAttactByWhitePice.addAll(pice.listOfPossibleMoves());
            }
        }
        assert blackKing != null;
        int i = 0;
        for (Point point : blackKing.listOfPossibleMoves()){
            if (listOfPlaceAttactByWhitePice.contains(point)){
                i++;
            }
        }
        if (i!=blackKing.listOfPossibleMoves().size()) return false;
        i = 0;
        for (Point point : blackKing.listOfPossibleBeat()){
            if (listOfPlaceAttactByWhitePice.contains(point)){
                i++;
            }
        }
        if (i!=blackKing.listOfPossibleBeat().size()) return false;

        //Can I block mate?

        return IsWhiteUnderCheck();
    }

    public static boolean IsBlackMate(){
        Pice whiteKing = null;
        ArrayList<Point> listOfPlaceAttactByBlackPice = new ArrayList<Point>();

        for (Pice pice : ListOfPice) {
            if (pice.getColor() && pice.pice == Pices.KING) {
                whiteKing = pice;
            }
            if (!pice.getColor()) {
                listOfPlaceAttactByBlackPice.addAll(pice.listOfPossibleMoves());
            }
        }
        assert whiteKing != null;
        int i = 0;
        for (Point point : whiteKing.listOfPossibleMoves()){
            if (listOfPlaceAttactByBlackPice.contains(point)){
                i++;
            }
        }
        if (i!=whiteKing.listOfPossibleMoves().size()) return false;
        i = 0;
        for (Point point : whiteKing.listOfPossibleBeat()){
            if (listOfPlaceAttactByBlackPice.contains(point)){
                i++;
            }
        }
        if (i!=whiteKing.listOfPossibleBeat().size()) return false;

        //Can I block mate?

        return IsBlackUnderCheck();
    }
    public static boolean IsWhiteUnderCheck(){
        ArrayList<Point> listOfAttact = new ArrayList<Point>();
        Pice blackKing = null;
        for (Pice pice : ListOfPice){
            if (pice.color){
                listOfAttact.addAll(pice.listOfPossibleBeat());
                listOfAttact.addAll(pice.listOfPossibleMoves());
            }
            if(!pice.getColor() && pice.pice==Pices.KING){
                blackKing = pice;
            }

        }
        return listOfAttact.contains(blackKing.position);
        
    }

    public static boolean IsBlackUnderCheck(){
        ArrayList<Point> listOfAttact = new ArrayList<Point>();
        Pice whiteKing = null;
        for (Pice pice : ListOfPice){
            if (!pice.color){
                listOfAttact.addAll(pice.listOfPossibleBeat());
                listOfAttact.addAll(pice.listOfPossibleMoves());
            }
            if(pice.getColor() && pice.pice==Pices.KING){
                whiteKing = pice;
            }
        }
        return listOfAttact.contains(whiteKing.position);

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
    public static Pice GetWhitePice(Point position){
        for (Pice pice : ListOfPice) {
            if (pice.getPosition().equals(position) && pice.color.equals(false)) {
                return pice;
            }
        }
        return null;
    }
    public static Pice GetBlackPice(Point position){
        for (Pice pice : ListOfPice) {
            if (pice.getPosition().equals(position) && pice.color.equals(true)) {
                return pice;
            }
        }
        return null;
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
