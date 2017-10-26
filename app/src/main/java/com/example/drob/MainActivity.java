package com.example.drob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText Num1 ;
    public EditText Denum1;
    public EditText Num2 ;
    public EditText Denum2 ;
    public TextView resultNum;
    public TextView resultDeNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Num1 = (EditText) findViewById(R.id.num1);
        Denum1 = (EditText) findViewById(R.id.denum1);
        Num2 = (EditText) findViewById(R.id.num2);
        Denum2 = (EditText) findViewById(R.id.denum2);
        resultNum = (TextView)findViewById(R.id.numResult);
        resultDeNum = (TextView)findViewById(R.id.denumResult);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ButtonPl=(Button)findViewById(R.id.plusButton);
        ButtonPl.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        Drob dr1 = new Drob(1,1);
                        Drob dr2 = new Drob(1,1);
                        try{
                            dr1 = new Drob(Integer.parseInt(Num1.getText().toString()),Integer.parseInt(Denum1.getText().toString()));
                        }
                        catch (Throwable throwable){

                        }
                        try{
                            dr2 = new Drob(Integer.parseInt(Num2.getText().toString()),Integer.parseInt(Denum2.getText().toString()));
                        }
                        catch (Throwable throwable){

                        }
                        Drob resDrob = dr1.plus(dr2);
                        resultDeNum.setText(String.valueOf(resDrob.denum));
                        resultNum.setText(String.valueOf(resDrob.num));

                    }
                }
        );
        Button ButtonMi=(Button)findViewById(R.id.minusButton);
        ButtonMi.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Drob dr1 = new Drob(1,1);
                        Drob dr2 = new Drob(1,1);
                        try{
                            dr1 = new Drob(Integer.parseInt(Num1.getText().toString()),Integer.parseInt(Denum1.getText().toString()));
                        }
                        catch (Throwable throwable){

                        }
                        try{
                            dr2 = new Drob(Integer.parseInt(Num2.getText().toString()),Integer.parseInt(Denum2.getText().toString()));
                        }
                        catch (Throwable throwable){

                        }
                        Drob resDrob = dr1.min(dr2);
                        resultDeNum.setText(String.valueOf(resDrob.denum));
                        resultNum.setText(String.valueOf(resDrob.num));

                    }
                }
        );
        Button ButtonMu=(Button)findViewById(R.id.multButton);
        ButtonMu.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Drob dr1 = new Drob(1,1);
                        Drob dr2 = new Drob(1,1);
                        try{
                            dr1 = new Drob(Integer.parseInt(Num1.getText().toString()),Integer.parseInt(Denum1.getText().toString()));
                        }
                        catch (Throwable throwable){

                        }
                        try{
                            dr2 = new Drob(Integer.parseInt(Num2.getText().toString()),Integer.parseInt(Denum2.getText().toString()));
                        }
                        catch (Throwable throwable){

                        }
                        Drob resDrob = dr1.mult(dr2);
                        resultDeNum.setText(String.valueOf(resDrob.denum));
                        resultNum.setText(String.valueOf(resDrob.num));
                    }
                }
        );
        Button ButtonSub=(Button)findViewById(R.id.subdivButton);
        ButtonSub.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Drob dr1 = new Drob(1,1);
                        Drob dr2 = new Drob(1,1);
                        try{
                            dr1 = new Drob(Integer.parseInt(Num1.getText().toString()),Integer.parseInt(Denum1.getText().toString()));
                        }
                        catch (Throwable throwable){

                        }
                        try{
                            dr2 = new Drob(Integer.parseInt(Num2.getText().toString()),Integer.parseInt(Denum2.getText().toString()));
                        }
                        catch (Throwable throwable){

                        }
                        Drob resDrob = dr1.sep(dr2);
                        resultDeNum.setText(String.valueOf(resDrob.denum));
                        resultNum.setText(String.valueOf(resDrob.num));

                    }
                }
        );
        Button ButtonRep=(Button)findViewById(R.id.repButton);
        ButtonRep.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Num1.setText(" ");
                        Num2.setText(resultNum.getText());
                        Denum1.setText(" ");
                        Denum2.setText(resultDeNum.getText());
                        resultNum.setText(" ");
                        resultDeNum.setText(" ");

                    }
                }
        );
        Button ClrButton=(Button)findViewById(R.id.clrButton);
        ClrButton.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Num1.setText(" ");
                        Num2.setText(" ");
                        Denum1.setText(" ");
                        Denum2.setText(" ");
                        resultNum.setText(" ");
                        resultDeNum.setText(" ");
                    }
                }
        );

    }

}
