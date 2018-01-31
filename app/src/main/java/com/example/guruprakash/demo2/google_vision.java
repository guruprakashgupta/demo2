package com.example.guruprakash.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import info.androidhive.barcode.BarcodeReader;

import static android.widget.Toast.*;
import static com.google.android.gms.vision.CameraSource.*;

public class google_vision extends AppCompatActivity implements  BarcodeReader.BarcodeReaderListener{

TextView e;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_vision);
    }
//protected void onResume(){
       //  super.onResume();
         //startTimer();
//}








    @Override
    public void onScanned(Barcode barcode) {
      //  Log.i("onScanned();", "onScanned: ");
  //  Intent i= new Intent(google_vision.this,Main3Activity.class);

  //i.putExtra("code",barcode.displayValue);


      //      // startActivity(i);


        final String s= barcode.displayValue;
     runOnUiThread(new Runnable() {
         @Override
         public void run() {
             e=(TextView) findViewById(R.id.EditText2) ;

            e.setText(s);
            // Toast.makeText(this,"Barcode No is: "+s, LENGTH_SHORT).show();

         }
     });

    }




    @Override
    public void onScannedMultiple(List<Barcode> barcodes) {
        //Log.i("onScannedMultiple();", "onScannedMultiple: ");
    }

    @Override
    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {
     //   Log.i("onBitmapScanned();", "onBitmapScanned: ");
    }

    @Override
    public void onScanError(String errorMessage) {

        //Log.i("onScanError();", "onScanError: ");
    }

    @Override
    public void onCameraPermissionDenied() {
        //Log.i("onCameraPermissionDenied();", "onCameraPermissionDenied: ");
    }

}
