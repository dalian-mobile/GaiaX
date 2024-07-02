package com.alibaba.gaiax.render.view.basic

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.annotation.Keep
import com.alibaba.gaiax.GXRegisterCenter
import com.alibaba.gaiax.context.GXTemplateContext
import com.alibaba.gaiax.utils.Log

@Keep
open class GXItemContainer : LinearLayout {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr
    )
}
