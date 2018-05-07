package com.example.hyeon.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyDrawEx extends View {
    public MyDrawEx(Context c) {
        super(c);
    }
    public MyDrawEx(Context c, AttributeSet a) {
        super(c, a);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap sm = BitmapFactory.decodeResource(getResource(), R.drawable.image);

        Paint pnt = new Paint();
        canvas.drawColor(Color.WHITE);

        Bitmap bitm2 = Bitmap.createBitmap(sm, 0, 0, sm.getWidth()-100, sm.getHeight()-100);
        canvas.drawBitmap(bitm2, 0, 0, pnt);
        //canvas.drawBitmap(sm, new Rect(100, 0, 500, 500), new Rect(0,  0, 400, 500), pnt);
    }
}