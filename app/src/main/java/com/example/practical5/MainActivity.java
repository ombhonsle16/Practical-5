package com.example.practical5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2,b3,b4;
    TextView t4;
    Integer i1,i2,i3;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        t4=(TextView)findViewById(R.id.t4);
    }
    public void ADD(View view) {
        i1=Integer.parseInt(e1.getText().toString());
        i2=Integer.parseInt(e2.getText().toString());
        i3=i1 + i2;
        s=String.valueOf(i3);
        t4.setText(s);
    }
    public void SUB(View view) {
        i1=Integer.parseInt(e1.getText().toString());
        i2=Integer.parseInt(e2.getText().toString());
        i3=i1 - i2;
        s=String.valueOf(i3);
        t4.setText(s);
    }
    public void MUL(View view) {
        i1=Integer.parseInt(e1.getText().toString());
        i2=Integer.parseInt(e2.getText().toString());
        i3=i1 * i2;
        s=String.valueOf(i3);
        t4.setText(s);
    }
    public void DIV(View view) {
        i1=Integer.parseInt(e1.getText().toString());
        i2=Integer.parseInt(e2.getText().toString());
        i3=i1 / i2;
        s=String.valueOf(i3);
        t4.setText(s);
    }
}