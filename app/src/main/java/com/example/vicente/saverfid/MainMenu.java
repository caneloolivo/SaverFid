package com.example.vicente.saverfid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by Vicente on 20/06/2016.
 */
public class MainMenu extends Activity implements View.OnClickListener {
    Button room1;
    Button room2;
    Button room3;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menu);
        room1=(Button)findViewById(R.id.room1);
        room1.setBackgroundColor(Color.TRANSPARENT);
        room2=(Button)findViewById(R.id.room2);
        room2.setBackgroundColor(Color.TRANSPARENT);
        room3=(Button)findViewById(R.id.room3);
        room3.setBackgroundColor(Color.TRANSPARENT);
        room1.setOnClickListener(this);
        room2.setOnClickListener(this);
        room3.setOnClickListener(this);
        intent=new Intent(MainMenu.this,DetailRoom.class);

    }

    @Override
    public void onStart() {
        super.onStart();
        intent=new Intent(MainMenu.this,DetailRoom.class);
    }

    @Override
    public void onStop() {
        super.onStop();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.room1:
                intent.putExtra("room","Hay 25 personas\nLuz al 100%");
                startActivity(intent);
                break;
            case R.id.room2:
                intent.putExtra("room","Hay 35 personas\nLuz al 60%");
                startActivity(intent);
                break;
            case R.id.room3:
                intent.putExtra("room","Hay 45 personas\nLuz al 87%");
                startActivity(intent);
                break;
        }
    }

}
