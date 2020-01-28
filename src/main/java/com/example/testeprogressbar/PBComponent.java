package com.example.testeprogressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PBComponent extends ConstraintLayout {

    TextView tv;
    ProgressBar pb;

    public PBComponent(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(context, R.layout.pb_component, this);

        tv = findViewById(R.id.textView);
        pb = findViewById(R.id.progressBar);
    }

    public void setProgress(Integer currentStep, Integer max, Boolean animate) {
        this.pb.setMax(max);
        this.pb.setProgress(currentStep);
        this.tv.setText("Passo " + currentStep + "\n de " + max);
    }

    public void incrementar() {
        this.pb.incrementProgressBy(1);
    }

    public void decrementar() {
        this.pb.setProgress(0);
    }
}
