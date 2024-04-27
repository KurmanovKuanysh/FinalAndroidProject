package kz.sd.shop.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import kz.sd.shop.models.Product;

public class ProductDetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ProductDetailsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ProductDetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static ProductDetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ProductDetailsFragmentArgs __result = new ProductDetailsFragmentArgs();
    bundle.setClassLoader(ProductDetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("Product")) {
      Product Product;
      if (Parcelable.class.isAssignableFrom(Product.class) || Serializable.class.isAssignableFrom(Product.class)) {
        Product = (Product) bundle.get("Product");
      } else {
        throw new UnsupportedOperationException(Product.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (Product == null) {
        throw new IllegalArgumentException("Argument \"Product\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Product", Product);
    } else {
      throw new IllegalArgumentException("Required argument \"Product\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ProductDetailsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ProductDetailsFragmentArgs __result = new ProductDetailsFragmentArgs();
    if (savedStateHandle.contains("Product")) {
      Product Product;
      Product = savedStateHandle.get("Product");
      if (Product == null) {
        throw new IllegalArgumentException("Argument \"Product\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Product", Product);
    } else {
      throw new IllegalArgumentException("Required argument \"Product\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Product getProduct() {
    return (Product) arguments.get("Product");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("Product")) {
      Product Product = (Product) arguments.get("Product");
      if (Parcelable.class.isAssignableFrom(Product.class) || Product == null) {
        __result.set("Product", Parcelable.class.cast(Product));
      } else if (Serializable.class.isAssignableFrom(Product.class)) {
        __result.set("Product", Serializable.class.cast(Product));
      } else {
        throw new UnsupportedOperationException(Product.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
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
    ProductDetailsFragmentArgs that = (ProductDetailsFragmentArgs) object;
    if (arguments.containsKey("Product") != that.arguments.containsKey("Product")) {
      return false;
    }
    if (getProduct() != null ? !getProduct().equals(that.getProduct()) : that.getProduct() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getProduct() != null ? getProduct().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ProductDetailsFragmentArgs{"
        + "Product=" + getProduct()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ProductDetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Product Product) {
      if (Product == null) {
        throw new IllegalArgumentException("Argument \"Product\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Product", Product);
    }

    @NonNull
    public ProductDetailsFragmentArgs build() {
      ProductDetailsFragmentArgs result = new ProductDetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setProduct(@NonNull Product Product) {
      if (Product == null) {
        throw new IllegalArgumentException("Argument \"Product\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Product", Product);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Product getProduct() {
      return (Product) arguments.get("Product");
    }
  }
}
