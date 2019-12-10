package cn.ztuo.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import cn.ztuo.R;
import cn.ztuo.entity.CoinInfo;
import cn.ztuo.entity.TimeLimitBean;

import java.util.List;

/**
 * Created by Administrator on 2018/3/1.
 */

public class DialogTimeLimitAdapter extends BaseQuickAdapter<TimeLimitBean, BaseViewHolder> {
    public DialogTimeLimitAdapter(int layoutResId, @Nullable List<TimeLimitBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TimeLimitBean item) {
        helper.setText(R.id.tvCoinName, item.getTime());
        helper.setVisible(R.id.ivSellect, item.isSelected());
    }
}
