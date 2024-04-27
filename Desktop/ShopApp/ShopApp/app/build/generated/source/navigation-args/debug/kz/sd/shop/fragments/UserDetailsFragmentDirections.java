package kz.sd.shop.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kz.sd.shop.R;

public class UserDetailsFragmentDirections {
  private UserDetailsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionUserDetailsFragmentToHome() {
    return new ActionOnlyNavDirections(R.id.action_userDetailsFragment_to_home);
  }
}
