package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewtest.adapter.FruitAdapter;
import com.example.recyclerviewtest.bean.FruitBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.R.attr.name;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {
    private List<FruitBean> fruitList = new ArrayList<FruitBean>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        
        //布局管理器
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置布局方向
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //适配器
        FruitAdapter adapter = new FruitAdapter(fruitList);
        
        //设置布局管理器和适配器
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        
    }
    
    
    
    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            FruitBean apple = new FruitBean("Apple", R.drawable.apple_pic);
            fruitList.add(apple);
            FruitBean banana = new FruitBean("Banana", R.drawable.banana_pic);
            fruitList.add(banana);
            FruitBean orange = new FruitBean("Orange", R.drawable.orange_pic);
            fruitList.add(orange);
            FruitBean watermelon = new FruitBean( "Watermelon", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            FruitBean pear = new FruitBean( "Pear", R.drawable.pear_pic);
            fruitList.add(pear);
            FruitBean grape = new FruitBean( "Grape", R.drawable.grape_pic);
            fruitList.add(grape);
            FruitBean pineapple = new FruitBean( "Pineapple", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            FruitBean strawberry = new FruitBean( "Strawberry", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            FruitBean cherry = new FruitBean( "Cherry", R.drawable.cherry_pic);
            fruitList.add(cherry);
            FruitBean mango = new FruitBean( "Mango", R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }
    
    
    
    
}//End
