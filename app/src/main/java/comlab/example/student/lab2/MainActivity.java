package comlab.example.student.lab2;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv;
        tv = findViewById(R.id.text_1);

        CountDownTimer timer = new CountDownTimer(10000,1000) {
            int time = 0;
            @Override
            public void onTick(long millisUntilFinished) {

                tv.setText(String.valueOf(time++));
            }

            @Override
            public void onFinish() {

                tv.setText("Modaya...........");
            }
        }.start();

    }
}
