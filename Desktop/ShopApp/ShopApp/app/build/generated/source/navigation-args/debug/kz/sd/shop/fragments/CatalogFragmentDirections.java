package kz.sd.shop.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
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

public class CatalogFragmentDirections {
  private CatalogFragmentDirections() {
  }

  @NonNull
  public static ActionCatalogToProductDetailsFragment actionCatalogToProductDetailsFragment(
      @NonNull Product Product) {
    return new ActionCatalogToProductDetailsFragment(Product);
  }

  public static class ActionCatalogToProductDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCatalogToProductDetailsFragment(@NonNull Product Product) {
      if (Product == null) {
        throw new IllegalArgumentException("Argument \"Product\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Product", Product);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCatalogToProductDetailsFragment setProduct(@NonNull Product Product) {
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
      return R.id.action_catalog_to_productDetailsFragment;
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
      ActionCatalogToProductDetailsFragment that = (ActionCatalogToProductDetailsFragment) object;
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
      return "ActionCatalogToProductDetailsFragment(actionId=" + getActionId() + "){"
          + "Product=" + getProduct()
          + "}";
    }
  }
}
