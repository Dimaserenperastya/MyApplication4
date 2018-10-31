package com.example.dimas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    //PERKENALKAN IMAGE View dan URL GAMBAR
    ImageView imageView;
    public static String urlGambar ="https://mbtskoudsalg.com/explore/cats-png-tumblr/#gal_post_3460_tumblr-cat-png-3.png";
    public static String urlPlaceholder ="https://mbtskoudsalg.com/explore/cats-png-tumblr/#gal_post_3460_cats-png-tumblr-7.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = (ImageView)findViewById(R.id.contoh);

        Glide.with(MainActivity.this)
                .load(urlGambar)
                .placeholder(R.drawable.iki)
                .error(R.drawable.salah)
                .into(imageView);
    }
}
