package info.androidhive.tabsswipe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.zxing.Result;
import com.welcu.android.zxingfragmentlib.BarCodeScannerFragment;


public class TopRatedFragment extends BarCodeScannerFragment {
	//Bundle bnd;
	String tarama;
	//Kayitlar kayitlar =Kayitlar.getInstance(); 
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setmCallBack(new IResultCallback() {
            
            public void result(Result lastResult) {
                Toast.makeText(getActivity(), "Scan: " + lastResult.toString(), Toast.LENGTH_SHORT).show();
            	tarama=lastResult.toString();
//            	Intent i=new Intent(getActivity().getApplicationContext(),GamesFragment.class);
//            	i.putExtra("veri", tarama);
//            	 startActivity(i);
//           
            	//kayitlar.yeniKayit(tarama);
            
                //Log.i("TAG",tarama);
            }
        });
      /*  final Intent i=new Intent(getActivity().getApplicationContext(),GamesFragment.class);
        bnd.putString("veri", tarama);
        i.putExtras(bnd);
        startActivity(i);*/
    }

   /* public TopRatedFragment() {

    }*/
 
	
	public void onCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
	}

	
}