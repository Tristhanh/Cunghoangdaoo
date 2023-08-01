package com.techja.cunghoangdao.view.act;

import android.content.Intent;
import android.os.Handler;

import com.techja.cunghoangdao.databinding.M000ActSplashBinding;

public class M000SpashAct extends BaseAct<M000ActSplashBinding> {
    private static final long TIME_DELAY = 2000;

    @Override
    protected void initView() {
        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, M001ListAct.class));
        }, TIME_DELAY);
    }

    @Override
    protected M000ActSplashBinding initViewBinding() {
        return M000ActSplashBinding.inflate(getLayoutInflater());
    }
}
