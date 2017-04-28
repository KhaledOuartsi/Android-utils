package com.delahkistraw.utils;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.telephony.TelephonyManager;

import static android.content.Context.TELEPHONY_SERVICE;

/**
 * Created by Khaled on 25/04/2017.
 */

public class GetInformations {



    public static String getEmailID(Context context) {
        AccountManager accountManager = AccountManager.get(context);
        Account account = getAccount(accountManager);
        if (account == null) {
            return null;
        } else {
            return account.name;
        }
    }

    private static Account getAccount(AccountManager accountManager) {
        Account[] accounts = accountManager.getAccountsByType("com.google");
        Account account;
        if (accounts.length > 0) {
            account = accounts[0];
        } else {
            account = null;
        }
        return account;
    }

    public static String getIMEI(Context context){

        TelephonyManager mngr = (TelephonyManager) context.getSystemService(TELEPHONY_SERVICE);
        String imei = mngr.getDeviceId();
        return imei;

    }

    public static String getPhoneNumber(Context context){

        TelephonyManager tm = (TelephonyManager) context.getSystemService(TELEPHONY_SERVICE);
        String number = tm.getLine1Number();
        return number;

    }
}
