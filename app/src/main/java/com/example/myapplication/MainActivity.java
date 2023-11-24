package com.example.myapplication;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private Button ButtonJugar;
    private Button SalirPlay;
    private ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10, imagen11, imagen12,imgCapturada,imgCapturada2;
    private TextView TiempoValue;
    int capImage1,capImage2,capCtrl1,capCtrl2,Contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonJugar = (Button) findViewById(R.id.ButtonPlay);
        SalirPlay = (Button) findViewById(R.id.BUTTONSALIR);
        imagen1 = (ImageView) findViewById(R.id.imageView1);
        imagen2 = (ImageView) findViewById(R.id.imageView2);
        imagen3 = (ImageView) findViewById(R.id.imageView3);
        imagen4 = (ImageView) findViewById(R.id.imageView4);
        imagen5 = (ImageView) findViewById(R.id.imageView5);
        imagen6 = (ImageView) findViewById(R.id.imageView6);
        imagen7 = (ImageView) findViewById(R.id.imageView7);
        imagen8 = (ImageView) findViewById(R.id.imageView8);
        imagen9 = (ImageView) findViewById(R.id.imageView9);
        imagen10 = (ImageView) findViewById(R.id.imageView10);
        imagen11 = (ImageView) findViewById(R.id.imageView11);
        imagen12 = (ImageView) findViewById(R.id.imageView12);

        TiempoValue = (TextView) findViewById(R.id.TextViewTiempo);
        Desactivado();

        imagen1.setOnClickListener(this);
        imagen2.setOnClickListener(this);
        imagen3.setOnClickListener(this);
        imagen4.setOnClickListener(this);
        imagen5.setOnClickListener(this);
        imagen6.setOnClickListener(this);
        imagen7.setOnClickListener(this);
        imagen8.setOnClickListener(this);
        imagen9.setOnClickListener(this);
        imagen10.setOnClickListener(this);
        imagen11.setOnClickListener(this);
        imagen12.setOnClickListener(this);

        ButtonJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Jugar(v);
            }
        });
        SalirPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Salir(v);
            }
        });
    }
        @Override
        public  void onClick(View v){
            switch (v.getId()){
                case R.id.imageView1:
                    imagen1.setImageResource(R.drawable.icono1);
                    imagen1.setEnabled(false);
                    Comparar(R.drawable.icono1,R.id.imageView1,v.getId(),imagen1);

                    break;
                case R.id.imageView2:
                    imagen2.setImageResource(R.drawable.icono3);
                    imagen2.setEnabled(false);
                    Comparar(R.drawable.icono3,R.id.imageView2,v.getId(),imagen2);
                    break;
                case R.id.imageView3:
                    imagen3.setImageResource(R.drawable.icono1);
                    imagen3.setEnabled(false);
                    Comparar(R.drawable.icono1,R.id.imageView3,v.getId(),imagen3);

                    break;
                case R.id.imageView4:
                    imagen4.setImageResource(R.drawable.icono4);
                    imagen4.setEnabled(false);
                    Comparar(R.drawable.icono4,R.id.imageView4,v.getId(),imagen4);
                    break;
                case R.id.imageView5:
                    imagen5.setImageResource(R.drawable.icono5);
                    imagen5.setEnabled(false);
                    break;
                case R.id.imageView6:
                    imagen6.setImageResource(R.drawable.icono6);
                    imagen6.setEnabled(false);
                    break;
                case R.id.imageView7:
                    imagen7.setImageResource(R.drawable.icono6);
                    imagen7.setEnabled(false);
                    break;
                case R.id.imageView8:
                    imagen8.setImageResource(R.drawable.icono3);
                    imagen8.setEnabled(false);
                    break;
                case R.id.imageView9:
                    imagen9.setImageResource(R.drawable.icono4);

                    imagen9.setEnabled(false);
                    break;
                case R.id.imageView10:
                    imagen10.setImageResource(R.drawable.icono2);
                    imagen10.setEnabled(false);
                    break;
                case R.id.imageView11:
                    imagen11.setImageResource(R.drawable.icono5);
                    imagen11.setEnabled(false);
                    break;
                case R.id.imageView12:
                    imagen12.setImageResource(R.drawable.icono2);
                    imagen12.setEnabled(false);
                    break;
            }
        }
    public void Comparar (int idImage,int idControl,int rControl,final ImageView imagen){

        if(capImage1==0){
            capImage1=idImage;
            capCtrl1=idControl;
            imgCapturada = (ImageView) findViewById(capCtrl1);
        }else{
            capCtrl2=rControl;
            if(capCtrl2!= capCtrl1) {
                capImage2 = idImage;
                if (capImage1 != capImage2) {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            imgCapturada.setImageResource(R.drawable.fondo);
                            imagen.setImageResource(R.drawable.fondo);
                        }
                    }, 100);
                    capImage1 = 0;
                    capImage2 = 0;
                } else {
                    imgCapturada.setEnabled(false);
                    imagen.setEnabled(false);
                    Contador++;
                    capImage1 = 0;
                    capImage2 = 0;
                }
            }else{
                capCtrl2=0;
            }
            }
        }

        public void Jugar(View view){
            ButtonJugar.setEnabled(false);
            imagen1.setEnabled(true);
            imagen2.setEnabled(true);
            imagen3.setEnabled(true);
            imagen4.setEnabled(true);
            imagen5.setEnabled(true);
            imagen6.setEnabled(true);
            imagen7.setEnabled(true);
            imagen8.setEnabled(true);
            imagen9.setEnabled(true);
            imagen10.setEnabled(true);
            imagen11.setEnabled(true);
            imagen12.setEnabled(true);
            Cronometro();

        }
        public void Desactivado(){
            imagen1.setEnabled(false);
            imagen2.setEnabled(false);
            imagen3.setEnabled(false);
            imagen4.setEnabled(false);
            imagen5.setEnabled(false);
            imagen6.setEnabled(false);
            imagen7.setEnabled(false);
            imagen8.setEnabled(false);
            imagen9.setEnabled(false);

        }
        public void Cronometro(){
            new CountDownTimer(60000, 1000) {

                public void onTick(long millisUntilFinished) {
                    TiempoValue.setText("" + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    TiempoValue.setText("0");
                    ButtonJugar.setEnabled(true);
                    Toast.makeText(MainActivity.this, "Se acabo el tiempo", Toast.LENGTH_SHORT).show();
                    Desactivado();
                }
            }.start();
        }


        public void Salir(View view){
            finish();
        }





}
