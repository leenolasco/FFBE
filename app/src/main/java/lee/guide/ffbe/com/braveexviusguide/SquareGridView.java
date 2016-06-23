package lee.guide.ffbe.com.braveexviusguide;

/**
 * Created by trainer9 on 6/22/2016.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by trainer9 on 1/15/2016.
 */
public class SquareGridView extends ImageView {
    public SquareGridView(Context context) {
        super(context);
    }

    public SquareGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }


}