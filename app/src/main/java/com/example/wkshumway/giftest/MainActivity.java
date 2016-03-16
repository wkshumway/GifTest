package com.example.wkshumway.giftest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fresco.initialize(this);

        final SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.myGif);
        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(200, 200);


        draweeView.setLayoutParams(params);

        Uri uri = Uri.parse("file:///Users/wkshumway/Downloads/whileLoop.gif");

        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri).setAutoPlayAnimations(true).build();

        draweeView.setController(controller);



    }
}
