package com.example.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView) findViewById(R.id.image1);
        img2=(ImageView) findViewById(R.id.image2);
        img3=(ImageView) findViewById(R.id.image3);
        img4=(ImageView) findViewById(R.id.image4);
        img5=(ImageView) findViewById(R.id.image5);
        img6=(ImageView) findViewById(R.id.image6);
        img7=(ImageView) findViewById(R.id.image7);
        img8=(ImageView) findViewById(R.id.image8);
        img9=(ImageView) findViewById(R.id.image9);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        int num_imagen= (int)  (Math.random() * ((4 - 1) + 1)) + 1;
        String imagen = "imagen" +num_imagen;


        switch (v.getId()){
            case R.id.image1:
                img1.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));
                break;
            case R.id.image2:
                img2.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));
                break;
            case R.id.image3:
                img3.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));
                break;
            case R.id.image4:
                img4.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));
                break;
            case R.id.image5:
                img5.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));
                break;
            case R.id.image6:
                img6.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));
                break;
            case R.id.image7:
                img7.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));
                break;
            case R.id.image8:
                img8.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));
                break;
            case R.id.image9:
                img9.setImageResource(getResources().getIdentifier(imagen, "drawable", getPackageName()));

        }

    }
}
