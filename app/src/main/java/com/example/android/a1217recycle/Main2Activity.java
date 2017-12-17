package com.example.android.a1217recycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.a1217recycle.Model.ProfileModel;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.userInfoTxt)
    TextView textView;
    ProfileModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        if (intent.hasExtra("MODEL_EXTRA")){
            model = (ProfileModel) intent.getSerializableExtra("MODEL_EXTRA");
            Picasso.with(this).load(model.getPreviewURL()).centerCrop().fit().into(imageView);
            textView.setText(model.getUser() + "\n" + model.getLikes() + "\n" + model.getDownloads() + "\n" + model.getComments());

        }

    }
}
