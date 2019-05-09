package com.example.android.persistence.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android.persistence.db.entity.ProductEntity;

/**
 * Date 2019/5/9.
 * Description: todo
 *
 * @author YangKang
 */
public class ShareViewModel extends ViewModel {
    private final MutableLiveData<ProductEntity> mMutableProductData = new MutableLiveData<>();

    public void setData(ProductEntity entity) {
        mMutableProductData.setValue(entity);
    }

    public MutableLiveData<ProductEntity> getData() {
        return mMutableProductData;
    }
}
