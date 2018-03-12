package org.labb17.svartablixten;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import static android.view.ViewGroup.FOCUS_BLOCK_DESCENDANTS;

/**
 * Created by joakimlilja on 2018-03-10.
 */

public class InstructionsAdapter extends BaseAdapter {
    private Context mContext;

    public InstructionsAdapter(Context c) {
        mContext = c;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public int getCount() {
        return INSTRUCTIONS.COUNT;
    }
    // create a new button for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Button instrBtn;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            //instrBtn = new TextView(new ContextThemeWrapper(mContext, R.style.instr_btn_style));
            instrBtn = new Button(mContext);
            instrBtn.setLayoutParams(new GridView.LayoutParams(120, 85));
            instrBtn.setPadding(8, 8, 8, 8);
            instrBtn.setFocusable(false);
            instrBtn.setClickable(false);
            instrBtn.setFocusableInTouchMode(false);
        } else {
            instrBtn = (Button) convertView;
        }

        instrBtn.setText(INSTRUCTIONS.TEXT_SV[position]);
        return instrBtn;
    }
}
