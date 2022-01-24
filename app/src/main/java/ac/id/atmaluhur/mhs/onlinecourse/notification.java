package ac.id.atmaluhur.mhs.onlinecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class notification extends AppCompatActivity {
    ImageView ImageBack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        ImageBack3 = findViewById(R.id.ImageBack3);

        ImageBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(notification.this, dashboard.class);
                startActivity(i);
            }
        });
    }
}