package me.xujichang.luggagedelivery.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import me.xujichang.luggagedelivery.R;

public class SearchEditText extends LinearLayout {
    private EditText etSearch;
    private ImageView ivSearch;

    public SearchEditText(Context context) {
        this(context, null);
    }

    public SearchEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SearchEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs, defStyleAttr);
    }

    private void initView(Context pContext, AttributeSet pAttrs, int pDefStyleAttr) {
        View vView = LayoutInflater.from(pContext).inflate(R.layout.view_search_view, this, false);
        etSearch = (EditText) vView.findViewById(R.id.et_search);
        ivSearch = (ImageView) vView.findViewById(R.id.iv_search);
        ivSearch.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mSearchListener) {
                    String key = etSearch.getText().toString();
                    mSearchListener.onSearch(key);
                }
            }
        });
        addView(vView);
    }

    public void setInputType(int type) {
        etSearch.setInputType(type);
    }

    public interface OnSearchListener {
        void onSearch(String key);
    }

    private OnSearchListener mSearchListener;

    public void setOnSearchListener(OnSearchListener pSearchListener) {
        mSearchListener = pSearchListener;
    }
}
