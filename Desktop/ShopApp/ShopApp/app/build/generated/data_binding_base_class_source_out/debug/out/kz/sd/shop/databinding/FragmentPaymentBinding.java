// Generated by view binder compiler. Do not edit!
package kz.sd.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kz.sd.shop.R;

public final class FragmentPaymentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final CardView cardView10;

  @NonNull
  public final CardView cardView4;

  @NonNull
  public final CardView cardView5;

  @NonNull
  public final MaterialButton confirmBtn;

  @NonNull
  public final MaterialRadioButton delivery;

  @NonNull
  public final TextInputEditText etCardNumber;

  @NonNull
  public final TextInputEditText etCvc;

  @NonNull
  public final TextInputEditText etDate;

  @NonNull
  public final TextInputEditText etNameCard;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final MaterialRadioButton self;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextInputLayout tilCardNumb;

  @NonNull
  public final TextInputLayout tilCvc;

  @NonNull
  public final TextInputLayout tilDate;

  @NonNull
  public final TextInputLayout tilNameCard;

  @NonNull
  public final TextView total;

  private FragmentPaymentBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView backBtn,
      @NonNull CardView cardView10, @NonNull CardView cardView4, @NonNull CardView cardView5,
      @NonNull MaterialButton confirmBtn, @NonNull MaterialRadioButton delivery,
      @NonNull TextInputEditText etCardNumber, @NonNull TextInputEditText etCvc,
      @NonNull TextInputEditText etDate, @NonNull TextInputEditText etNameCard,
      @NonNull ImageView imageView10, @NonNull ImageView imageView9,
      @NonNull MaterialRadioButton self, @NonNull TextView textView,
      @NonNull TextInputLayout tilCardNumb, @NonNull TextInputLayout tilCvc,
      @NonNull TextInputLayout tilDate, @NonNull TextInputLayout tilNameCard,
      @NonNull TextView total) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.cardView10 = cardView10;
    this.cardView4 = cardView4;
    this.cardView5 = cardView5;
    this.confirmBtn = confirmBtn;
    this.delivery = delivery;
    this.etCardNumber = etCardNumber;
    this.etCvc = etCvc;
    this.etDate = etDate;
    this.etNameCard = etNameCard;
    this.imageView10 = imageView10;
    this.imageView9 = imageView9;
    this.self = self;
    this.textView = textView;
    this.tilCardNumb = tilCardNumb;
    this.tilCvc = tilCvc;
    this.tilDate = tilDate;
    this.tilNameCard = tilNameCard;
    this.total = total;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPaymentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPaymentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_payment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPaymentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      ImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.cardView10;
      CardView cardView10 = ViewBindings.findChildViewById(rootView, id);
      if (cardView10 == null) {
        break missingId;
      }

      id = R.id.cardView4;
      CardView cardView4 = ViewBindings.findChildViewById(rootView, id);
      if (cardView4 == null) {
        break missingId;
      }

      id = R.id.cardView5;
      CardView cardView5 = ViewBindings.findChildViewById(rootView, id);
      if (cardView5 == null) {
        break missingId;
      }

      id = R.id.confirm_btn;
      MaterialButton confirmBtn = ViewBindings.findChildViewById(rootView, id);
      if (confirmBtn == null) {
        break missingId;
      }

      id = R.id.delivery;
      MaterialRadioButton delivery = ViewBindings.findChildViewById(rootView, id);
      if (delivery == null) {
        break missingId;
      }

      id = R.id.et_card_number;
      TextInputEditText etCardNumber = ViewBindings.findChildViewById(rootView, id);
      if (etCardNumber == null) {
        break missingId;
      }

      id = R.id.et_cvc;
      TextInputEditText etCvc = ViewBindings.findChildViewById(rootView, id);
      if (etCvc == null) {
        break missingId;
      }

      id = R.id.et_date;
      TextInputEditText etDate = ViewBindings.findChildViewById(rootView, id);
      if (etDate == null) {
        break missingId;
      }

      id = R.id.et_name_card;
      TextInputEditText etNameCard = ViewBindings.findChildViewById(rootView, id);
      if (etNameCard == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      id = R.id.self;
      MaterialRadioButton self = ViewBindings.findChildViewById(rootView, id);
      if (self == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.til_card_numb;
      TextInputLayout tilCardNumb = ViewBindings.findChildViewById(rootView, id);
      if (tilCardNumb == null) {
        break missingId;
      }

      id = R.id.til_cvc;
      TextInputLayout tilCvc = ViewBindings.findChildViewById(rootView, id);
      if (tilCvc == null) {
        break missingId;
      }

      id = R.id.til_date;
      TextInputLayout tilDate = ViewBindings.findChildViewById(rootView, id);
      if (tilDate == null) {
        break missingId;
      }

      id = R.id.til_name_card;
      TextInputLayout tilNameCard = ViewBindings.findChildViewById(rootView, id);
      if (tilNameCard == null) {
        break missingId;
      }

      id = R.id.total;
      TextView total = ViewBindings.findChildViewById(rootView, id);
      if (total == null) {
        break missingId;
      }

      return new FragmentPaymentBinding((ConstraintLayout) rootView, backBtn, cardView10, cardView4,
          cardView5, confirmBtn, delivery, etCardNumber, etCvc, etDate, etNameCard, imageView10,
          imageView9, self, textView, tilCardNumb, tilCvc, tilDate, tilNameCard, total);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}