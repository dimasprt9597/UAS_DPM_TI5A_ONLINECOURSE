package ac.id.atmaluhur.mhs.onlinecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {
    ImageView ImageHome;
    ImageView ImageCourse;
    ImageView ImageProfile;
    ImageView ImageNotif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageHome = findViewById(R.id.ImageHome);
        ImageCourse = findViewById(R.id.ImageCourse);
        ImageProfile = findViewById(R.id.ImageProfile);
        ImageNotif = findViewById(R.id.ImageNotif);


        ImageHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this, dashboard.class);
                startActivity(i);
            }
        });

        ImageCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this, course.class);
                startActivity(i);
            }
        });

        ImageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this, account.class);
                startActivity(i);
            }
        });

        ImageNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this, notification.class);
                startActivity(i);
            }
        });
    }
}