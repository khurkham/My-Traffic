package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;
    private static final String urlYouTube = "https://youtu.be/AFmWqLIqDZA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // This's statement
        setContentView(R.layout.activity_main);

        //Bind Widget คือการผูกความสัมพันธ์ ตัวแปร และ Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //Get Event from Click Button
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();

                //Intent to WebView
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlYouTube));
                startActivity(intent);


            }   // onClick
        });


    }   // Main Method

}   // Main Class นี่คือ คลาสหลัก เว้ยเห้ย
