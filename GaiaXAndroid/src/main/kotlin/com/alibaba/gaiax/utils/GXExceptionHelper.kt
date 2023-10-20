package com.alibaba.gaiax.utils

import com.alibaba.gaiax.GXRegisterCenter

object GXExceptionHelper {

    fun isException(): Boolean {
        return GXRegisterCenter.instance.extensionException != null
    }

    fun exception(msg: java.lang.Exception) {
        GXRegisterCenter.instance.extensionException?.exception(msg)
        if (Log.isLog()) {
            Log.e("GXExceptionHelper.exception ${msg.message}")
        }
    }
}