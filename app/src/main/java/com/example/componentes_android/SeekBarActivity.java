package com.example.componentes_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarActivity extends AppCompatActivity {
    SeekBar skbVolume;
    TextView tvVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        skbVolume = (SeekBar)findViewById(R.id.seekBarVolume);
        tvVolume = (TextView) findViewById(R.id.lblVolume);
        skbVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvVolume.setText("Volume: "+i); //onde o i é o valor do volume
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekBar Touch iniciado",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekBar Touch finalizado",Toast.LENGTH_SHORT).show();

            }
        });
    }
}