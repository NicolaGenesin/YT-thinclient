package com.z1911.thinyoutube;

import android.graphics.Bitmap;

import com.squareup.picasso.Transformation;

/**
 * Created by nicola on 27/07/2015.
 */
public class ImageBlurTransformation implements Transformation {
    @Override public Bitmap transform(Bitmap source) {
        Bitmap result = BitmapUtil.fastblur(source,24);
        if (result != source) {
            source.recycle();
        }
        return result;
    }

    @Override public String key() { return "square()"; }
}
