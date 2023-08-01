package com.techja.cunghoangdao.view.act;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.techja.cunghoangdao.App;
import com.techja.cunghoangdao.Storage;

public abstract class BaseAct<T extends ViewBinding> extends AppCompatActivity implements View.OnClickListener {
    protected T binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = initViewBinding();
        setContentView(binding.getRoot());
        initView();
    }

    protected Storage getStorage() {
        return App.getInstance().getStorage();
    }

    protected abstract void initView();

    protected abstract T initViewBinding();

    @Override
    public void onClick(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        clickView(v);

    }

    private void clickView(View v) {
        //do nothing
    }

    protected final void notify(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    protected final void notify(int smg) {
        Toast.makeText(this, smg, Toast.LENGTH_SHORT).show();
    }
}
