package com.techja.cunghoangdao.view.act;

import android.view.View;

import com.techja.cunghoangdao.App;
import com.techja.cunghoangdao.databinding.M002ActDetailBinding;

public class M002DetailAct extends BaseAct<com.techja.cunghoangdao.databinding.M002ActDetailBinding> {
    @Override
    protected void initView() {
        App app = (App) getApplicationContext();
        String title = getStorage().m001Title.replace("(", "\n(");
        binding.ivPhoto.setImageDrawable(getStorage().m001Drawable);
        binding.tvTitle.setText(title);
        binding.tvDetail.setText(getStorage().m001text);

        binding.tvBack.setOnClickListener(v -> finish());
    }

    @Override
    protected M002ActDetailBinding initViewBinding() {
        return M002ActDetailBinding.inflate(getLayoutInflater());
    }
}
