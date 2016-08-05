package com.exitedcode.supermvp.android.databinding;

import com.exitedcode.supermvp.android.BaseAndroidPresenter;

/**
 * Created by ymr on 16/3/26.
 */
public abstract class DatabindingPresenter<V extends IDatabindingView> extends BaseAndroidPresenter<V> {
    public DatabindingPresenter(V view) {
        super(view);
    }

    public abstract void finishCreateView();
}
