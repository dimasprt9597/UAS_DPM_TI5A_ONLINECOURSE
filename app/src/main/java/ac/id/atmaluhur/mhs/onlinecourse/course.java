package ac.id.atmaluhur.mhs.onlinecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class course extends AppCompatActivity {
    ImageView BackArrow;
    ImageView ImageHome;
    ImageView ImageProfile;
    ImageView ImageNotif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        BackArrow = findViewById(R.id.BackArrow);
        ImageHome = findViewById(R.id.ImageHome);
        ImageProfile = findViewById(R.id.ImageProfile);
        ImageNotif = findViewById(R.id.ImageNotif);

        BackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this, dashboard.class);
                startActivity(i);
            }
        });

        ImageHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this, dashboard.class);
                startActivity(i);
            }
        });

        ImageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this, account.class);
                startActivity(i);
            }
        });

        ImageNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this, notification.class);
                startActivity(i);
            }
        });
    }
}