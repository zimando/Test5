package com.example.administrator.test5;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * 这是我们自己设计的PreferenceFragment对象，当中继承了PreferencesFragment
 * 接着调用addPreferencesFromResource方法绑定我们自己设计的设置布局文件
 * Created by Administrator on 2017/3/28 0028.
 */
public class FragmentPreferences extends PreferenceFragment {
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

}