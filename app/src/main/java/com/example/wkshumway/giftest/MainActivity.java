package com.example.wkshumway.giftest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fresco.initialize(this);

        setContentView(R.layout.activity_main);

        loadGif();

    }

    protected void loadGif() {

        Uri uri = Uri.parse("file:///Users/wkshumway/StudioProjects/Hello_World/GifTest/app/src/main/res/drawable/whileloop.gif");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);

        draweeView.setImageURI(uri);
    }
}
