package com.yucong.zhang.baselibrary.router;

import android.support.v4.app.Fragment;

/**
 * Created by zhang on 2017/6/20.
 */

public class FragmentRouter {
    public static Fragment getFragment(String name) {
        Fragment fragment;
        try {
            Class fragmentClass = Class.forName(name);
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return fragment;
    }
}
