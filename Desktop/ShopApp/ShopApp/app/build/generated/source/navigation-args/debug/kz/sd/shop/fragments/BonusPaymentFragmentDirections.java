package kz.sd.shop.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import kz.sd.shop.R;

public class BonusPaymentFragmentDirections {
  private BonusPaymentFragmentDirections() {
  }

  @NonNull
  public static ActionBonusPaymentFragmentToPaymentFragment actionBonusPaymentFragmentToPaymentFragment(
      float total) {
    return new ActionBonusPaymentFragmentToPaymentFragment(total);
  }

  @NonNull
  public static NavDirections actionBonusPaymentFragmentToHome() {
    return new ActionOnlyNavDirections(R.id.action_bonusPaymentFragment_to_home);
  }

  public static class ActionBonusPaymentFragmentToPaymentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionBonusPaymentFragmentToPaymentFragment(float total) {
      this.arguments.put("total", total);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionBonusPaymentFragmentToPaymentFragment setTotal(float total) {
      this.arguments.put("total", total);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("total")) {
        float total = (float) arguments.get("total");
        __result.putFloat("total", total);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_bonusPaymentFragment_to_paymentFragment;
    }

    @SuppressWarnings("unchecked")
    public float getTotal() {
      return (float) arguments.get("total");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionBonusPaymentFragmentToPaymentFragment that = (ActionBonusPaymentFragmentToPaymentFragment) object;
      if (arguments.containsKey("total") != that.arguments.containsKey("total")) {
        return false;
      }
      if (Float.compare(that.getTotal(), getTotal()) != 0) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + Float.floatToIntBits(getTotal());
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionBonusPaymentFragmentToPaymentFragment(actionId=" + getActionId() + "){"
          + "total=" + getTotal()
          + "}";
    }
  }
}
