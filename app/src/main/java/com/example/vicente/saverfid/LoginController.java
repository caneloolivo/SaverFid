package com.example.vicente.saverfid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Vicente on 20/06/2016.
 */
public class LoginController extends Activity implements View.OnClickListener{
    EditText user;
    EditText pwd;
    Button acept;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activiy_login);
        //init var
        user=(EditText)findViewById(R.id.user);
        pwd=(EditText)findViewById(R.id.pdw);
        acept=(Button)findViewById(R.id.aceptLogin);
        cancel=(Button)findViewById(R.id.cancelLogin);
        //put on clickListener
        acept.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.aceptLogin:
                validateLogin();
                break;
            case R.id.cancelLogin:
                finish();
                break;
        }
    }

    private void validateLogin(){
        if(user.getText().toString().equals("") || pwd.getText().toString().equals("")){
            Toast.makeText(this, "Favor de llenar todos los campos",Toast.LENGTH_LONG).show();
        }
        else{
            Intent intent = new Intent(LoginController.this, MainMenu.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }
}
