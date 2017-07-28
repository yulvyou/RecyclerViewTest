package com.example.recyclerviewtest.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerviewtest.R;
import com.example.recyclerviewtest.bean.FruitBean;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2017/7/27 0027.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    
    private List<FruitBean> mFruitBeanList ;
    
    
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fruitImage;
        TextView  fruitName;
        
        public ViewHolder(View itemView) {
            super(itemView);
            fruitImage = (ImageView) itemView.findViewById(R.id.fruit_image);
            fruitName = (TextView) itemView.findViewById(R.id.fruit_name);
        }
        
    }//ViewHolder
    
    public FruitAdapter(List<FruitBean> fruitBeanList) {
        mFruitBeanList = fruitBeanList;
    }
    
    //将ViewHolder与对应的布局建立连接
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,
                parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        
        viewHolder.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获得当前位置
                int position = viewHolder.getAdapterPosition();
                Toast.makeText(v.getContext(), "点击了"+mFruitBeanList.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        
        return viewHolder;
    }
    
    //给item中的元素赋值
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FruitBean fruitBean = mFruitBeanList.get(position);
        holder.fruitName.setText(fruitBean.getName());
        holder.fruitImage.setImageResource(fruitBean.getImageId());
    }
    
    @Override
    public int getItemCount() {
        return mFruitBeanList.size();
    }
    
}//End
