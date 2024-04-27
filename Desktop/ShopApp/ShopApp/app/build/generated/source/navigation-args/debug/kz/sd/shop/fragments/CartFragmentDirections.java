package kz.sd.shop.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import kz.sd.shop.R;
import kz.sd.shop.models.Product;

public class CartFragmentDirections {
  private CartFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCartToSearchFragment() {
    return new ActionOnlyNavDirections(R.id.action_cart_to_searchFragment);
  }

  @NonNull
  public static ActionCartToProductDetailsFragment actionCartToProductDetailsFragment(
      @NonNull Product Product) {
    return new ActionCartToProductDetailsFragment(Product);
  }

  @NonNull
  public static ActionCartToPaymentFragment actionCartToPaymentFragment(float total) {
    return new ActionCartToPaymentFragment(total);
  }

  @NonNull
  public static NavDirections actionCartToCatalog() {
    return new ActionOnlyNavDirections(R.id.action_cart_to_catalog);
  }

  @NonNull
  public static ActionCartToChoiceFragment actionCartToChoiceFragment(float total) {
    return new ActionCartToChoiceFragment(total);
  }

  public static class ActionCartToProductDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCartToProductDetailsFragment(@NonNull Product Product) {
      if (Product == null) {
        throw new IllegalArgumentException("Argument \"Product\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Product", Product);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCartToProductDetailsFragment setProduct(@NonNull Product Product) {
      if (Product == null) {
        throw new IllegalArgumentException("Argument \"Product\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Product", Product);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("Product")) {
        Product Product = (Product) arguments.get("Product");
        if (Parcelable.class.isAssignableFrom(Product.class) || Product == null) {
          __result.putParcelable("Product", Parcelable.class.cast(Product));
        } else if (Serializable.class.isAssignableFrom(Product.class)) {
          __result.putSerializable("Product", Serializable.class.cast(Product));
        } else {
          throw new UnsupportedOperationException(Product.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_cart_to_productDetailsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Product getProduct() {
      return (Product) arguments.get("Product");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCartToProductDetailsFragment that = (ActionCartToProductDetailsFragment) object;
      if (arguments.containsKey("Product") != that.arguments.containsKey("Product")) {
        return false;
      }
      if (getProduct() != null ? !getProduct().equals(that.getProduct()) : that.getProduct() != null) {
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
      result = 31 * result + (getProduct() != null ? getProduct().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCartToProductDetailsFragment(actionId=" + getActionId() + "){"
          + "Product=" + getProduct()
          + "}";
    }
  }

  public static class ActionCartToPaymentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCartToPaymentFragment(float total) {
      this.arguments.put("total", total);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCartToPaymentFragment setTotal(float total) {
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
      return R.id.action_cart_to_paymentFragment;
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
      ActionCartToPaymentFragment that = (ActionCartToPaymentFragment) object;
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
      return "ActionCartToPaymentFragment(actionId=" + getActionId() + "){"
          + "total=" + getTotal()
          + "}";
    }
  }

  public static class ActionCartToChoiceFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCartToChoiceFragment(float total) {
      this.arguments.put("total", total);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCartToChoiceFragment setTotal(float total) {
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
      return R.id.action_cart_to_choiceFragment;
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
      ActionCartToChoiceFragment that = (ActionCartToChoiceFragment) object;
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
      return "ActionCartToChoiceFragment(actionId=" + getActionId() + "){"
          + "total=" + getTotal()
          + "}";
    }
  }
}
