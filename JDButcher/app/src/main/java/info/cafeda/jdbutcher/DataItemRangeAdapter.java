package info.cafeda.jdbutcher;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.DrawableWrapper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Vu Nguyen on 7/10/2017.
 */

public class DataItemRangeAdapter extends ArrayAdapter {
    List<String> mData;
    LayoutInflater mInflater;

    public DataItemRangeAdapter(@NonNull Context context, @NonNull List<String> data) {
        super(context, R.layout.list_range, data);
        mData = data;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_range, parent,false);
        }
        TextView tView = convertView.findViewById(R.id.textRangeView);
        ImageView imageView = convertView.findViewById(R.id.imageRangeView);
        RelativeLayout mLayout = convertView.findViewById(R.id.singleRangeLayout);
        String str = mData.get(position);

        if (position % 2 == 1){
            mLayout.setBackgroundColor(Color.parseColor("#ffffff"));
        }else
        {
            mLayout.setBackgroundColor(Color.parseColor("#fff9c4"));
        }
        tView.setText(str);
        InputStream inputStream = null;
        try {
            inputStream = getContext().getAssets().open(str.toLowerCase()+".png");
            Drawable d = Drawable.createFromStream(inputStream,null);
            imageView.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream!=null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return convertView;
    }
}
