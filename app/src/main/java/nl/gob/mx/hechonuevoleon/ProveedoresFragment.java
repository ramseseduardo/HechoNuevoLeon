package nl.gob.mx.hechonuevoleon;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ProveedoresFragment extends Fragment {
    public final static String KEY_TEXT = "key_text";

    private String mText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mText = getArguments().getString(KEY_TEXT);

        View v = inflater.inflate(R.layout.fragment_proveedores, container, false);
        TextView tv = (TextView) v.findViewById(R.id.tv_fragment);
        tv.setText(mText);

        return v;
    }
}
