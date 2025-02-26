package com.example.toasty;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Toasters {
    public static void simpleToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }

    public static void DynamicSimpleToast(Context context, String msg, int textColor, int bgColor) {
        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);

        View view = toast.getView();
        if (view != null) {
            view.setBackgroundColor(bgColor);

            TextView text = view.findViewById(android.R.id.message);
            if (text != null) {
                text.setTextColor(textColor);
            }
        }

        toast.show();
    }
}
