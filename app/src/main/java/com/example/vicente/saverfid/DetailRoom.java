package com.example.vicente.saverfid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Vicente on 20/06/2016.
 */
public class DetailRoom extends Activity {
    TextView detailRoom;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_detail_room);
        intent=getIntent();
        detailRoom=(TextView) findViewById(R.id.detailRoom);
        String room=intent.getStringExtra("room");
        detailRoom.setText(room);

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
