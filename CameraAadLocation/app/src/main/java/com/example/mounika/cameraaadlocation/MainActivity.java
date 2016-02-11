package com.example.mounika.cameraaadlocation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.maps.GoogleMap;


public class MainActivity extends AppCompatActivity{
    Button btnTakePhoto;
    Button btnMaps;
    ImageView imgTakePhoto;
    private GoogleMap mMap;
    private static final int CAM_REQUEST=1313;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_main);

        btnTakePhoto = (Button)findViewById(R.id.btn_pic);
        imgTakePhoto = (ImageView) findViewById(R.id.imageView2);

        btnTakePhoto.setOnClickListener(new btnTakePhotoClicker());

        btnMaps=(Button)findViewById(R.id.btn_map);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent("com.google.android.gms.maps.SupportMapFragment");

                Intent i = new Intent(getApplicationContext(),MapsActivity.class);

                startActivity(i);
                // setContentView(R.layout.activity_map1);
                //  map1 a = new map1();
//a.setUpMapIfNeeded();

            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CAM_REQUEST){
            Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
            imgTakePhoto.setImageBitmap(thumbnail);
        }

    }

    class btnTakePhotoClicker implements Button.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent cameraintent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraintent, CAM_REQUEST);
        }
    }

    public void signup(View v)
    {

        //This code redirects the from login page to the home page.
        Intent redirect = new Intent(MainActivity.this, SignMapsActivity.class);
        startActivity(redirect);

    }



}


