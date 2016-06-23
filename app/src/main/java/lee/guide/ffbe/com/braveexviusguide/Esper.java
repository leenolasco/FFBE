package lee.guide.ffbe.com.braveexviusguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by trainer9 on 6/23/2016.
 */
public class Esper extends Fragment {

    TextView siren, ifrit, golem, shiva;
    Button btnSiren, btnIfrit, btnGolem, btnShiva;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.esper_fragment, container, false);
        siren = (TextView) v.findViewById(R.id.sirenInfo);
        ifrit = (TextView) v.findViewById(R.id.ifritInfo);
        golem = (TextView) v.findViewById(R.id.golemInfo);
        shiva = (TextView) v.findViewById(R.id.shivaInfo);
        return v;
    }

}

