package kz.sd.shop.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import kz.sd.shop.R;

public class ChoiceFragmentDirections {
  private ChoiceFragmentDirections() {
  }

  @NonNull
  public static ActionChoiceFragmentToBonusPaymentFragment actionChoiceFragmentToBonusPaymentFragment(
      float total) {
    return new ActionChoiceFragmentToBonusPaymentFragment(total);
  }

  @NonNull
  public static ActionChoiceFragmentToPaymentFragment actionChoiceFragmentToPaymentFragment(
      float total) {
    return new ActionChoiceFragmentToPaymentFragment(total);
  }

  public static class ActionChoiceFragmentToBonusPaymentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionChoiceFragmentToBonusPaymentFragment(float total) {
      this.arguments.put("total", total);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionChoiceFragmentToBonusPaymentFragment setTotal(float total) {
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
      return R.id.action_choiceFragment_to_bonusPaymentFragment;
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
      ActionChoiceFragmentToBonusPaymentFragment that = (ActionChoiceFragmentToBonusPaymentFragment) object;
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
      return "ActionChoiceFragmentToBonusPaymentFragment(actionId=" + getActionId() + "){"
          + "total=" + getTotal()
          + "}";
    }
  }

  public static class ActionChoiceFragmentToPaymentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionChoiceFragmentToPaymentFragment(float total) {
      this.arguments.put("total", total);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionChoiceFragmentToPaymentFragment setTotal(float total) {
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
      return R.id.action_choiceFragment_to_paymentFragment;
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
      ActionChoiceFragmentToPaymentFragment that = (ActionChoiceFragmentToPaymentFragment) object;
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
      return "ActionChoiceFragmentToPaymentFragment(actionId=" + getActionId() + "){"
          + "total=" + getTotal()
          + "}";
    }
  }
}
