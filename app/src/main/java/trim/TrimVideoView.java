package trim;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.appa.R;

/**
 * Custom view for trimming a video.
 * @author AnhTTH
 */
public class TrimVideoView extends FrameLayout {

    private ImageView imageView;
    private SelectTimeVideoView selectTimeVideoView;
    private int duration;
    private float selectedWidth;
    private OnTrimVideoListener onTrimVideoListener;

    /**
     * Constructor for creating a TrimVideoView.
     * @param context The context in which the TrimVideoView will be used.
     * @author AnhTTH
     */
    public TrimVideoView(@NonNull Context context) {
        super(context);
        init(null);
    }

    /**
     * Constructor for creating a TrimVideoView.
     * @param context The context in which the TrimVideoView will be used.
     * @param attrs   The attribute set defining the TrimVideoView's attributes.
     * @author AnhTTH
     */
    public TrimVideoView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    /**
     * Constructor for creating a TrimVideoView.
     * @param context      The context in which the TrimVideoView will be used.
     * @param attrs        The attribute set defining the TrimVideoView's attributes.
     * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource.
     * @author AnhTTH
     */
    public TrimVideoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    /**
     * Initializes the TrimVideoView.
     * @param attrs The attribute set defining the TrimVideoView's attributes.
     * @author AnhTTH
     */
    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.TrimVideoView);
        selectedWidth = typedArray.getDimension(R.styleable.TrimVideoView_selectWidth, SelectTimeVideoView.dpToPx(20));
        int selectColor = typedArray.getColor(R.styleable.TrimVideoView_selectColor, Color.parseColor("#45B4BD"));
        typedArray.recycle();

        imageView = new ImageView(getContext());
        imageView.setId(generateViewId());
        LayoutParams paramImBackground = new LayoutParams((int) (getWidth() - selectedWidth * 2), ViewGroup.LayoutParams.MATCH_PARENT);
        paramImBackground.gravity = Gravity.CENTER;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(R.drawable.icon_trim_audio);
        float[] radii = new float[]{20, 20, 20, 20, 0, 0, 0, 0}; // 20 là bán kính của bo góc, có thể thay đổi theo mong muốn

        // Tạo hình chữ nhật với bo tròn
        RoundRectShape roundRectShape = new RoundRectShape(radii, null, null);

        // Tạo ShapeDrawable từ hình chữ nhật bo tròn
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);

        // Tạo Bitmap để vẽ hình chữ nhật bo tròn
        BitmapShader bitmapShader = new BitmapShader(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = shapeDrawable.getPaint();
        paint.setShader(bitmapShader);

        // Vẽ hình chữ nhật bo tròn lên Bitmap
        Canvas canvas = new Canvas();
        canvas.drawRect(new RectF(0, 0, 1, 1), paint);

        // Đặt hình chữ nhật bo tròn làm nền cho ImageView
        imageView.setBackground(shapeDrawable);
        addView(imageView, paramImBackground);


        imageView.setVisibility(INVISIBLE);


        selectTimeVideoView = new SelectTimeVideoView(getContext());
        selectTimeVideoView.setOnTrimVideoListener(new OnTrimVideoListener() {
            @Override
            public void onReady() {
                if (onTrimVideoListener != null) {
                    onTrimVideoListener.onReady();
                }
                imageView.setVisibility(VISIBLE);
                selectTimeVideoView.setVisibility(VISIBLE);
            }

            @Override
            public void onTimeStartChanged(int timeStart) {
                if (onTrimVideoListener != null) {
                    onTrimVideoListener.onTimeStartChanged(timeStart);
                }
            }

            @Override
            public void onTimeEndChanged(int timeEnd) {
                if (onTrimVideoListener != null) {
                    onTrimVideoListener.onTimeEndChanged(timeEnd);
                }
            }

            @Override
            public void onTimeSelected(int timeStart, int timeEnd) {
                try {
                    if (onTrimVideoListener != null) {
                        onTrimVideoListener.onTimeSelected(timeStart, timeEnd);
                    } else {
                        setOnTrimVideoListener(this);
                        onTrimVideoListener.onTimeSelected(timeStart, timeEnd);
                    }
                } catch (Exception e) {

                }
            }

            @Override
            public void onTimeRun(int time) {
                if (onTrimVideoListener != null) {
                    onTrimVideoListener.onTimeRun(time);
                }
            }

            @Override
            public void onMoveTime(int time) {
                if (onTrimVideoListener != null) {
                    onTrimVideoListener.onMoveTime(time);
                }
            }
        });
        selectTimeVideoView.setSelectColor(selectColor);
        selectTimeVideoView.setSelectedWidth(selectedWidth);
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        addView(selectTimeVideoView, params);
        selectTimeVideoView.setVisibility(INVISIBLE);


        post(() -> {
            if (!isAttachedToWindow()) {
                return;
            }
            imageView.setBackground(shapeDrawable);
            LayoutParams paramsRecyclerView1 = (LayoutParams) imageView.getLayoutParams();
            paramsRecyclerView1.width = (int) (getWidth() - selectedWidth * 2);
            paramsRecyclerView1.gravity = Gravity.CENTER;
            imageView.setLayoutParams(paramsRecyclerView1);
        });
    }

    /**
     * Sets the listener for video trimming events.
     * @param onTrimVideoListener The listener to be set.
     * @author AnhTTH
     */
    public void setOnTrimVideoListener(OnTrimVideoListener onTrimVideoListener) {
        this.onTrimVideoListener = onTrimVideoListener;
    }

    /**
     * Sets the duration and initial start time for trimming.
     * @param durationSelected The selected duration for the trimmed video.
     * @param timeStart        The starting time for trimming.
     * @param maxTime          The maximum duration allowed for trimming.
     * @author AnhTTH
     */
    public void setDuration(int durationSelected, int timeStart, int maxTime) {
        duration = maxTime;
        selectTimeVideoView.setTime(durationSelected, timeStart, duration, maxTime);
    }

    /**
     * Disables the drawing process.
     * @author AnhTTH
     */
    public void disableDrawProcess() {
        selectTimeVideoView.disableDrawProcess();
    }

    /**
     * Pauses the drawing process.
     * @author AnhTTH
     */
    public void pauseDrawProcess() {
        selectTimeVideoView.pauseAnimator();
    }

    /**
     * Resumes the drawing process.
     * @author AnhTTH
     */
    public void resumeDrawProcess() {
        selectTimeVideoView.resumeAnimator();
    }

    /**
     * Starts the drawing process.
     * @author AnhTTH
     */
    public void startDrawProcess() {
        disableDrawProcess();
        selectTimeVideoView.startDrawProcess(true);
    }

    /**
     * Starts the drawing process for moving.
     * @author AnhTTH
     */
    public void startDrawProcessMove() {
        disableDrawProcess();
        selectTimeVideoView.startDrawProcess(false);
    }

    /**
     * Called when the view is detached from the window.
     * This method is overridden to perform cleanup tasks when the view is removed from the window.
     * @author AnhTTH
     */
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
//        handlerTimeStart.removeCallbacksAndMessages(null);
//        handlerTimeEnd.removeCallbacksAndMessages(null);
    }
}
