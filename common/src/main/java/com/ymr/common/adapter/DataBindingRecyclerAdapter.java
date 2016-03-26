package com.ymr.common.adapter;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.view.View;

/**
 * Created by ymr on 16/3/26.
 */
public abstract class DataBindingRecyclerAdapter<Data> extends HolderRecyclerAdapter<Data, ViewDataBinding> {

    private final DatabindingHolderDelegate<Data> databindingHolderDelegate = new DatabindingHolderDelegate<>(getContext());

    public DataBindingRecyclerAdapter(Context context) {
        super(context);
    }

    @Override
    protected View createRealView(ViewDataBinding viewDataBinding) {
        return databindingHolderDelegate.createRealView(viewDataBinding);
    }

    @Override
    protected ViewDataBinding createView(IViewHolder<Data, ViewDataBinding> viewHolder) {
        return databindingHolderDelegate.createView(viewHolder);
    }
}
