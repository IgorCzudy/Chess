package com.GUI;

import com.GUI.Map;
import com.company.Core;
import com.company.Pice;
import com.company.Pices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Panel extends JPanel implements ActionListener {

    JButton[][] buttons;
    Map map;


    Panel(){
        Map map = new Map();
        buttons = new JButton[8][8];
        this.setLayout(new GridLayout(8, 8));

        for(int i=0;i<8;i++) {
            for (int j = 0; j < 8; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFocusable(false);
                if((i+j)%2==0)buttons[i][j].setBackground(new Color(253, 255, 191));
                else buttons[i][j].setBackground(new Color(95, 143, 1));
                this.add(buttons[i][j]);
                buttons[i][j].addActionListener(this);
            }
        }
        startPosition();
    }

    void startPosition(){

        for (int i =0;i<8;i++){
            buttons[1][i].setIcon(Map.mapFunction(true, Pices.PAWN));
            buttons[6][i].setIcon(Map.mapFunction(false,Pices.PAWN));
        }
        buttons[0][0].setIcon(Map.mapFunction(true,Pices.ROOK));
        buttons[0][7].setIcon(Map.mapFunction(true,Pices.ROOK));
        buttons[7][7].setIcon(Map.mapFunction(false,Pices.ROOK));
        buttons[7][0].setIcon(Map.mapFunction(false,Pices.ROOK));

        buttons[0][2].setIcon(Map.mapFunction(true,Pices.BISHOP));
        buttons[0][5].setIcon(Map.mapFunction(true,Pices.BISHOP));
        buttons[7][2].setIcon(Map.mapFunction(false,Pices.BISHOP));
        buttons[7][5].setIcon(Map.mapFunction(false,Pices.BISHOP));

        buttons[0][1].setIcon(Map.mapFunction(true,Pices.KNIGHT));
        buttons[0][6].setIcon(Map.mapFunction(true,Pices.KNIGHT));
        buttons[7][1].setIcon(Map.mapFunction(false,Pices.KNIGHT));
        buttons[7][6].setIcon(Map.mapFunction(false,Pices.KNIGHT));

        buttons[0][3].setIcon(Map.mapFunction(true,Pices.QUEEN));
        buttons[7][3].setIcon(Map.mapFunction(false,Pices.QUEEN));

        buttons[0][4].setIcon(Map.mapFunction(true,Pices.KING));
        buttons[7][4].setIcon(Map.mapFunction(false,Pices.KING));

    }

    void moveGUI(int startX,int startY, int stopX, int stopY,Boolean color, Pices pice){
        buttons[startX][startY].setIcon(null);
        buttons[stopX][stopY].setIcon(Map.mapFunction(color,pice));
    }



    void LightOn(ArrayList<Point> list){
        for (Point point : list) {
            buttons[point.x][point.y].setBackground(Color.lightGray);
        }
    }
    void LightOnBeat(ArrayList<Point> list){
        for (Point point : list) {
            buttons[point.x][point.y].setBackground(Color.red);
        }
    }
    void LightOff(ArrayList<Point> list){
        int x,y;
        for (Point point : list) {
            x = point.x;
            y = point.y;
            if ((x + y) % 2 == 0) {
                buttons[point.x][point.y].setBackground(new Color(253, 255, 191));
            } else {
                buttons[point.x][point.y].setBackground(new Color(95, 143, 1));
            }
        }
    }

    boolean toMove = false;
    Pice TachedPice;
    Point pointToMove;

    @Override
    public void actionPerformed(ActionEvent e) {
        int i=0,j=0;

        for (int ii = 0; ii<8; ii++){
            for (int jj = 0; jj<8; jj++) {
                if (e.getSource()==buttons[ii][jj]){
                        i = ii;
                        j = jj;
                    }
                }
            }


        if (!toMove) {
            TachedPice = Core.GetPice(new Point(i, j));
        }
        else{
            pointToMove = new Point(i, j);
        }

        if(!toMove){
            if(TachedPice != null) {
                //podwświetl liste po prawidłowym kliknęciu
                LightOn(TachedPice.listOfPossibleMoves());
                LightOnBeat(TachedPice.listOfPossibleBeat());
                toMove = true;
            }
            else{
                // nie kliknął na pinek zwróć
                return;
            }
        }
        //drugie kliknięcie
        else{
                //
               if (TachedPice.listOfPossibleMoves().contains(pointToMove)){
                    //move pointToMove = new Point(i, j);
                   //posunięcie i zgaszenie wszystkiego

                   LightOff(TachedPice.listOfPossibleMoves());
                   LightOff(TachedPice.listOfPossibleBeat());
                   buttons[TachedPice.getPosition().x][TachedPice.getPosition().y].setIcon(null);
                   buttons[pointToMove.x][pointToMove.y].setIcon(Map.mapFunction(TachedPice.getColor(),TachedPice.getPice()));
                   TachedPice.move(pointToMove);
                   toMove=false;
                }
               else if(TachedPice.listOfPossibleBeat().contains(pointToMove)){
                   //beat
                   //zbicie i zgaszenie wszystkiego

                   LightOff(TachedPice.listOfPossibleMoves());
                   LightOff(TachedPice.listOfPossibleBeat());
                   buttons[TachedPice.getPosition().x][TachedPice.getPosition().y].setIcon(null);
                   buttons[pointToMove.x][pointToMove.y].setIcon(Map.mapFunction(TachedPice.getColor(),TachedPice.getPice()));
                   TachedPice.beat(pointToMove);

                   toMove=false;
               }
               else{
                   //złe kliknięcie zgaszenie wszystkiego
                   LightOff(TachedPice.listOfPossibleMoves());
                   LightOff(TachedPice.listOfPossibleBeat());
                   toMove=false;
               }
        }
    }

}
