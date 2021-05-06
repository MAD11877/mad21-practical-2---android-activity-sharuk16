package sg.edu.pratical02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);
        button.setTag(1);
        button.setText("Follow");

        button.setOnClickListener(new View.OnClickListener(){public void onClick(View v) {
            final int status = (Integer) v.getTag();
            if (status == 1) {
                button.setText("Unfollow");
                v.setTag(0);
            }
            else {
                button.setText("Follow");
                v.setTag(1);
            }

        }
            });
    }
}