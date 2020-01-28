package com.example.testeprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    PBComponent pbComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbComponent = findViewById(R.id.PBComponent);
        pbComponent.setProgress(2, 3, Boolean.TRUE);
    }

    public void incrementar(View view) {
        this.pbComponent.incrementar();
    }

    public void decrementar(View view) {
        this.pbComponent.decrementar();
    }
}
