package com.example.test.andlang.util.imageload;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by root on 18-3-9.
 */

public final class ImageLoadUtils {
    private static IInnerImageSetter sImageSetter;
    public static void setImageSetter(@NonNull IInnerImageSetter imageSetter) {
        sImageSetter = imageSetter;
    }

    /**
     * load image using {@link IInnerImageSetter}
     * @param view the imageView instance
     * @param url image url
     * @param <IMAGE> ImageView class type
     */
    public static <IMAGE extends ImageView> void doLoadImageUrl(@NonNull IMAGE view, @Nullable String url) {
       if(sImageSetter==null){

           return;
       }
        sImageSetter.doLoadImageUrl(view, url);
    }

}
