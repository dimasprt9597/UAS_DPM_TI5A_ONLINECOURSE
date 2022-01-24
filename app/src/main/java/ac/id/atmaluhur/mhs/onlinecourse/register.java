package ac.id.atmaluhur.mhs.onlinecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class register extends AppCompatActivity {
    ImageView ImageBack4;
    Button ButtonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ImageBack4 = findViewById(R.id.ImageBack4);
        ButtonSignup = findViewById(R.id.ButtonSignup);

        ImageBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(register.this, MainActivity.class);
                startActivity(i);
            }
        });

        ButtonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(register.this, dashboard.class);
                startActivity(i);
            }
        });
    }
}