package com.noticloudrd.checkboximg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox cbCarne,cbQueso,cbPan,cbPapas;
    private ImageView imgView;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbCarne = (CheckBox)findViewById(R.id.cbCarne);
        cbQueso = (CheckBox)findViewById(R.id.cbQueso);
        cbPan = (CheckBox)findViewById(R.id.cbPan);
        cbPapas = (CheckBox)findViewById(R.id.cbPapas);
        imgView = (ImageView)findViewById(R.id.imgView);

        cbCarne.setOnClickListener(this);
        cbQueso.setOnClickListener(this);
        cbPan.setOnClickListener(this);
        cbPapas.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        ejecutar();

    }


    public boolean validar(){
        if (cbPapas.isChecked() && cbQueso.isChecked() && cbCarne.isChecked()){
            Toast.makeText(this, "No se puede seleccionar mas de 2 ingredientes", Toast.LENGTH_SHORT).show();
            cbPapas.toggle();
            cbQueso.toggle();
            cbCarne.toggle();
//            cbPan.toggle();
            imgView.setImageResource(R.drawable.nothing);

            return true;
        }else if (cbPan.isChecked() && cbQueso.isChecked() && cbCarne.isChecked()){
            Toast.makeText(this, "No se puede seleccionar mas de 2 ingredientes", Toast.LENGTH_SHORT).show();
//            cbPapas.toggle();
            cbQueso.toggle();
            cbCarne.toggle();
            cbPan.toggle();
            imgView.setImageResource(R.drawable.nothing);
            return true;
        }else if (cbPan.isChecked() && cbPapas.isChecked() && cbCarne.isChecked()){
            Toast.makeText(this, "No se puede seleccionar mas de 2 ingredientes", Toast.LENGTH_SHORT).show();
            cbPapas.toggle();
//            cbQueso.toggle();
            cbCarne.toggle();
            cbPan.toggle();
            imgView.setImageResource(R.drawable.nothing);

            return true;
        }else if (cbPan.isChecked() && cbPapas.isChecked() && cbQueso.isChecked()){
            Toast.makeText(this, "No se puede seleccionar mas de 2 ingredientes", Toast.LENGTH_SHORT).show();
            cbPapas.toggle();
            cbQueso.toggle();
//            cbCarne.toggle();
            cbPan.toggle();
            imgView.setImageResource(R.drawable.nothing);
            return true;
        }else{
            return  false;
        }

    }

    public void ejecutar(){
        if (validar()){


        }else if ( cbPan.isChecked() && cbQueso.isChecked() ){

            imgView.setImageResource(R.drawable.quesopan);

        }else if ( cbPan.isChecked() && cbCarne.isChecked() ){

            imgView.setImageResource(R.drawable.carnepan);

        }else if (cbPapas.isChecked() && cbCarne.isChecked()){
            imgView.setImageResource(R.drawable.papascarne);

        }else if (cbPapas.isChecked() && cbPan.isChecked()){
            imgView.setImageResource(R.drawable.panpapas);

        }else if (cbCarne.isChecked() && cbQueso.isChecked()){
            imgView.setImageResource(R.drawable.carnequeso);

        }else if (cbPapas.isChecked() && cbQueso.isChecked()){
            imgView.setImageResource(R.drawable.quesopapas);

        }


        //Un Check
        //------------------------------------------------------
        else if  (cbCarne.isChecked()){
//            Toast.makeText(this, "JAMON IS CHECKED", Toast.LENGTH_SHORT).show();
            imgView.setImageResource(R.drawable.jamon);

        }else if  (cbPapas.isChecked()){
//            Toast.makeText(this, "papas IS CHECKED", Toast.LENGTH_SHORT).show();

            imgView.setImageResource(R.drawable.papas);
        }
        else if  (cbPan.isChecked()){
//            Toast.makeText(this, "pan IS CHECKED", Toast.LENGTH_SHORT).show();

            imgView.setImageResource(R.drawable.pan);
        }
        else if  (cbQueso.isChecked()){
//            Toast.makeText(this, "queso IS CHECKED", Toast.LENGTH_SHORT).show();

            imgView.setImageResource(R.drawable.queso);
        }else if ( cbPan.isChecked() == false && cbQueso.isChecked()== false && cbPan.isChecked()== false && cbQueso.isChecked()== false ){

            imgView.setImageResource(R.drawable.nothing);

        }



    }

}
