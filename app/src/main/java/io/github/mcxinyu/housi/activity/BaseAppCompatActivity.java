package io.github.mcxinyu.housi.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import com.pgyersdk.crash.PgyCrashManager;

/**
 * Created by huangyuefeng on 2017/9/13.
 * Contact me : mcxinyu@gmail.com
 */
public class BaseAppCompatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PgyCrashManager.register(this);
    }

    @Override
    protected void onDestroy() {
        PgyCrashManager.unregister();
        super.onDestroy();
    }
}
