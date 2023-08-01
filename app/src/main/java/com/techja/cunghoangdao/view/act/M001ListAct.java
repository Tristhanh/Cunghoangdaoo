package com.techja.cunghoangdao.view.act;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.techja.cunghoangdao.R;
import com.techja.cunghoangdao.databinding.M0001ActListBinding;

public class M001ListAct extends BaseAct<M0001ActListBinding> {
    @Override
    protected void initView() {
        binding.ivBoCap.setOnClickListener(this);
        binding.ivThienBinh.setOnClickListener(this);
        binding.ivSongNgu.setOnClickListener(this);
        binding.ivMaKet.setOnClickListener(this);
        binding.ivBaoBinh.setOnClickListener(this);
        binding.ivCuGiai.setOnClickListener(this);
        binding.ivXuNu.setOnClickListener(this);
        binding.ivNhanMa.setOnClickListener(this);
        binding.ivSuTu.setOnClickListener(this);
        binding.ivKimNguu.setOnClickListener(this);
        binding.ivSongNgu.setOnClickListener(this);
        binding.ivBachDuong.setOnClickListener(this);
        binding.btDetail.setOnClickListener(this);
        //first time
        onClick(binding.ivBoCap);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_detail) {
            gotoDetail();
        } else {
            ImageView img = (ImageView) v;
            String text = (String) img.getTag();
            String title = v.getContentDescription().toString();
            binding.ivDetail.setImageDrawable(img.getDrawable());
            binding.tvTitleDetail.setText(title);
            binding.tvContentDetail.setText(text);

            getStorage().m001Drawable = img.getDrawable();
            getStorage().m001Title = title;
            getStorage().m001text = text;
        }

    }

    private void gotoDetail() {
        Intent intent = new Intent();
        intent.setClass(this, M002DetailAct.class);
        startActivity(intent);
    }

    @Override
    protected M0001ActListBinding initViewBinding() {
        return M0001ActListBinding.inflate(getLayoutInflater());
    }
}