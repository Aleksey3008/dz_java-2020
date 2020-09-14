package android.example.popey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isPopeyeVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void erasePopaye(View view) {
        if (isPopeyeVisible) {
            ImageView popayeImageView=findViewById(R.id.popayeImageView);
            popayeImageView.animate().alpha(0).scaleY(0f). scaleX(0f) . rotation(popayeImageView.getRotation() +720).setDuration(3000);

            ImageView popayeeImageView=findViewById(R.id.popayeeImageView);
            popayeeImageView.animate().alpha(1).scaleY(1f). scaleX(1f) . rotation(popayeeImageView.getRotation() +720).setDuration(3000);
            isPopeyeVisible = false;
        }else {
            ImageView popayeImageView=findViewById(R.id.popayeImageView);
            popayeImageView.animate().alpha(0).scaleY(0f). scaleX(0f) . rotation(popayeImageView.getRotation() +720).setDuration(3000);

            ImageView popayeeImageView=findViewById(R.id.popayeeImageView);
            popayeeImageView.animate().alpha(1).scaleY(1f). scaleX(1f) . rotation(popayeeImageView.getRotation() +720).setDuration(3000);

            isPopeyeVisible = true;
        }



    }
}
