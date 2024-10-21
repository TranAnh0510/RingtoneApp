package trim;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * A custom view for selecting time intervals within a video.
 * @author AnhTTH
 */
public class SelectTimeVideoView extends View {
    private final String TAG = "SelectTimeVideoView";
    private OnTrimVideoListener onTrimVideoListener;

    private float selectedWidth;

    private int durationSelected, timeStart, timeEnd, duration;

    private RectF rectPath;
    private Path pathRectLeft, pathRectRight, pathArrowLeft, pathArrowRight, pathProcess;

    private RectF rectBlack, rectSelected, rectSelectedMax;
    private float left, right;

    private float distanceTimeSelected;

    private static final int TIME_MIN_DEFAULT = 1000;
    private static final int TIME_MAX_DEFAULT = 999999;

    private final int minDurationSelected = TIME_MIN_DEFAULT;
    private final int maxDurationSelected = TIME_MAX_DEFAULT;
    private float minDistanceTimeSelected;
    private float maxDistanceTimeSelected;

    private Paint paint, paintArrow, paintStroke;
    private float[] cornersLeft, cornersRight;
    private final int colorBlack = Color.parseColor("#8045B4BD");
    private int colorPathSelected = Color.RED;

    private ControlSelected controlSelected = ControlSelected.NONE;
    private ValueAnimator valueAnimator;
    private ValueAnimator timeAnimator;
    private float dx, temp, temp1;
    private boolean drawProcess = false;
    private float process = 0;
    private boolean isChangeSelectedTime = false;

    /**
     * Constructor for creating a SelectTimeVideoView.
     * @param context The context in which the SelectTimeVideoView will be used.
     * @author AnhTTH
     */
    public SelectTimeVideoView(Context context) {
        super(context);
        init();
    }

    /**
     * Constructor for creating a SelectTimeVideoView.
     * @param context The context in which the SelectTimeVideoView will be used.
     * @param attrs   The attribute set defining the SelectTimeVideoView's attributes.
     * @author AnhTTH
     */
    public SelectTimeVideoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    /**
     * Constructor for creating a SelectTimeVideoView.
     * @param context      The context in which the SelectTimeVideoView will be used.
     * @param attrs        The attribute set defining the SelectTimeVideoView's attributes.
     * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource.
     * @author AnhTTH
     */
    public SelectTimeVideoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /**
     * Converts density-independent pixels (dp) to pixels (px).
     * @param dp The value in dp to be converted.
     * @return The converted value in pixels (px).
     * @author AnhTTH
     */
    public static float dpToPx(float dp) {
        return (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    /**
     * Initializes the SelectTimeVideoView.
     * @author AnhTTH
     */
    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paintArrow = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintArrow.setStyle(Paint.Style.STROKE);
        paintArrow.setColor(Color.WHITE);
        paintArrow.setStrokeWidth(3);
        paintArrow.setStrokeJoin(Paint.Join.ROUND);
        paintArrow.setStrokeCap(Paint.Cap.ROUND);

        rectBlack = new RectF();
        rectSelectedMax = new RectF();
        rectPath = new RectF();
        pathRectLeft = new Path();
        pathRectRight = new Path();
        rectSelected = new RectF();

        pathArrowLeft = new Path();
        pathArrowRight = new Path();
        pathProcess = new Path();


        paintStroke = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintStroke.setColor(Color.parseColor("#45B4BD"));
        paintStroke.setStyle(Paint.Style.STROKE);
        paintStroke.setStrokeWidth(dpToPx(4));
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
     * Sets the color for the selected path.
     * @param color The color to be set.
     * @author AnhTTH
     */
    public void setSelectColor(int color) {
        colorPathSelected = color;
    }

    /**
     * Sets the width of the selected area.
     * @param selectedWidth The width of the selected area.
     * @author AnhTTH
     */
    public void setSelectedWidth(float selectedWidth) {
        this.selectedWidth = selectedWidth;
        cornersLeft = new float[]{dpToPx(10), dpToPx(10), 0, 0, 0, 0, dpToPx(10), dpToPx(10)};
        cornersRight = new float[]{0, 0, dpToPx(10), dpToPx(10), dpToPx(10), dpToPx(10), 0, 0,};
    }

    /**
     * Sets the duration, starting time, and maximum time for trimming.
     * @param durationSelected The selected duration for trimming.
     * @param timeStart        The starting time for trimming.
     * @param duration         The total duration of the video.
     * @param maxTime          The maximum duration allowed for trimming.
     * @author AnhTTH
     */
    public void setTime(int durationSelected, int timeStart, int duration, int maxTime) {
        //this.maxDurationSelected = maxTime;
        this.durationSelected = durationSelected;
        this.timeStart = timeStart;
        this.duration = duration;
        post(() -> {
            if (!isAttachedToWindow()) {
                return;
            }
            distanceTimeSelected = durationSelected * rectBlack.width() / duration;
            minDistanceTimeSelected = minDurationSelected * rectBlack.width() / duration;

            int dMax = Math.min(maxDurationSelected, duration);
            maxDistanceTimeSelected = dMax * rectBlack.width() / duration;

            left = rectPath.right + (timeStart * rectBlack.width() / duration);
            right = distanceTimeSelected + selectedWidth;
            invalidate();

            if (onTrimVideoListener != null) {
                this.timeStart = timeStart;
                this.timeEnd = durationSelected;
                onTrimVideoListener.onReady();
                onTrimVideoListener.onTimeSelected(timeStart, timeEnd);
//                startDrawProcess();
            }
        });

    }

    private boolean isDragLeftAndRight = false;

    /**
     * Handles touch events for selecting time intervals.
     * @param event The motion event.
     * @return True if the event is handled, false otherwise.
     * @author AnhTTH
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                isChangeSelectedTime = false;
                dx = event.getX();
                controlSelected = getControlSelected();
                if (controlSelected == ControlSelected.MOVE) {
                    touchMove((int) dx);
                }
                break;
            case MotionEvent.ACTION_MOVE:
                float d;
                switch (controlSelected) {
                    default:
                    case NONE:
                        break;
                    case LEFT:
                        isDragLeftAndRight = false;
                        isChangeSelectedTime = true;
                        d = event.getX() - dx;
                        left = temp + d;
                        if (right - minDistanceTimeSelected < left) {
                            left = right - minDistanceTimeSelected;
                        } else if (right - maxDistanceTimeSelected > left) {
                            isDragLeftAndRight = true;
                            if (left <= selectedWidth) {
                                left = selectedWidth;
                                right = left + maxDistanceTimeSelected;
                            } else {
                                right = left + maxDistanceTimeSelected;
                                process = left;
                            }
                        }

                        if (left < selectedWidth) {
                            left = selectedWidth;
                        }
                        if (onTrimVideoListener != null) {
                            onTrimVideoListener.onTimeStartChanged(getStartSelected());
                            if (isDragLeftAndRight) {
                                onTrimVideoListener.onTimeEndChanged(getEndSelected());
                            }
                        }
                        if (timeAnimator != null) {
                            timeAnimator.pause();
                        }
                        break;
                    case RIGHT:
                        isDragLeftAndRight = false;
                        isChangeSelectedTime = true;
                        d = event.getX() - dx;
                        right = temp + d;
                        if (right < left + minDistanceTimeSelected) {
                            right = left + minDistanceTimeSelected;
                        } else if (right - left > maxDistanceTimeSelected) {
                            isDragLeftAndRight = true;
                            if (right >= getWidth() - selectedWidth) {
                                right = getWidth() - selectedWidth;
                                left = right - maxDistanceTimeSelected;
                            } else {
                                left = right - maxDistanceTimeSelected;
                                process = left;
                            }
                        }

                        if (right > getWidth() - selectedWidth) {
                            right = getWidth() - selectedWidth;
                        }

                        if (onTrimVideoListener != null) {
                            onTrimVideoListener.onTimeEndChanged(getEndSelected());
                            if (isDragLeftAndRight) {
                                onTrimVideoListener.onTimeStartChanged(getStartSelected());
                            }
                        }
                        if (timeAnimator != null) {
                            timeAnimator.pause();
                        }
                        break;
                    case MOVE:
                        touchMove((int) event.getX());
                        break;
                }
                break;
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                if (onTrimVideoListener != null && isChangeSelectedTime) {
                    onTrimVideoListener.onTimeSelected(getStartSelected(), getEndSelected());
                    Log.e(TAG, "onTouchEvent getStartSelected: " + getStartSelected() + " getEndSelected " + getEndSelected());
                }
//                startDrawProcess();
                break;
        }
        invalidate();
        return true;
    }

    /**
     * Handles the movement of the selection.
     * @param x The x-coordinate of the touch event.
     * @author AnhTTH
     */
    private void touchMove(int x) {
        float xFinal = x;
        if (xFinal < left) {
            xFinal = left;
        } else if (xFinal > right) {
            xFinal = right;
        }
        process = xFinal;
        drawProcess = true;

        if (onTrimVideoListener != null) {
            timeStart = getSelectedTime(process);
            onTrimVideoListener.onMoveTime(timeStart);
        }
    }

    /**
     * Starts the drawing process for animating the selection.
     * @param reStart True to restart the animation, false otherwise.
     * @author AnhTTH
     */
    public void startDrawProcess(boolean reStart) {
        if (process < selectedWidth) {
            process = left;
        }
        drawProcess = true;
        if (reStart) {
            process = left;
            valueAnimator = ValueAnimator.ofFloat(left, right);
            valueAnimator.setDuration(timeEnd - timeStart);
        } else {
            valueAnimator = ValueAnimator.ofFloat(process, right);
            valueAnimator.setDuration(timeEnd - getSelectedTime(process));
        }
        valueAnimator.setInterpolator(null);
        valueAnimator.addUpdateListener(animation -> {
            process = (float) animation.getAnimatedValue();
            invalidate();
        });
        valueAnimator.start();

        if (reStart) {
            timeAnimator = ValueAnimator.ofInt(timeStart, timeEnd);
            timeAnimator.setDuration(timeEnd - timeStart);
        } else {
            timeAnimator = ValueAnimator.ofInt(getSelectedTime(process), timeEnd);
            timeAnimator.setDuration(timeEnd - getSelectedTime(process));
        }

        timeAnimator.setInterpolator(null);
        timeAnimator.addUpdateListener(animation -> {
            onTrimVideoListener.onTimeRun((int) animation.getAnimatedValue());
            invalidate();
        });
        timeAnimator.start();
    }

    /**
     * Stops the time animation and optionally disables the drawing process.
     * @param disableDrawProcess True to disable drawing process, false otherwise.
     * @author AnhTTH
     */
    public void stopTimeAnimation(boolean disableDrawProcess) {
        if (disableDrawProcess) {
            disableDrawProcess();
        }
        if (timeAnimator != null) {
            timeAnimator.removeAllUpdateListeners();
            timeAnimator.cancel();
        }

        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
    }

    /**
     * Calculates the end time of the selected interval.
     * @return The end time of the selected interval.
     * @author AnhTTH
     */
    private int getEndSelected() {
        float s = (rectSelected.right - selectedWidth) / (rectBlack.width());
        timeEnd = Math.round(s * (float) duration);
        if (timeEnd > duration) {
            timeEnd = duration;
        }
        if (timeEnd < 0) {
            timeEnd = 0;
        }
        return timeEnd;
    }

    /**
     * Calculates the start time of the selected interval.
     * @return The start time of the selected interval.
     * @author AnhTTH
     */
    private int getStartSelected() {
        float s = (rectSelected.left - selectedWidth) / (rectBlack.width());
        timeStart = Math.round(s * duration);
        if (timeStart > duration) {
            timeStart = duration;
        }
        if (timeStart < 0) {
            timeStart = 0;
        }
//        if (timeStart + durationSelected > duration) {
//            timeStart = duration - durationSelected;
//        }
        return timeStart;
    }

    /**
     * Calculates the time based on the given position.
     * @param position The position for which time needs to be calculated.
     * @return The calculated time.
     * @author AnhTTH
     */
    private int getSelectedTime(float position) {
        float s = (position - selectedWidth) / (rectBlack.width());
        int time = Math.round(s * duration);
        if (time > duration) {
            time = duration;
        }
        if (time < 0) {
            time = 0;
        }
        return time;
    }

    /**
     * Determines the control selected based on the touch position.
     * @return The control selected.
     * @author AnhTTH
     */
    private ControlSelected getControlSelected() {
        float startLeft = (left);
        float endLeft = (left - (selectedWidth + selectedWidth * 0.2f));
        float startRight = (right + (selectedWidth + selectedWidth * 0.2f));
        float endRight = (right);
        if (dx <= startLeft && dx >= endLeft) {
            temp = left;
            disableDrawProcess();
            return ControlSelected.LEFT;
        } else if (dx >= endRight && dx <= startRight) {
            temp = right;
            disableDrawProcess();
            return ControlSelected.RIGHT;
        } else if (dx >= (startLeft) && dx <= (endRight)) {

            temp = right;
            temp1 = left;
            return ControlSelected.MOVE;
        }
        return ControlSelected.NONE;
    }

    /**
     * Disables the drawing process.
     * @author AnhTTH
     */
    public void disableDrawProcess() {
        drawProcess = false;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            process = left;
        }

        if (timeAnimator != null) {
            timeAnimator.cancel();
        }
    }

    /**
     * Pauses the animator.
     * @author AnhTTH
     */
    public void pauseAnimator() {
        if (valueAnimator != null) {
            valueAnimator.pause();
        }

        if (timeAnimator != null) {
            timeAnimator.pause();
        }
    }

    /**
     * Resumes the animator.
     * @author AnhTTH
     */
    public void resumeAnimator() {
        drawProcess = true;
        if (valueAnimator != null && timeAnimator != null) {
            valueAnimator.resume();
            timeAnimator.resume();
            startDrawProcess(false);
        } else {
            startDrawProcess(true);
        }
    }

    /**
     * Draws the view on the canvas.
     * @param canvas The canvas to draw on.
     * @author AnhTTH
     */
    @Override
    protected void onDraw(Canvas canvas) {
        int height = getHeight();

        if (drawProcess) {
            paintArrow.setColor(Color.parseColor("#007AFF"));
            canvas.save();
            canvas.translate(process, 0);
            canvas.drawPath(pathProcess, paintArrow);
            canvas.restore();
        }

        canvas.save();
        rectSelected.left = left;
        rectSelected.top = dpToPx(2);
        rectSelected.right = right;
        rectSelected.bottom = height - dpToPx(2);

        canvas.clipRect(rectSelected, Region.Op.DIFFERENCE);

        paint.setColor(colorBlack);
        canvas.drawRect(rectBlack, paint);

        canvas.drawRect(rectSelected, paintStroke);

        paint.setColor(colorPathSelected);
        paintArrow.setColor(Color.WHITE);
        canvas.save();
        canvas.translate(left - selectedWidth, 0);
        canvas.drawPath(pathRectLeft, paint);

        canvas.translate(0, 0);
        canvas.drawPath(pathArrowLeft, paintArrow);
        canvas.restore();

        paint.setColor(colorPathSelected);
        canvas.save();
        canvas.translate(right, 0);
        canvas.drawPath(pathRectRight, paint);

        canvas.translate(0, 0);
        canvas.drawPath(pathArrowRight, paintArrow);
        canvas.restore();

        canvas.restore();
    }

    /**
     * Called when the size and position of the view is changed.
     * @param changed Whether the view has changed or not.
     * @param left    The left position of the view.
     * @param top     The top position of the view.
     * @param right   The right position of the view.
     * @param bottom  The bottom position of the view.
     * @author AnhTTH
     */
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int height = getHeight();
        pathRectLeft.reset();
        pathRectRight.reset();

        rectPath.left = 0;
        rectPath.top = 0;
        rectPath.right = selectedWidth;
        rectPath.bottom = height;


        pathRectLeft.addRoundRect(rectPath, cornersLeft, Path.Direction.CW);
        pathRectRight.addRoundRect(rectPath, cornersRight, Path.Direction.CW);

        rectBlack.left = selectedWidth;
        rectBlack.top = 0;
        rectBlack.right = getWidth() - selectedWidth;
        rectBlack.bottom = height;

        float d = selectedWidth / 3.5f;
        float l = (selectedWidth - d) / 2f;
        pathArrowLeft.reset();
        pathArrowLeft.moveTo(l + d, height / 2f - d);
        pathArrowLeft.lineTo(l, height / 2f);
        pathArrowLeft.lineTo(l + d, height / 2f + d);

        pathArrowRight.reset();
        pathArrowRight.moveTo(l, height / 2f - d);
        pathArrowRight.lineTo(l + d, height / 2f);
        pathArrowRight.lineTo(l, height / 2f + d);

        pathProcess.reset();
        pathProcess.moveTo(0, 0);
        pathProcess.lineTo(0, getHeight());
        pathProcess.close();
    }
}