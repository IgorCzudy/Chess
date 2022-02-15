package com.GUI;

import com.company.Pices;

import javax.swing.*;
import java.util.HashMap;

public class Map {

    static HashMap<Pices,ImageIcon> mapaForBlack = new HashMap<>();
    static HashMap<Pices,ImageIcon> mapaForWhite = new HashMap<>();

    Map(){
        mapaForBlack.put(Pices.KING,new ImageIcon("Pices/Chess_kdt60.png"));
        mapaForBlack.put(Pices.ROOK,new ImageIcon("Pices/Chess_rdt60.png"));
        mapaForBlack.put(Pices.BISHOP,new ImageIcon("Pices/Chess_bdt60.png"));
        mapaForBlack.put(Pices.QUEEN,new ImageIcon("Pices/Chess_qdt60.png"));
        mapaForBlack.put(Pices.KNIGHT,new ImageIcon("Pices/Chess_ndt60.png"));
        mapaForBlack.put(Pices.PAWN,new ImageIcon("Pices/Chess_pdt60.png"));

        mapaForWhite.put(Pices.KING,new ImageIcon("Pices/Chess_klt60.png"));
        mapaForWhite.put(Pices.ROOK,new ImageIcon("Pices/Chess_rlt60.png"));
        mapaForWhite.put(Pices.BISHOP,new ImageIcon("Pices/Chess_blt60.png"));
        mapaForWhite.put(Pices.QUEEN,new ImageIcon("Pices/Chess_qlt60.png"));
        mapaForWhite.put(Pices.KNIGHT,new ImageIcon("Pices/Chess_nlt60.png"));
        mapaForWhite.put(Pices.PAWN,new ImageIcon("Pices/Chess_plt60.png"));

    }
    static ImageIcon mapFunction(Boolean color, Pices pice){

        if (color) return mapaForBlack.get(pice);
        else return mapaForWhite.get(pice);
    }
}
