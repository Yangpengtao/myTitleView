package com.example.titleview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TitleView extends RelativeLayout     {

	private TextView title;
	private ImageButton leftImageButton;
	private LayoutParams titleLp;
	private LayoutParams leftBtnLp;

	public TitleView(Context context) {
		super(context);
		init(context);

	}

	public TitleView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public TitleView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		super.onLayout(changed, l, t, r, b);
	}

	private void init(Context ctx) {
		
		setBackgroundColor(0xe3e3e3e3);
		title = new TextView(ctx);

		title.setText("½ñÌìÄãºÃ");
		titleLp = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		titleLp.addRule(RelativeLayout.CENTER_IN_PARENT);
		addView(title, titleLp);

		leftImageButton = new ImageButton(ctx);
		leftImageButton.setBackgroundResource(R.drawable.ic_launcher);
		leftBtnLp = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		leftBtnLp.addRule(RelativeLayout.ALIGN_PARENT_LEFT
				| RelativeLayout.CENTER_VERTICAL);
		leftBtnLp.leftMargin = 10;
		addView(leftImageButton, leftBtnLp);
		leftImageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				((Activity)getContext()).finish();
			}
		});
	}

	public void setleftBtnMarginLeft(int margin) {
		leftBtnLp.leftMargin = margin;
	}

	@SuppressLint("NewApi")
	public void setleftBtnImg(int resource) {
		leftImageButton.setBackgroundResource(resource);
	}

	public void setTitle(String title) {
		this.title.setText(title);
	}

	public void setTitleSize(float s) {
		this.title.setTextSize(s);
	}

	public void setTitleColor(int s) {
		this.title.setTextColor(s);
	}

}
