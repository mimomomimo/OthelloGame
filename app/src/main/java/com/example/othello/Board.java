package com.example.othello;

import android.widget.Button;



public class Board {
    String[][] str_b = new String[8][8];
    public void readButtons(Button b[][]) {
        for(int i=0;i < 8;i ++){
            for(int j=0;j < 8;j++){
                if (!b[i][j].getText().toString().isEmpty()){
                    str_b[i][j] = b[i][j].getText().toString();
                }
            }
        }
    }
    public String[][] getData(){
        return str_b;
    }
    public int returnOthello(int tate, int yoko, String jibun, String aite){
        int can = 0;
        if(tate+1<8 && aite.equals(str_b[tate+1][yoko])){
            for (int i = tate+1; i < 8; i++) {
                if(jibun.equals(str_b[i][yoko])){
                    for(int j=tate+1;j<i;j++){
                        str_b[j][yoko] = jibun;
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(str_b[i][yoko]))){
                    break;
                }

            }
        }
        //上方向
        if(tate-1>=0 && aite.equals(str_b[tate-1][yoko])){
            for (int i = tate-1; i >= 0; i--) {
                if(jibun.equals(str_b[i][yoko])){
                    for(int j=tate-1;j>i;j--){
                        str_b[j][yoko] = jibun;
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(str_b[i][yoko]))) {
                    break;
                }

            }
        }
        //右
        if(yoko+1<8 && aite.equals(str_b[tate][yoko+1])){
            for (int i = yoko+1; i < 8; i++) {
                if(jibun.equals(str_b[tate][i])){
                    for(int j=yoko+1;j<i;j++){
                        str_b[tate][j] = jibun;
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(str_b[tate][i]))) {
                    break;
                }

            }
        }
        //下
        if(yoko-1>=0 && aite.equals(str_b[tate][yoko-1])){
            for (int i = yoko-1; i >= 0; i--) {
                if(jibun.equals(str_b[tate][i])){
                    for(int j=yoko-1;j>i;j--){
                        str_b[tate][j] = jibun;
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(str_b[tate][i]))) {
                    break;
                }

            }
        }
        //右斜め下
        if(yoko+1 < 8 && tate+1 < 8 && aite.equals(str_b[tate+1][yoko+1])){
            for (int i = 1;(tate+i < 8 && yoko + i < 8); i++) {
                if(jibun.equals(str_b[tate+i][yoko+i])){
                    for(int j=1; j < i ; j++){
                        str_b[tate+j][yoko+j] = jibun;
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(str_b[tate+i][yoko+i]))) {
                    break;
                }

            }
        }
        //右斜め上
        if(yoko+1 < 8 && tate-1 >= 0 && aite.equals(str_b[tate-1][yoko+1])){
            for (int i = 1;(tate-i >= 0 && yoko + i < 8); i++) {
                if(jibun.equals(str_b[tate-i][yoko+i])){
                    for(int j=1; j < i ; j++){
                        str_b[tate-j][yoko+j] = jibun;
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(str_b[tate-i][yoko+i]))) {
                    break;
                }

            }
        }
        //左斜め上
        if(yoko-1 >= 0 && tate-1 >= 0 && aite.equals(str_b[tate-1][yoko-1])){
            for (int i = 1;(tate-i >= 0 && yoko - i >= 0); i++) {
                if(jibun.equals(str_b[tate-i][yoko-i])){
                    for(int j=1; j < i ; j++){
                        str_b[tate-j][yoko-j] = jibun;
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(str_b[tate-i][yoko-i]))) {
                    break;
                }

            }
        }
        //左斜め下
        if(yoko-1 >= 0 && tate+1 < 8 && aite.equals(str_b[tate+1][yoko-1])){
            for (int i = 1;(tate+i < 8 && yoko - i >= 0); i++) {
                if(jibun.equals(str_b[tate+i][yoko-i])){
                    for(int j=1; j < i ; j++){
                        str_b[tate+j][yoko-j] = jibun;
                    }
                    can++;
                    break;
                }
                else if(!(aite.equals(str_b[tate+i][yoko-i]))) {
                    break;
                }

            }
        }
        return can;
    }
}
