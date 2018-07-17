package com.example.abstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("abstest");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringBuilder sb = new StringBuilder();
        sb.append("absTestDouble(-1.23) = ");
        sb.append(absTestDouble(-1.23));
        sb.append("\nabsTestFloat(-4.56f) = ");
        sb.append(absTestFloat(-4.56f));
        sb.append("\nabsTestInt(-789) = ");
        sb.append(absTestInt(-789));

        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(sb.toString());
    }

    public native double absTestDouble(double val);
    public native float absTestFloat(float val);
    public native int absTestInt(int val);
}
