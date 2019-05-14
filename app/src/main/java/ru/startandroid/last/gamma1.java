package ru.startandroid.last;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class gamma1 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamma1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        chore = (Button) findViewById(R.id.accord);
        chat = (Button) findViewById(R.id.chat);
        interval = (Button) findViewById(R.id.interval);
        klav = (Button) findViewById(R.id.klav);
        chore.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".chord");
                        startActivity(intent);

                    }
                }
        );

        interval.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".interval");
                        startActivity(intent);

                    }
                }
        );
        klav.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".klav");
                        startActivity(intent);

                    }
                }
        );
        chat.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".mychat");
                        startActivity(intent);

                    }
                }
        );

        RadioButton сdur = (RadioButton)findViewById(R.id.cdur);
        сdur.setOnClickListener(radioButtonClickListener);

        RadioButton soldur = (RadioButton)findViewById(R.id.soldur);
        soldur.setOnClickListener(radioButtonClickListener);

        RadioButton redur = (RadioButton)findViewById(R.id.redur);
        redur.setOnClickListener(radioButtonClickListener);

        RadioButton ladur = (RadioButton)findViewById(R.id.ladur);
        ladur.setOnClickListener(radioButtonClickListener);

        RadioButton midur = (RadioButton)findViewById(R.id.midur);
        midur.setOnClickListener(radioButtonClickListener);

        RadioButton sidur = (RadioButton)findViewById(R.id.sidur);
        sidur.setOnClickListener(radioButtonClickListener);

        RadioButton faddur = (RadioButton)findViewById(R.id.faddur);
        faddur.setOnClickListener(radioButtonClickListener);

        RadioButton doddur = (RadioButton)findViewById(R.id.doddur);
        doddur.setOnClickListener(radioButtonClickListener);

        RadioButton fadur = (RadioButton)findViewById(R.id.fadur);
        fadur.setOnClickListener(radioButtonClickListener);

        RadioButton sibdur = (RadioButton)findViewById(R.id.sibdur);
        sibdur.setOnClickListener(radioButtonClickListener);


        RadioButton amin = (RadioButton)findViewById(R.id.amin);
        amin.setOnClickListener(radioButtonClickListener2);

        txt = findViewById(R.id.textView5);
        txt2 = findViewById(R.id.textView6);
    }
    private Button interval;
    private Button klav;
    private Button chore;
    private Button chat;
    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioGroup radioGroup = findViewById(R.id.radio);

            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

            RadioButton myRadioButton = (RadioButton) findViewById(checkedRadioButtonId);

            String strText;
            strText = myRadioButton.getText().toString();


            if(strText.equals("До мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.cdurx);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Соль мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.soldur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ре мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.redur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ля мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.ladur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ми мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.midur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Cи мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.sidur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Фа-диез мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.faddur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("До-диез мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.doddur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Фа мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.fadur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Си-бемоль мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.sibdur);
                img.setBounds(0, 0, 1000, 200);
                txt.setCompoundDrawables(img, null, null, null);

            }

        }
    };
    View.OnClickListener radioButtonClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RadioGroup radioGroup2 = findViewById(R.id.radio2);

            int checkedRadioButtonId2 = radioGroup2.getCheckedRadioButtonId();

            RadioButton myRadioButton2 = (RadioButton) findViewById(checkedRadioButtonId2);

            String strText2;
            strText2 = myRadioButton2.getText().toString();

            if(strText2.equals("Ля минор")) {
                Drawable img = getResources().getDrawable(R.drawable.aminx);
                img.setBounds(0, 0, 1000, 200);
                txt2.setCompoundDrawables(img, null, null, null);

            }
        }
    };
    TextView txt;
    TextView txt2;
}
