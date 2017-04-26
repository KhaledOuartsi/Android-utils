package com.delahkistraw.utils;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by Khaled on 23/04/2017.
 */

public class ValidationsForm {

    public static boolean isValidEmail(CharSequence email) {
        if (!TextUtils.isEmpty(email)) {
            return Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
        return false;
    }

    public static boolean isValidPhoneNumber(CharSequence phoneNumber) {
        if (!TextUtils.isEmpty(phoneNumber)) {
            return Patterns.PHONE.matcher(phoneNumber).matches();
        }
        return false;
    }

}
