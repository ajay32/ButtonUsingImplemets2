package com.hackingbuzz.buttonusingimplemets2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    Button button1;
    Button button2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {   // just one onClick method...

        switch(v.getId()){

            case R.id.button1:
                textView.setText("Button 1 is Clicked");
                break;
            case R.id.button2:
                textView.setText("Button 2 is Clicked");
        }

    }
}

// another way of using Interface.....
/*  you can directly define the view where you want to add interface (Button in this case)

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{


    @Override
    public void onClick(View v) {

    }
}
*/


