package kz.sd.shop.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ChoiceFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ChoiceFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ChoiceFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ChoiceFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ChoiceFragmentArgs __result = new ChoiceFragmentArgs();
    bundle.setClassLoader(ChoiceFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("total")) {
      float total;
      total = bundle.getFloat("total");
      __result.arguments.put("total", total);
    } else {
      throw new IllegalArgumentException("Required argument \"total\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ChoiceFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ChoiceFragmentArgs __result = new ChoiceFragmentArgs();
    if (savedStateHandle.contains("total")) {
      float total;
      total = savedStateHandle.get("total");
      __result.arguments.put("total", total);
    } else {
      throw new IllegalArgumentException("Required argument \"total\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public float getTotal() {
    return (float) arguments.get("total");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("total")) {
      float total = (float) arguments.get("total");
      __result.putFloat("total", total);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("total")) {
      float total = (float) arguments.get("total");
      __result.set("total", total);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ChoiceFragmentArgs that = (ChoiceFragmentArgs) object;
    if (arguments.containsKey("total") != that.arguments.containsKey("total")) {
      return false;
    }
    if (Float.compare(that.getTotal(), getTotal()) != 0) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + Float.floatToIntBits(getTotal());
    return result;
  }

  @Override
  public String toString() {
    return "ChoiceFragmentArgs{"
        + "total=" + getTotal()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ChoiceFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(float total) {
      this.arguments.put("total", total);
    }

    @NonNull
    public ChoiceFragmentArgs build() {
      ChoiceFragmentArgs result = new ChoiceFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setTotal(float total) {
      this.arguments.put("total", total);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public float getTotal() {
      return (float) arguments.get("total");
    }
  }
}
