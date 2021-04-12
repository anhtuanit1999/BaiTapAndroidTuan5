package com.example.baitaptuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private CustomProductAdapter adt;
    private ArrayList<Product> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lvProduct);
        arrayList = new ArrayList<>();
        arrayList.add(new Product("Ca nấu lẩu, nấu mì mini...", "Shop Devang", R.drawable.ca_nau_lau));
        arrayList.add(new Product("1KG KHÔ GÀ BƠ TỎI ...", "Shop LTD Food", R.drawable.ga_bo_toi));
        arrayList.add(new Product("Xe cần cẩu đa năng", "Shop Thế giới đồ chơi", R.drawable.xa_can_cau));
        arrayList.add(new Product("Đồ chơi mô hình", "Shop Thế giới đồ chơi", R.drawable.do_choi_dang_mo_hinh));
        arrayList.add(new Product("Lãnh đạo đơn giản", "Shop Minh Long Book", R.drawable.lanh_dao_gian_don));
        arrayList.add(new Product("Hiểu lòng trẻ con", "Shop Minh Long Book", R.drawable.hieu_long_con_tre));
        arrayList.add(new Product("Donal Trump Thiên tài lãnh đạo", "Shop Minh Long Book", R.drawable.trump));

        adt = new CustomProductAdapter(this, R.layout.item_listview, arrayList);
        listView.setAdapter(adt);
    }
}