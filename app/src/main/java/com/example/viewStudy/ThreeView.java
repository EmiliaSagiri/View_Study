package com.example.viewStudy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ThreeView extends View {
    public ThreeView(Context context) {
        super(context);
    }

    public ThreeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private Paint FirstPaint(int color){
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(6);
        return  paint;
    }
     List<Integer> data = new ArrayList<Integer>(){{add(0);add(0);add(0);add(0);add(0);add(0);add(0);add(0);add(0);add(0);}};
     int bottom =1000;
     int left =90;
     int size = 70;
     int width = 80;
     int top =500;
     String [] color_Paint = new String[]{"#990033","#FF0033","#FF0099","#FF6600","#FFCC00",
        "#00CC33","#33FF99","#00CCCC","#CCCC99"};
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        initView(canvas,data);

    }

    private void initView(Canvas canvas,List<Integer> data){
        RectF rectF = new RectF(left,top+data.get(0),left+size,bottom);//长方形
        canvas.drawRect(rectF, FirstPaint(Color.parseColor(color_Paint[0])));

        RectF rectF2 = new RectF(left+width,top+data.get(1),left+width+size,bottom);//长方形2
        canvas.drawRect(rectF2, FirstPaint(Color.parseColor(color_Paint[1])));

        RectF rectF3 = new RectF(left+2*width,top+data.get(2),left+2*width+size,bottom);//长方形3
        canvas.drawRect(rectF3, FirstPaint(Color.parseColor(color_Paint[2])));

        RectF rectF4 = new RectF(left+3*width,top+data.get(3),left+3*width+size,bottom);//长方形4
        canvas.drawRect(rectF4, FirstPaint(Color.parseColor(color_Paint[3])));

        RectF rectF5 = new RectF(left+4*width,top+data.get(4),left+4*width+size,bottom);//长方形
        canvas.drawRect(rectF5, FirstPaint(Color.parseColor(color_Paint[4])));

                RectF rectF6 = new RectF(left+5*width,top+data.get(5),left+5*width+size,bottom);//长方形2
        canvas.drawRect(rectF6, FirstPaint(Color.parseColor(color_Paint[5])));

        RectF rectF7 = new RectF(left+6*width,top+data.get(6),left+6*width+size,bottom);//长方形3
        canvas.drawRect(rectF7, FirstPaint(Color.parseColor(color_Paint[6])));

        RectF rectF8 = new RectF(left+7*width,top+data.get(7),left+7*width+size,bottom);//长方形4
        canvas.drawRect(rectF8, FirstPaint(Color.parseColor(color_Paint[7])));

        RectF rectF9 = new RectF(left+8*width,top+data.get(8),left+8*width+size,bottom);//长方形4
        canvas.drawRect(rectF9, FirstPaint(Color.parseColor(color_Paint[8])));


    }

    public boolean onTouchEvent(MotionEvent event) {

        return false;
    }

}
