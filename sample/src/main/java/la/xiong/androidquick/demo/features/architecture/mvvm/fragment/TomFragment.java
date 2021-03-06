package la.xiong.androidquick.demo.features.architecture.mvvm.fragment;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import la.xiong.androidquick.demo.R;
import la.xiong.androidquick.demo.base.mvvm.BaseMVVMFragment;
import la.xiong.androidquick.demo.bean.NameBean;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TomFragment extends BaseMVVMFragment<TomViewModel> {

    @BindView(R.id.tv_fragment_mvvm)
    TextView tvMVVM;

    @Override
    protected TomViewModel getViewModel() {
        return ViewModelProviders.of(getActivity()).get(TomViewModel.class);
    }

    @Override
    protected void initViewsAndEvents(Bundle savedInstanceState) {
        viewModel.getData().observe(this, new Observer<List<NameBean>>() {
            @Override
            public void onChanged(@Nullable List<NameBean> s) {
                tvMVVM.setText(s.toString());
            }
        });
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_architecture_mvvm;
    }

    @OnClick(R.id.btn_fragment_mvvm)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_fragment_mvvm:
                viewModel.loadData();
                break;
        }
    }
}
