// Generated by view binder compiler. Do not edit!
package kz.sd.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kz.sd.shop.R;

public final class FragmentCatalogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final Chip chip1;

  @NonNull
  public final Chip chip2;

  @NonNull
  public final Chip chip3;

  @NonNull
  public final Chip chip4;

  @NonNull
  public final ChipGroup chipGroup;

  @NonNull
  public final RecyclerView recycler;

  @NonNull
  public final TextView textView;

  private FragmentCatalogBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView backBtn,
      @NonNull Chip chip1, @NonNull Chip chip2, @NonNull Chip chip3, @NonNull Chip chip4,
      @NonNull ChipGroup chipGroup, @NonNull RecyclerView recycler, @NonNull TextView textView) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.chip1 = chip1;
    this.chip2 = chip2;
    this.chip3 = chip3;
    this.chip4 = chip4;
    this.chipGroup = chipGroup;
    this.recycler = recycler;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCatalogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCatalogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_catalog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCatalogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      ImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.chip1;
      Chip chip1 = ViewBindings.findChildViewById(rootView, id);
      if (chip1 == null) {
        break missingId;
      }

      id = R.id.chip2;
      Chip chip2 = ViewBindings.findChildViewById(rootView, id);
      if (chip2 == null) {
        break missingId;
      }

      id = R.id.chip3;
      Chip chip3 = ViewBindings.findChildViewById(rootView, id);
      if (chip3 == null) {
        break missingId;
      }

      id = R.id.chip4;
      Chip chip4 = ViewBindings.findChildViewById(rootView, id);
      if (chip4 == null) {
        break missingId;
      }

      id = R.id.chipGroup;
      ChipGroup chipGroup = ViewBindings.findChildViewById(rootView, id);
      if (chipGroup == null) {
        break missingId;
      }

      id = R.id.recycler;
      RecyclerView recycler = ViewBindings.findChildViewById(rootView, id);
      if (recycler == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new FragmentCatalogBinding((ConstraintLayout) rootView, backBtn, chip1, chip2, chip3,
          chip4, chipGroup, recycler, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
