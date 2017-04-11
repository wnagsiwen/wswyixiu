package com.zykj.wswyixiu.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zykj.wswyixiu.R;

import static com.zykj.wswyixiu.R.attr.titleTextColor;

/**
 * Created by zykj on 2017/4/11.
 */

public class MyTopBar extends RelativeLayout {
    //定义属性
    //标题
    private String titleText;
    private Context context;
    private  int    leftTextColor;
    //左侧按钮

    private String leftText;
    private float leftTextSize;
    private Drawable leftBackground;
    private String rightText;
    private float rightTextSize;
    private Drawable rightBackground;
    private TextView title;
    private TextView left;
    private TextView right;
    private  float  titleTextSize;
    private int titleTextColor;
    // 初始化信息
    public MyTopBar(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
        TypedArray td = context.obtainStyledAttributes(attrs, R.styleable.MyTopBar);
        titleText = td.getString(R.styleable.MyTopBar_titleText);
        leftText = td.getString(R.styleable.MyTopBar_leftText);
        titleTextSize=td.getDimension(R.styleable.MyTopBar_titleTextSize,0);
        leftBackground = td.getDrawable(R.styleable.MyTopBar_leftBackground);
        rightText = td.getString(R.styleable.MyTopBar_leftText);
        rightBackground = td.getDrawable(R.styleable.MyTopBar_leftBackground);
        //创建控件
        title = new TextView(context);
        left = new TextView(context);
        right=new TextView(context);
        //把所有属性设置到对应控件上
        //传入所有Title的属性
        title.setText(titleText);
        title.setTextSize(titleTextSize);
        titleTextColor=td.getColor(R.styleable.MyTopBar_titleTextColor,0);
        title.setGravity(Gravity.CENTER); //文字内容居中
        //传入所有TextView的属性
        left.setText(leftText);
        left.setTextSize(leftTextSize);
        left.setBackgroundDrawable(leftBackground);
        right.setText(rightText);
        title.setTextColor(titleTextColor);
        right.setBackgroundDrawable(rightBackground);
        //把控件设置到View中

        //控制title 的位置
        LayoutParams  titleParams =new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        titleParams.addRule(RelativeLayout.CENTER_IN_PARENT); //中间位置
        addView(title,titleParams);
        LayoutParams  leftParams =new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        leftParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT); //左侧位置
        leftParams.addRule(RelativeLayout.CENTER_VERTICAL); //左侧位置
        addView(left,leftParams);
        LayoutParams  rightParams =new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rightParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT); //左侧位置
        rightParams.addRule(RelativeLayout.CENTER_VERTICAL); //左侧位置
        addView(right,leftParams);





    }

    //初始化所有父类的构造函数
    public MyTopBar(Context context) {
        super(context);
    }

    public MyTopBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
