package com.example.nario.draglayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by nario on 2017/9/18.
 */

public class Option_menu extends LinearLayout{
    private View baseView;
    private LinearLayout imageGroup;
    private LinearLayout cameraGroup;
    private LinearLayout phraseGroup;
    private HeadIconSelectorView.OnHeadIconClickListener onHeadIconClickListener;
    public static final int FROM_CAMERA = 1;
    public static final int FROM_GALLERY = 2;
    public static final int FROM_PHRASE = 3;

    public Option_menu(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        findView();
        init();
    }

    private void findView(){
        baseView = LayoutInflater.from(getContext()).inflate(R.layout.option_view, this);
        imageGroup = (LinearLayout) baseView.findViewById(R.id.image_bottom_group);
        cameraGroup = (LinearLayout) baseView.findViewById(R.id.camera_group);
        phraseGroup = (LinearLayout) baseView.findViewById(R.id.phrase_group);
    }
    private void init(){
        cameraGroup.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
        imageGroup.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (null != onHeadIconClickListener) {
                    onHeadIconClickListener.onClick(FROM_GALLERY);
                }
            }
        });
        phraseGroup.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
    }
    public void setOnHeadIconClickListener(
            HeadIconSelectorView.OnHeadIconClickListener onHeadIconClickListener) {
        // TODO Auto-generated method stub
        this.onHeadIconClickListener = onHeadIconClickListener;
    }

}
