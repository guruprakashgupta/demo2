package com.example.guruprakash.demo2;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button b3,b4;
    void init()
    {

        b3=(Button) findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);

        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         init();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button3 :
            {
                Toast.makeText(this,"BUTTON 3 IS PRESSED ", Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.button4 :
            {
                Toast.makeText(this,"BUTTON 4 IS PRESSED ",Toast.LENGTH_SHORT).show();
                break;
            }

        }
    }






}
