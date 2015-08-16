package uk.co.geoffmilward.crazyeights;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/*
 * First attempt at a view
 */
public class CrazyEightsView extends View {

    private Paint redPaint;
    private int circleX;
    private int circleY;
    private float radius;



    public CrazyEightsView(Context context) {
        super(context);
        redPaint = new Paint();
        redPaint.setAntiAlias(true);
        redPaint.setColor(Color.RED);
        circleX=200;
        circleY=300;
        radius= 50;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(circleX, circleY, radius,
                redPaint);

    }
}
