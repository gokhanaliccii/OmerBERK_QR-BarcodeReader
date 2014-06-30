package info.androidhive.tabsswipe;

import java.util.ArrayList;

import info.androidhive.tabsswipe.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GamesFragment extends Fragment {
	TextView goster;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_games, container,
				false);

		return rootView;
	}

	/*public void onCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		// TODO Auto-generated method stub
		goster = (TextView) getActivity().findViewById(R.id.textView1);
		Bundle alinan = getActivity().getIntent().getExtras();
		String alinmis = alinan.getString("veri");
		goster.setText(alinmis);

		Log.i("TAG", "gelen onCreate:" + alinmis);

	}


	@Override
	public void onResume() {

		super.onResume();
		String kayit = null;
		ArrayList<String> kayitlar = Kayitlar.getInstance().kayitlariGetir();
		if (kayitlar != null && kayitlar.size()>1)
			kayit = kayitlar.get(0);
		if (kayit != null)
			goster.setText(kayit);
	}
*/
}
