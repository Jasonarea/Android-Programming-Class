package com.example.hyeon.customview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by hyeon on 2018-05-07.
 */

public class MyDrawEx extends View {
    /*public MyDrawEx(Context c) {
        super(c);
    }
    public MyDrawEx(Context c, AttributeSet a) {
        super(c, a);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap sm = BitmapFactory.decodeResource(getResources(), R.drawable.image);

        Paint pnt = new Paint();
        canvas.drawColor(Color.WHITE);

        Bitmap bitm2 = Bitmap.createBitmap(sm, 0, 0, sm.getWidth()-100, sm.getHeight()-100);
        canvas.drawBitmap(bitm2, 0, 0, pnt);
        //canvas.drawBitmap(sm, new Rect(100, 0, 500, 500), new Rect(0,  0, 400, 500), pnt);
    }*/
    private Paint mPaint;

    private Bitmap mAndroidGreen;
    private Bitmap mAndroidRed;
    private int nAngle = 0;

    public void init() {
        mPaint = new Paint();

        Resources res = getResources();
        mAndroidGreen= BitmapFactory.decodeResource(res, R.drawable.android_green);
        mAndroidRed = BitmapFactory.decodeResource(res, R.drawable.android_red);
    }

    public MyDrawEx(Context c) {
        super(c);
        init();
    }

    public MyDrawEx(Context c, AttributeSet a) {
        super(c, a);
        init();
    }

    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(mAndroidGreen, 0, 0, mPaint);
        canvas.save();

        canvas.rotate(nAngle);
        canvas.drawBitmap(mAndroidRed, 0, 0, mPaint);
    }
}
