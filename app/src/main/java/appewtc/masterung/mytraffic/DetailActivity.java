package appewtc.masterung.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView imageView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        titleTextView = (TextView) findViewById(R.id.textView6);
        detailTextView = (TextView) findViewById(R.id.textView7);
        imageView = (ImageView) findViewById(R.id.imageView2);
        button = (Button) findViewById(R.id.button2);

        //Receive From Intent
        String strTitle = getIntent().getStringExtra("Title");
        int intImage = getIntent().getIntExtra("Icon", R.drawable.traffic_01);
        String strDetail = getIntent().getStringExtra("Detail");

        //Show View
        titleTextView.setText(strTitle);
        imageView.setImageResource(intImage);
        detailTextView.setText(strDetail);

        //onClick at Button Back
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }   // Main Method

}   // Main Class
