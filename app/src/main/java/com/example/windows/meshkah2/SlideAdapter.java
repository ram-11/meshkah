package com.example.windows.meshkah2;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.windows.meshkah2.R;


public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public int[] lst_image={
            R.drawable.seven,
            R.drawable.six,
            R.drawable.five,
            R.drawable.four,
            R.drawable.the,
            R.drawable.sec,
            R.drawable.twilv,
            R.drawable.eliven,
            R.drawable.ten,
            R.drawable.nine,
            R.drawable.eight,
            R.drawable.fi,
    };

    public SlideAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return lst_image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.slides,container,false);
        LinearLayout layoutslide=view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide=(ImageView)view.findViewById(R.id.slide1);
        imgslide.setImageResource(lst_image[position]);
        container.addView(view);
        return view;
    }
}
