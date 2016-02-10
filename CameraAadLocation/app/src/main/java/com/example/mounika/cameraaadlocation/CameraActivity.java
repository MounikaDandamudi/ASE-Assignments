package com.example.mounika.cameraaadlocation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {
    Button btnTakePhoto;
    ImageView imgTakePhoto;
    private static final int CAM_REQUEST=1313;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btnTakePhoto = (Button)findViewById(R.id.button1);
        imgTakePhoto = (ImageView) findViewById(R.id.imageview1);

        btnTakePhoto.setOnClickListener(new btnTakePhotoClicker());


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
}