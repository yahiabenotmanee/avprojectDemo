package com.monstertechno.moderndashbord;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements TextWatcher {

    ImageView imageView,imageView1,imageView2;
    LinearLayout linearLayout_edittext;
    Button buttonlogin;
    TextView text_login,text_forget,signup;

    EditText editTextemail,editTextpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //status bar color
        getWindow().setStatusBarColor(ContextCompat.getColor(LoginActivity.this,R.color.G_blue));

        editTextemail=findViewById(R.id.editTextTextEmailAddress);
        editTextpass=findViewById(R.id.editTextTextPassword);

        imageView = findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView2);
        imageView2= findViewById(R.id.imageView3);
        linearLayout_edittext=findViewById(R.id.linearLayout4);
        buttonlogin=findViewById(R.id.Button_login);
        text_login=findViewById(R.id.text_login);
        text_forget=findViewById(R.id.fpass);

        signup=findViewById(R.id.textViewRegester);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });


       //   run_anim(imageView);
       //run_anim(imageView1);
      // run_anim(imageView2);
        run_anim(linearLayout_edittext);
        run_anim(buttonlogin);
        run_anim(text_login);
        run_anim(text_forget);
        run_anim(signup);

        editTextemail.addTextChangedListener(this);
        editTextpass.addTextChangedListener(this);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    void run_anim(View view){
        view.animate().alpha(1).setDuration(1600).translationY(0);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        // avtivation of button
        if (!editTextemail.getText().toString().isEmpty() && !editTextpass.getText().toString().isEmpty()){
            buttonlogin.setEnabled(true);
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }

}