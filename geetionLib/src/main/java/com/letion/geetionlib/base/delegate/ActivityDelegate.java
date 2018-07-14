package com.letion.geetionlib.base.delegate;

import android.os.Bundle;
import android.os.Parcelable;

/**
 * Created by liu-feng on 2017/6/5.
 */
public interface ActivityDelegate extends Parcelable{

    String LAYOUT_LINEARLAYOUT = "LinearLayout";
    String LAYOUT_FRAMELAYOUT = "FrameLayout";
    String LAYOUT_RELATIVELAYOUT = "RelativeLayout";
    String ACTIVITY_DELEGATE = "FRAGMENT_DELEGATE";

    void onCreate(Bundle savedInstanceState);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onSaveInstanceState(Bundle outState);

    void onDestroy();
}
