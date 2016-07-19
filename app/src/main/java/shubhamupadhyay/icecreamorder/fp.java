package shubhamupadhyay.icecreamorder;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static shubhamupadhyay.icecreamorder.R.id;
import static shubhamupadhyay.icecreamorder.R.layout;

/**
 * Created by SHUBHAM on 06-07-2016.
 */
public class fp extends AppCompatActivity {
    Button ping;
    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.fp);

        ping = (Button) findViewById(id.btn_play);

        ping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }
}
