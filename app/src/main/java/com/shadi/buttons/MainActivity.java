package com.shadi.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SwitchEvent(View view) {
        Switch swt = (Switch)view;
        String info = "";
        if(swt.isChecked()){
            info="Switch is on";
        }else{
            info="Switch is of";
        }
        printInfo(info);
    }

    private void printInfo(String info) {
        Toast.makeText(this,info,Toast.LENGTH_SHORT).show();
    }

    public void ButtonPrintOK(View view) {

    }
}
