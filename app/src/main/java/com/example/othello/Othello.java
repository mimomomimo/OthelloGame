package com.example.othello;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static java.lang.Thread.sleep;

public class Othello {
    static String pc1 = "O";
    static String pc2 = "X";


    public static int returnOthello(int tate, int yoko, String jibun, String aite, Button b[][]){
        int can = 0;
        if(tate+1<8 && aite.equals(b[tate+1][yoko].getText())){
            for (int i = tate+1; i < 8; i++) {
                if(jibun.equals(b[i][yoko].getText())){
                    for(int j=tate+1;j<i;j++){
                        b[j][yoko].setText(jibun);
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(b[i][yoko].getText()))) {
                    break;
                }

            }
        }
        //上方向
        if(tate-1>=0 && aite.equals(b[tate-1][yoko].getText())){
            for (int i = tate-1; i >= 0; i--) {
                if(jibun.equals(b[i][yoko].getText())){
                    for(int j=tate-1;j>i;j--){
                        b[j][yoko].setText(jibun);
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(b[i][yoko].getText()))) {
                    break;
                }

            }
        }
        //右
        if(yoko+1<8 && aite.equals(b[tate][yoko+1].getText())){
            for (int i = yoko+1; i < 8; i++) {
                if(jibun.equals(b[tate][i].getText())){
                    for(int j=yoko+1;j<i;j++){
                        b[tate][j].setText(jibun);
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(b[tate][i].getText()))) {
                    break;
                }

            }
        }
        //下
        if(yoko-1>=0 && aite.equals(b[tate][yoko-1].getText())){
            for (int i = yoko-1; i >= 0; i--) {
                if(jibun.equals(b[tate][i].getText())){
                    for(int j=yoko-1;j>i;j--){
                        b[tate][j].setText(jibun);
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(b[tate][i].getText()))) {
                    break;
                }

            }
        }
        //右斜め下
        if(yoko+1 < 8 && tate+1 < 8 && aite.equals(b[tate+1][yoko+1].getText())){
            for (int i = 1;(tate+i < 8 && yoko + i < 8); i++) {
                if(jibun.equals(b[tate+i][yoko+i].getText())){
                    for(int j=1; j < i ; j++){
                        b[tate+j][yoko+j].setText(jibun);
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(b[tate+i][yoko+i].getText()))) {
                    break;
                }

            }
        }
        //右斜め上
        if(yoko+1 < 8 && tate-1 >= 0 && aite.equals(b[tate-1][yoko+1].getText())){
            for (int i = 1;(tate-i >= 0 && yoko + i < 8); i++) {
                if(jibun.equals(b[tate-i][yoko+i].getText())){
                    for(int j=1; j < i ; j++){
                        b[tate-j][yoko+j].setText(jibun);
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(b[tate-i][yoko+i].getText()))) {
                    break;
                }

            }
        }
        //左斜め上
        if(yoko-1 >= 0 && tate-1 >= 0 && aite.equals(b[tate-1][yoko-1].getText())){
            for (int i = 1;(tate-i >= 0 && yoko - i >= 0); i++) {
                if(jibun.equals(b[tate-i][yoko-i].getText())){
                    for(int j=1; j < i ; j++){
                        b[tate-j][yoko-j].setText(jibun);
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(b[tate-i][yoko-i].getText()))) {
                    break;
                }

            }
        }
        //左斜め下
        if(yoko-1 >= 0 && tate+1 < 8 && aite.equals(b[tate+1][yoko-1].getText())){
            for (int i = 1;(tate+i < 8 && yoko - i >= 0); i++) {
                if(jibun.equals(b[tate+i][yoko-i].getText())){
                    for(int j=1; j < i ; j++){
                        b[tate+j][yoko-j].setText(jibun);
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(b[tate+i][yoko-i].getText()))) {
                    break;
                }

            }
        }
        return can;
    }

    public static  int count(int tate, int yoko, String jibun, String aite, Button b[][]){
        int count = 0;
        if(tate+1<8 && aite.equals(b[tate+1][yoko].getText())){
            for (int i = tate+1; i < 8; i++) {
                if(jibun.equals(b[i][yoko].getText())){
                    for(int j=tate+1;j<i;j++){
                        count++;
                    }
                    break;
                }
                else if(!(aite.equals(b[i][yoko].getText()))) {
                    break;
                }

            }
        }
        //上方向
        if(tate-1>=0 && aite.equals(b[tate-1][yoko].getText())){
            for (int i = tate-1; i >= 0; i--) {
                if(jibun.equals(b[i][yoko].getText())){
                    for(int j=tate-1;j>i;j--){
                        count++;
                    }
                    break;
                }
                else if(!(aite.equals(b[i][yoko].getText()))) {
                    break;
                }

            }
        }
        //右
        if(yoko+1<8 && aite.equals(b[tate][yoko+1].getText())){
            for (int i = yoko+1; i < 8; i++) {
                if(jibun.equals(b[tate][i].getText())){
                    for(int j=yoko+1;j<i;j++){
                        count++;
                    }
                    break;
                }
                else if(!(aite.equals(b[tate][i].getText()))) {
                    break;
                }

            }
        }
        //下
        if(yoko-1>=0 && aite.equals(b[tate][yoko-1].getText())){
            for (int i = yoko-1; i >= 0; i--) {
                if(jibun.equals(b[tate][i].getText())){
                    for(int j=yoko-1;j>i;j--){
                        count++;
                    }
                    break;
                }
                else if(!(aite.equals(b[tate][i].getText()))) {
                    break;
                }

            }
        }
        //右斜め下
        if(yoko+1 < 8 && tate+1 < 8 && aite.equals(b[tate+1][yoko+1].getText())){
            for (int i = 1;(tate+i < 8 && yoko + i < 8); i++) {
                if(jibun.equals(b[tate+i][yoko+i].getText())){
                    for(int j=1; j < i ; j++){
                        count++;
                    }
                    break;
                }
                else if(!(aite.equals(b[tate+i][yoko+i].getText()))) {
                    break;
                }

            }
        }
        //右斜め上
        if(yoko+1 < 8 && tate-1 >= 0 && aite.equals(b[tate-1][yoko+1].getText())){
            for (int i = 1;(tate-i >= 0 && yoko + i < 8); i++) {
                if(jibun.equals(b[tate-i][yoko+i].getText())){
                    for(int j=1; j < i ; j++) {
                        count++;
                    }
                    break;
                }
                else if(!(aite.equals(b[tate-i][yoko+i].getText()))) {
                    break;
                }

            }
        }
        //左斜め上
        if(yoko-1 >= 0 && tate-1 >= 0 && aite.equals(b[tate-1][yoko-1].getText())){
            for (int i = 1;(tate-i >= 0 && yoko - i >= 0); i++) {
                if(jibun.equals(b[tate-i][yoko-i].getText())){
                    for(int j=1; j < i ; j++){
                        count++;
                    }
                    break;
                }
                else if(!(aite.equals(b[tate-i][yoko-i].getText()))) {
                    break;
                }

            }
        }
        //左斜め下
        if(yoko-1 >= 0 && tate+1 < 8 && aite.equals(b[tate+1][yoko-1].getText())){
            for (int i = 1;(tate+i < 8 && yoko - i >= 0); i++) {
                if(jibun.equals(b[tate+i][yoko-i].getText())){
                    for(int j=1; j < i ; j++) {
                        count++;
                    }
                    break;
                }
                else if(!(aite.equals(b[tate+i][yoko-i].getText()))) {
                    break;
                }

            }
        }
        return count;
    }

    public static void syncOthello(Button[][] button, ImageButton[][] kuro, ImageButton[][] shiro ){
        for(int i=0;i < 8;i ++){
            for(int j=0;j < 8;j++){
                if((button[i][j].getText()).equals("O")){
                    kuro[i][j].setVisibility(View.INVISIBLE);
                    shiro[i][j].setVisibility(View.VISIBLE);
                }
                else if((button[i][j].getText()).equals("X")){
                    kuro[i][j].setVisibility(View.VISIBLE);
                    shiro[i][j].setVisibility(View.INVISIBLE);
                }
            }

        }
    }
    public static int countOthello(String pc, Button b[][]){
        int c = 0;
        for(int i=0;i < 8;i ++){
            for(int j=0;j < 8;j++){
                if((b[i][j].getText()).equals(pc)){
                    c++;
                }
            }
        }
        return c;
    }
    public static void tokutenMax1(Button[][] button,ImageButton[][] kuro, ImageButton[][] shiro, Button tokutenKuro, Button tokutenShiro){
        int tokuten = 0;
        int tate=100,yoko=100;

        for(int i=0;i < 8;i++) {
            for (int j = 0; j < 8; j++) {
                if(button[i][j].getText().equals("")){
                    int c = count(i, j, pc2, pc1, button);
                    if (c > tokuten) {
                        tokuten = c;
                        tate = i;
                        yoko = j;
                    }

                }
            }
        }
        if(tate < 8 && tate >= 0 || yoko > 8 && yoko >= 0) {
            returnOthello(tate,yoko,pc2,pc1,button);
            button[tate][yoko].setText(pc2);
            syncOthello(button,kuro,shiro);
        }
        int s = countOthello(pc1,button);
        int k= countOthello(pc2,button);
        tokutenShiro.setText(String.valueOf(s));
        tokutenKuro.setText(String.valueOf(k));
    }
}
