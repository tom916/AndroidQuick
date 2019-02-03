package la.xiong.androidquick.demo.function.ui.bartop;

import android.os.Bundle;

import butterknife.BindView;
import la.xiong.androidquick.demo.R;
import la.xiong.androidquick.demo.base.BaseFragment;
import la.xiong.androidquick.ui.view.CommonToolBar;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class CommonToolBarFragment extends BaseFragment {
    @BindView(R.id.common_tool_bar)
    CommonToolBar mCommonToolBar;

    @Override
    protected void initViewsAndEvents(Bundle savedInstanceState) {
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_commontoolbar;
    }
}
