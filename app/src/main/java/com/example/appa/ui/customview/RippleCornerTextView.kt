package com.example.appa.ui.customview

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Shader
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.example.appa.R

class RippleCornerTextView : AppCompatTextView {
    /**
     * draw background and gradient for TextView
     * @author AnhTTH
     */
    private var paint: Paint? = null

    /**
     * draw border for TextView
     * @author AnhTTH
     */
    private var strokePaint: Paint? = null

    /**
     * The thickness of the border applied to the TextView
     * @author AnhTTH
     */
    var strokeWidth: Float = 0f
        set(value) {
            field = value
            invalidate()
        }

    /**
     * The border color is applied to the TextView
     * @author AnhTTH
     */
    var strokeColor: String = "#00000000"
        set(value) {
            field = value
            invalidate()
        }

    /**
     * Radius of the TextView's rounded corners
     * @author AnhTTH
     */
    private var cornerRadius = 0f

    /**
     * The LinearGradient object is used to create a gradient for the TextView
     * @author AnhTTH
     */
    private var gradient: LinearGradient? = null

    /**
     * The color of the starting and ending gradient is applied to the TextView
     * @author AnhTTH
     */
    var startGradientColor: String? = null
        set(value) {
            field = value
            invalidate()
        }

    var endGradientColor: String? = null
        /**
         * Set the values for the properties
         * @author AnhTTH
         */
        set(value) {
            field = value
            invalidate()
        }

    /**
     * TextView background color
     * @author AnhTTH
     */
    var backgroundColorView: String? = null
        /**
         *Set the values for the properties
         * @author AnhTTH
         */
        set(value) {
            field = value
            invalidate()
        }

    /**
     * The path is used to draw the shape of the TextView
     * @author AnhTTH
     */
    val path = Path()

    /**
     * Place the drawable in the left position of the TextView
     * @author AnhTTH
     */
    fun setDrawableLeft(image: Int) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(image, 0, 0, 0)
        invalidate()
    }

    /**
     * Place the drawable in the right position of the TextView.
     * @author AnhTTH
     */
    fun setDrawableRight(image: Int) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, image, 0)
        invalidate()
    }

    /**
     * Place the drawable at the top of the TextView
     * @author AnhTTH
     */
    fun setDrawableTop(image: Int) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(0, image, 0, 0)
        invalidate()
    }

    /**
     * Place the drawable at the bottom position of the TextView.
     * @author AnhTTH
     */
    fun setDrawableBottom(image: Int) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, image)
        invalidate()
    }

    /**
     * Place the drawable in every position of the TextView (left, top, right, bottom).
     * @author AnhTTH
     */
    fun setDrawableTv(left: Int, top: Int, right: Int, bottom: Int) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(left, top, right, bottom)
        invalidate()
    }


    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(attrs)
    }

    /**
     * initialize the TextView's properties from the properties declared in the attrs.xml file
     * Use TypedArray to retrieve attribute values defined in attrs.xml
     * @author AnhTTH
     */
    private fun init(attrs: AttributeSet? = null) {
        paint = Paint()
        strokePaint = Paint()
        attrs?.let {
            val typedArray: TypedArray =
                context.obtainStyledAttributes(
                    it,
                    R.styleable.RippleCornerTextView
                )
            cornerRadius =
                typedArray.getDimension(
                    R.styleable.RippleCornerTextView_cornerRadius,
                    0f
                )
            startGradientColor =
                typedArray.getString(R.styleable.RippleCornerTextView_startGradientColor)
            endGradientColor =
                typedArray.getString(R.styleable.RippleCornerTextView_endGradientColor)
            backgroundColorView =
                typedArray.getString(R.styleable.RippleCornerTextView_backgroundColorView)

            strokeWidth =
                typedArray.getFloat(R.styleable.RippleCornerTextView_strokeWidthT, strokeWidth)
            strokeColor =
                typedArray.getString(R.styleable.RippleCornerTextView_strokeColorT) ?: strokeColor
            typedArray.recycle()
        }
    }


    override fun onDraw(canvas: Canvas) {
        /**
         * applies to the TextView's background
         * @author AnhTTH
         */
        if (gradient == null) {
            startGradientColor?.let { start ->
                endGradientColor?.let { end ->
                    gradient = LinearGradient(
                        0f,
                        0f,
                        width.toFloat(),
                        0f,
                        intArrayOf(Color.parseColor(start), Color.parseColor(end)),
                        null,
                        Shader.TileMode.CLAMP
                    )

                }
            }
        }
        path.reset()
        /**
         * Draw a rounded rectangle with rounded corners of cornerRadius size
         * @author AnhTTH
         */

        path.addRoundRect(
            0f,
            0f,
            width.toFloat(),
            height.toFloat(),
            cornerRadius,
            cornerRadius,
            Path.Direction.CW
        )
        /**
         * The TextView's background is drawn with the color specified in backgroundColorView
         * or with a gradient if specified
         * @author AnhTTH
         */
        paint?.let {
            if (gradient != null) {
                gradient?.let { linearGradient ->
                    it.shader = linearGradient
                }
            } else {
                backgroundColorView?.let { color ->
                    try {
                        it.color = Color.parseColor(backgroundColorView)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
            canvas.clipPath(path)
            canvas.drawPaint(it)
        }
        /**
         * Draw the Drawable Image on the right
         * @author AnhTTH
         */

        val drawables = compoundDrawablesRelative
        drawables[2]?.let { drawableRight ->
            val drawableRightX = width - paddingRight - drawableRight.intrinsicWidth
            val drawableRightY = (height - drawableRight.intrinsicHeight) / 2
            drawableRight.setBounds(
                drawableRightX,
                drawableRightY,
                drawableRightX + drawableRight.intrinsicWidth,
                drawableRightY + drawableRight.intrinsicHeight
            )
            canvas.let { drawableRight.draw(it) }
        }
        /**
         * Draw text with stroke
         * @author AnhTTH
          */


        strokePaint?.let {
            it.color = Color.parseColor(strokeColor)
            it.style = Paint.Style.STROKE
            it.strokeWidth = strokeWidth
            canvas?.drawPath(path, it)
        }
        super.onDraw(canvas)
    }
}