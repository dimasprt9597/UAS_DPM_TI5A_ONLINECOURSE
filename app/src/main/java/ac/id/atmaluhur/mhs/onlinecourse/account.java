package ac.id.atmaluhur.mhs.onlinecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class account extends AppCompatActivity {
    ImageView ImageBack2;
    TextView TextLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        ImageBack2 = findViewById(R.id.ImageBack2);
        TextLogout = findViewById(R.id.TextLogout);

        ImageBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(account.this, dashboard.class);
                startActivity(i);
            }
        });

        TextLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(account.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}