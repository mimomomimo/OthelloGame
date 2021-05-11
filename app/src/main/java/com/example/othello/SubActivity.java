
package com.example.othello;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;
        import android.os.Handler;

        import static android.view.View.*;
        import static java.lang.Thread.*;
//import static com.example.othello.R.id.othero81;


public class SubActivity extends AppCompatActivity {
    //main
    Button button[][] = new Button[8][8];
    ImageButton shiro[][] = new ImageButton[8][8];
    ImageButton kuro[][] = new ImageButton[8][8];
    Button tokutenShiro;
    Button tokutenKuro;
    int tern = 0;
    int[] id_btn ={
            R.id.btn1_1,R.id.btn1_2,R.id.btn1_3,R.id.btn1_4,R.id.btn1_5,R.id.btn1_6,R.id.btn1_7,R.id.btn1_8,
            R.id.btn2_1,R.id.btn2_2,R.id.btn2_3,R.id.btn2_4,R.id.btn2_5,R.id.btn2_6,R.id.btn2_7,R.id.btn2_8,
            R.id.btn3_1,R.id.btn3_2,R.id.btn3_3,R.id.btn3_4,R.id.btn3_5,R.id.btn3_6,R.id.btn3_7,R.id.btn3_8,
            R.id.btn4_1,R.id.btn4_2,R.id.btn4_3,R.id.btn4_4,R.id.btn4_5,R.id.btn4_6,R.id.btn4_7,R.id.btn4_8,
            R.id.btn5_1,R.id.btn5_2,R.id.btn5_3,R.id.btn5_4,R.id.btn5_5,R.id.btn5_6,R.id.btn5_7,R.id.btn5_8,
            R.id.btn6_1,R.id.btn6_2,R.id.btn6_3,R.id.btn6_4,R.id.btn6_5,R.id.btn6_6,R.id.btn6_7,R.id.btn6_8,
            R.id.btn7_1,R.id.btn7_2,R.id.btn7_3,R.id.btn7_4,R.id.btn7_5,R.id.btn7_6,R.id.btn7_7,R.id.btn7_8,
            R.id.btn8_1,R.id.btn8_2,R.id.btn8_3,R.id.btn8_4,R.id.btn8_5,R.id.btn8_6,R.id.btn8_7,R.id.btn8_8};
    int[] id_kuro = {
            R.id.kuro1_1,R.id.kuro1_2,R.id.kuro1_3,R.id.kuro1_4,R.id.kuro1_5,R.id.kuro1_6,R.id.kuro1_7,R.id.kuro1_8,
            R.id.kuro2_1,R.id.kuro2_2,R.id.kuro2_3,R.id.kuro2_4,R.id.kuro2_5,R.id.kuro2_6,R.id.kuro2_7,R.id.kuro2_8,
            R.id.kuro3_1,R.id.kuro3_2,R.id.kuro3_3,R.id.kuro3_4,R.id.kuro3_5,R.id.kuro3_6,R.id.kuro3_7,R.id.kuro3_8,
            R.id.kuro4_1,R.id.kuro4_2,R.id.kuro4_3,R.id.kuro4_4,R.id.kuro4_5,R.id.kuro4_6,R.id.kuro4_7,R.id.kuro4_8,
            R.id.kuro5_1,R.id.kuro5_2,R.id.kuro5_3,R.id.kuro5_4,R.id.kuro5_5,R.id.kuro5_6,R.id.kuro5_7,R.id.kuro5_8,
            R.id.kuro6_1,R.id.kuro6_2,R.id.kuro6_3,R.id.kuro6_4,R.id.kuro6_5,R.id.kuro6_6,R.id.kuro6_7,R.id.kuro6_8,
            R.id.kuro7_1,R.id.kuro7_2,R.id.kuro7_3,R.id.kuro7_4,R.id.kuro7_5,R.id.kuro7_6,R.id.kuro7_7,R.id.kuro7_8,
            R.id.kuro8_1,R.id.kuro8_2,R.id.kuro8_3,R.id.kuro8_4,R.id.kuro8_5,R.id.kuro8_6,R.id.kuro8_7,R.id.kuro8_8};
    int [] id_shiro = {
            R.id.shiro1_1,R.id.shiro1_2,R.id.shiro1_3,R.id.shiro1_4,R.id.shiro1_5,R.id.shiro1_6,R.id.shiro1_7,R.id.shiro1_8,
            R.id.shiro2_1,R.id.shiro2_2,R.id.shiro2_3,R.id.shiro2_4,R.id.shiro2_5,R.id.shiro2_6,R.id.shiro2_7,R.id.shiro2_8,
            R.id.shiro3_1,R.id.shiro3_2,R.id.shiro3_3,R.id.shiro3_4,R.id.shiro3_5,R.id.shiro3_6,R.id.shiro3_7,R.id.shiro3_8,
            R.id.shiro4_1,R.id.shiro4_2,R.id.shiro4_3,R.id.shiro4_4,R.id.shiro4_5,R.id.shiro4_6,R.id.shiro4_7,R.id.shiro4_8,
            R.id.shiro5_1,R.id.shiro5_2,R.id.shiro5_3,R.id.shiro5_4,R.id.shiro5_5,R.id.shiro5_6,R.id.shiro5_7,R.id.shiro5_8,
            R.id.shiro6_1,R.id.shiro6_2,R.id.shiro6_3,R.id.shiro6_4,R.id.shiro6_5,R.id.shiro6_6,R.id.shiro6_7,R.id.shiro6_8,
            R.id.shiro7_1,R.id.shiro7_2,R.id.shiro7_3,R.id.shiro7_4,R.id.shiro7_5,R.id.shiro7_6,R.id.shiro7_7,R.id.shiro7_8,
            R.id.shiro8_1,R.id.shiro8_2,R.id.shiro8_3,R.id.shiro8_4,R.id.shiro8_5,R.id.shiro8_6,R.id.shiro8_7,R.id.shiro8_8};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        int i = 0, j= 0;
        for (int id: id_btn){
            button[i][j] = findViewById(id);
            button[i][j].setOnClickListener(buttonClick);
            button[i][j].setTag(i*10+j);
            j+=1;
            j = j % 8;
            if (j == 0){
                i+=1;
            }
        }
        i = 0;
        j= 0;

        for (int id: id_kuro){
            kuro[i][j] = findViewById(id);
            kuro[i][j].setVisibility(View.INVISIBLE);
            j+=1;
            j = j % 8;
            if (j == 0){
                i+=1;
            }
        }
        i = 0;
        j= 0;
        for (int id: id_shiro){
            shiro[i][j] = findViewById(id);
            shiro[i][j].setVisibility(View.INVISIBLE);
            j+=1;
            j = j % 8;
            if (j == 0){
                i+=1;
            }
        }
        tokutenShiro =(Button)findViewById(R.id.shiro);
        tokutenKuro = (Button)findViewById(R.id.kuro);


        button[3][3].setText("X");
        button[3][4].setText("O");
        button[4][3].setText("O");
        button[4][4].setText("X");
        tokutenShiro.setText("0");
        tokutenKuro.setText("0");
        kuro[3][3].setVisibility(View.VISIBLE);
        shiro[3][4].setVisibility(View.VISIBLE);
        shiro[4][3].setVisibility(View.VISIBLE);
        kuro[4][4].setVisibility(View.VISIBLE);

        ImageButton returnButton = findViewById(R.id.back);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    private View.OnClickListener buttonClick = new View.OnClickListener() {
        /*@Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn8_1:
                    Button othello81 = findViewById(othero81);
                    othello81.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn8_8:
                    Button button88 = findViewById(R.id.btn8_8);
                    if(button88.getText().toString() == "A") {
                        button88.setText("button");
                    }
                    else{
                        button88.setText("A");
                    }



            }
        }*/

        public void onClick(View view) {
            String pc1 = "O";
            String pc2 = "X";
            Button b = findViewById(view.getId());
            int tag  = (int) b.getTag();
            int tate = tag / 10;//何行目か
            int yoko = tag % 10;//何列目か
            String jibun = pc1;
            String aite = pc2;
            int can = Othello.returnOthello(tate, yoko, jibun, aite, button);
            if (can > 0) {
                b.setText(jibun);
                Othello.syncOthello(button,kuro,shiro);
                new Handler().postDelayed(new Runnable() {
                    // Runnable型のインスタンス化と定義
                    @Override
                    public void run() {

                        // 遅らせて実行したい処理
                        Othello.tokutenMax1(button,kuro,shiro,tokutenKuro,tokutenShiro);
                    }
                }, 500); // 遅らせたい時間(ミリ秒) 3000ミリ秒 -> 3秒
            }
            int s = Othello.countOthello("O",button);
            int k= Othello.countOthello("X",button);
            tokutenShiro.setText(String.valueOf(s));
            tokutenKuro.setText(String.valueOf(k));

        }

    };
}
