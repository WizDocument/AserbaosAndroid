// Generated code from Butter Knife. Do not modify!
package com.aserbao.aserbaosandroid.functions.jumpSystemSetting.baseAdapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.aserbao.aserbaosandroid.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class JumpAdapter$JumpBaseAdapter_ViewBinding<T extends JumpAdapter.JumpBaseAdapter> implements Unbinder {
  protected T target;

  @UiThread
  public JumpAdapter$JumpBaseAdapter_ViewBinding(T target, View source) {
    this.target = target;

    target.mBaseItemTv = Utils.findRequiredViewAsType(source, R.id.base_item_tv, "field 'mBaseItemTv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mBaseItemTv = null;

    this.target = null;
  }
}
