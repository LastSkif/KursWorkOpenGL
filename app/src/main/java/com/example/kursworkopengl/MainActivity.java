package com.example.kursworkopengl;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GLSurfaceView mGLSurfaceView = new GLSurfaceView(this);
        mGLSurfaceView.setEGLContextClientVersion(2);//устанавливаем версию OPENGL2
        TableRenderer renderer = new TableRenderer(this);//создаем свой рендерер
        mGLSurfaceView.setRenderer(renderer);

        setContentView(mGLSurfaceView);
    }
}