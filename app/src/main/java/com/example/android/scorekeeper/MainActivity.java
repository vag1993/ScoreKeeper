package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {


    /**
     * _______________________Orizo ta Koumpia wste na ta kaleso stin methodo mesa_____________________________________________
     **/

    public Button arsPlus, arsMinus, totPlus, totMinus, arsFplus, arsFminus, arsCplus, arsCminus, arsYplus, arsYminus, arsRplus, arsRminus, arsOplus, arsOminus, totFplus, totFminus, totCplus, totCminus, totYplus, totYminus, totRplus, totRminus, totOplus, totOminus , reset ;

    /**
     * _______________________Orizo ta TextViews wste na ta kaleso stin methodo mesa_____________________________________________
     **/
    public TextView aScore, aFouls, aCorners, aYellow, aRed, aOffsides, tScore, tFouls, tCorners, tYellow, tRed, tOffsides;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arsPlus = (Button) findViewById(R.id.arsButtonPlus);
        arsMinus = (Button) findViewById(R.id.arsButtonMinus);
        arsFplus = (Button) findViewById(R.id.foulsArsPlus);
        arsFminus = (Button) findViewById(R.id.foulsArsMinus);
        arsCplus = (Button) findViewById(R.id.cornersArsPlus);
        arsCminus = (Button) findViewById(R.id.cornersArsMinus);
        arsYplus = (Button) findViewById(R.id.yellowArsPlus);
        arsYminus = (Button) findViewById(R.id.yellowArsMinus);
        arsRplus = (Button) findViewById(R.id.redArsPlus);
        arsRminus = (Button) findViewById(R.id.redArsMinus);
        arsOplus = (Button) findViewById(R.id.offsidesArsPlus);
        arsOminus = (Button) findViewById(R.id.offsidesArsMinus);

        totPlus = (Button) findViewById(R.id.totButtonPlus);
        totMinus = (Button) findViewById(R.id.totButtonMinus);
        totFplus = (Button) findViewById(R.id.foulsTotPlus);
        totFminus = (Button) findViewById(R.id.foulsTOTminus);
        totCplus = (Button) findViewById(R.id.cornersTotPlus);
        totCminus = (Button) findViewById(R.id.cornersTOTminus);
        totYplus=(Button)findViewById(R.id.yellowTotPlus);
        totYminus=(Button)findViewById(R.id.yellowTOTminus);
        totRplus=(Button)findViewById(R.id.redTotPlus);
        totRminus=(Button)findViewById(R.id.redTOTminus);
        totOplus=(Button)findViewById(R.id.offsidesTotPlus);
        totOminus=(Button)findViewById(R.id.offsidesTOTminus);

        reset=(Button)findViewById(R.id.resetAll);

        aScore = (TextView) findViewById(R.id.arsScore);
        tScore = (TextView) findViewById(R.id.totScore);
        aFouls = (TextView) findViewById(R.id.foulArsCounter);
        aCorners = (TextView) findViewById(R.id.cornerArsCounter);
        aYellow = (TextView) findViewById(R.id.yellowArsCounter);
        aRed = (TextView) findViewById(R.id.redArsCounter);
        aOffsides = (TextView) findViewById(R.id.offsidesArsCounter);
        tFouls = (TextView) findViewById(R.id.foulTotCounter);
        tCorners = (TextView) findViewById(R.id.cornerTotcounter);
        tYellow=(TextView)findViewById(R.id.yellowTotcounter);
        tRed=(TextView)findViewById(R.id.redTotcounter);
        tOffsides=(TextView)findViewById(R.id.offsidesTotcount);


/**______________________      TO + GIA TA GKOL TIS ARSENAL    __________________ **/


        arsPlus.setOnClickListener(new View.OnClickListener() {
            int scoreArs;

            @Override
            public void onClick(View v) {
                scoreArs = Integer.valueOf(aScore.getText().toString());
                scoreArs++;
                aScore.setText(Integer.toString(scoreArs));
            }
        });


/**______________________      TO - GIA TA GKOL TIS ARSENAL    __________________ **/


        arsMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreArs = Integer.valueOf(aScore.getText().toString());
                scoreArs--;
                aScore.setText(Integer.toString(scoreArs));
            }
        });


/**______________________      TO + GIA TA FOUL TIS ARSENAL    __________________ **/


        arsFplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int foulsArs = Integer.valueOf(aFouls.getText().toString());
                foulsArs++;
                aFouls.setText(Integer.toString(foulsArs));
            }
        });


/**______________________      TO - GIA TA FOUL TIS ARSENAL    __________________ **/


        arsFminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int foulsArs = Integer.valueOf(aFouls.getText().toString());
                foulsArs--;
                aFouls.setText(Integer.toString(foulsArs));
            }
        });


/**______________________      TO + GIA TA CORNER TIS ARSENAL    __________________ **/


        arsCplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int cornersArs = Integer.valueOf(aCorners.getText().toString());
                cornersArs++;
                aCorners.setText(Integer.toString(cornersArs));
            }
        });


/**______________________      TO - GIA TA CORNER TIS ARSENAL    __________________ **/


        arsCminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int cornersArs = Integer.valueOf(aCorners.getText().toString());
                cornersArs--;
                aCorners.setText(Integer.toString(cornersArs));

            }
        });


/**______________________      TO + GIA TIS KITRINES KARTES TIS ARSENAL    __________________ **/


        arsYplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int yellowArs = Integer.valueOf(aYellow.getText().toString());
                yellowArs++;
                aYellow.setText(Integer.toString(yellowArs));

            }
        });


/**______________________      TO - GIA TIS KITRINES KARTES TIS ARSENAL    __________________ **/


        arsYminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int yellowArs = Integer.valueOf(aYellow.getText().toString());
                yellowArs--;
                aYellow.setText(Integer.toString(yellowArs));

            }
        });


/**______________________      TO + GIA TIS KOKKINES KARTES TIS ARSENAL    __________________ **/


        arsRplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int redArs = Integer.valueOf(aRed.getText().toString());
                redArs++;
                aRed.setText(Integer.toString(redArs));

            }
        });


/**______________________      TO - GIA TIS KOKKINES KARTES TIS ARSENAL    __________________ **/


        arsRminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int redArs = Integer.valueOf(aRed.getText().toString());
                redArs--;
                aRed.setText(Integer.toString(redArs));

            }
        });


/**______________________      TO + GIA TA OFFSIDE TIS ARSENAL    __________________ **/


        arsOplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int offsidesArs = Integer.valueOf(aOffsides.getText().toString());
                offsidesArs++;
                aOffsides.setText(Integer.toString(offsidesArs));

            }
        });


/**______________________      TO - GIA TA OFFSIDE TIS ARSENAL    __________________ **/


        arsOminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int offsidesArs = Integer.valueOf(aOffsides.getText().toString());
                offsidesArs--;
                aOffsides.setText(Integer.toString(offsidesArs));

            }
        });


/**______________________      TO + GIA TA GOAL TIS TOTTENHAM    __________________ **/


        totPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreTot = Integer.valueOf(tScore.getText().toString());
                scoreTot++;
                tScore.setText(Integer.toString(scoreTot));

            }
        });


/**______________________      TO - GIA TA GOAL TIS TOTTENHAM    __________________ **/


        totMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scoreTot = Integer.valueOf(tScore.getText().toString());
                scoreTot--;
                tScore.setText(Integer.toString(scoreTot));

            }
        });


/**______________________      TO + GIA TA FOUL TIS TOTTENHAM    __________________ **/


        totFplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int foulTot = Integer.valueOf(tFouls.getText().toString());
                foulTot++;
                tFouls.setText(Integer.toString(foulTot));

            }
        });


/**______________________      TO - GIA TA FOUL TIS TOTTENHAM    __________________ **/


        totFminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int foulTot = Integer.valueOf(tFouls.getText().toString());
                foulTot--;
                tFouls.setText(Integer.toString(foulTot));
            }
        });


/**______________________      TO + GIA TA CORNER TIS TOTTENHAM    __________________ **/


        totCplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cornerTot = Integer.valueOf(tCorners.getText().toString());
                cornerTot++;
                tCorners.setText(Integer.toString(cornerTot));
            }
        });


/**______________________      TO - GIA TA CORNER TIS TOTTENHAM    __________________ **/


        totCminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cornerTot = Integer.valueOf(tCorners.getText().toString());
                cornerTot--;
                tCorners.setText(Integer.toString(cornerTot));
            }
        });


/**______________________      TO + GIA TIS KITRINES KARTES TIS TOTTENHAM    __________________ **/


        totYplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yellowTot = Integer.valueOf(tYellow.getText().toString());
                yellowTot++;
                tYellow.setText(Integer.toString(yellowTot));
            }
        });


/**______________________      TO - GIA TIS KITRINES KARTES TIS TOTTENHAM    __________________ **/


        totYminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int yellowTot = Integer.valueOf(tYellow.getText().toString());
                yellowTot--;
                tYellow.setText(Integer.toString(yellowTot));
            }
        });


/**______________________      TO + GIA TIS KOKKINES KARTES TIS TOTTENHAM    __________________ **/


        totRplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int redTot = Integer.valueOf(tRed.getText().toString());
                redTot++;
                tRed.setText(Integer.toString(redTot));
            }
        });


/**______________________      TO - GIA TIS KOKKINES KARTES TIS TOTTENHAM    __________________ **/


        totRminus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int redTot = Integer.valueOf(tRed.getText().toString());
                redTot--;
                tRed.setText(Integer.toString(redTot));
            }
        });


/**______________________      TO + GIA TA OFFSIDE TIS TOTTENHAM    __________________ **/


        totOplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int offsidesTot = Integer.valueOf(tOffsides.getText().toString());
                offsidesTot++;
                tOffsides.setText(Integer.toString(offsidesTot));
            }
        });


/**______________________      TO - GIA TA OFFSIDE TIS TOTTENHAM    __________________ **/


        totOminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int offsidesTot = Integer.valueOf(tOffsides.getText().toString());
                offsidesTot--;
                tOffsides.setText(Integer.toString(offsidesTot));
            }
        });

    reset.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int scoreArs=Integer.valueOf(aScore.getText().toString());
            scoreArs = 0;
            aScore.setText(Integer.toString(scoreArs));

            int foulsArs=Integer.valueOf(aFouls.getText().toString());
            foulsArs = 0;
            aFouls.setText(Integer.toString(foulsArs));

            int cornersArs=Integer.valueOf(aCorners.getText().toString());
            cornersArs = 0;
            aCorners.setText(Integer.toString(cornersArs));

            int yellowArs=Integer.valueOf(aFouls.getText().toString());
            yellowArs = 0;
            aYellow.setText(Integer.toString(yellowArs));

            int redArs=Integer.valueOf(aRed.getText().toString());
            redArs = 0;
            aRed.setText(Integer.toString(redArs));

            int offsidesArs=Integer.valueOf(aOffsides.getText().toString());
            offsidesArs = 0;
            aOffsides.setText(Integer.toString(offsidesArs));

            int scoreTot=Integer.valueOf(tScore.getText().toString());
            scoreTot = 0;
            tScore.setText(Integer.toString(scoreTot));

            int foulTot=Integer.valueOf(tFouls.getText().toString());
            foulTot = 0;
            tFouls.setText(Integer.toString(foulTot));

            int cornerTot=Integer.valueOf(tCorners.getText().toString());
            cornerTot = 0;
            tCorners.setText(Integer.toString(cornerTot));

            int yellowTot=Integer.valueOf(tYellow.getText().toString());
            yellowTot = 0;
            tYellow.setText(Integer.toString(yellowTot));

            int redTot=Integer.valueOf(tRed.getText().toString());
            redTot = 0;
            tRed.setText(Integer.toString(redTot));

            int offsidesTot=Integer.valueOf(tOffsides.getText().toString());
            offsidesTot = 0;
            tOffsides.setText(Integer.toString(offsidesTot));
        }
    });


    }
}

