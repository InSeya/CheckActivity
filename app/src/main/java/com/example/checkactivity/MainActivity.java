package com.example.checkactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup studentname;
    RadioButton aaisha,saniya,fayyaz,faraz,Qazi;
    Button showbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentname=(RadioGroup) findViewById(R.id.radiogroupstudent);
        aaisha=(RadioButton) findViewById(R.id.aaisha);
        saniya=(RadioButton) findViewById(R.id.saniya);
        fayyaz=(RadioButton) findViewById(R.id.fayyaz);
        Qazi=(RadioButton) findViewById(R.id.Qazi);
        faraz=(RadioButton) findViewById(R.id.faraz);
        showbtn=(Button) findViewById(R.id.showbtn);

        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=studentname.getCheckedRadioButtonId();
                String str="";
                if(id==R.id.aaisha)
                {
                    str="AAISHA";
                }
                else if(id==R.id.saniya) {
                    str="SANIYA";
                }
                else if(id==R.id.faraz) {
                    str="FARAZ";
                }
                else if(id==R.id.fayyaz) {
                    str="FAYYAZ";
                }
                else
                {
                    str="QAZI";
                }
                Toast.makeText(MainActivity.this,
                        str+" is selected", Toast.LENGTH_LONG).show();
            }
        });


    }
}