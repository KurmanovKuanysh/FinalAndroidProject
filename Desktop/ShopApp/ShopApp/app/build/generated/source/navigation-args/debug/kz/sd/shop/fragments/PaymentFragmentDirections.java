package kz.sd.shop.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kz.sd.shop.R;

public class PaymentFragmentDirections {
  private PaymentFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionPaymentFragmentToHome() {
    return new ActionOnlyNavDirections(R.id.action_paymentFragment_to_home);
  }
}
