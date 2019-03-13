package s.org.rating;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import s.org.mylibrary.RatingDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingDialog ratingDialog = new RatingDialog.Builder(this)
                .threshold(3)
                .form(3)
                .ratingDescriptionColor(R.color.yellow)

                .onRatingBarFormSumbit(new RatingDialog.Builder.RatingDialogFormListener() {
                    @Override
                    public void onFormSubmitted(String feedback) {
                        Log.e("Feedback:" , feedback);
                    }
                })
                .build();

        ratingDialog.show();
    }
}
