package info.androidhive.tabsswipe;

import info.androidhive.tabsswipe.adapter.TabsPagerAdapter;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;

import com.welcu.android.zxingfragmentlib.BarCodeScannerFragment;

public class MainActivity extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "SCAN", "INFORMATION", "HISTORY" };
	
	boolean torchState = false;

    BarCodeScannerFragment mScannerFragment;
    LinearLayout layoutContent;
    //private int oncekiSayfa=0;
    //private int simdikiSayfa=0;
    
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 FragmentManager fm = getSupportFragmentManager();
	     mScannerFragment = (BarCodeScannerFragment) fm.findFragmentById(R.id.scanner_fragment);

	     layoutContent = (LinearLayout) findViewById(R.id.layout_content);
	     

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);		
		
	

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
				
				//oncekiSayfa= simdikiSayfa;
				//simdikiSayfa = position;
				
				//if(simdikiSayfa != oncekiSayfa){
					
					
				//}
				
			}

			
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}

 
	/* private View.OnClickListener createToggleFlashListener() {
	        return new View.OnClickListener() {
	          @Override
	          public void onClick(View v) {
	            torchState = !torchState;
	            mScannerFragment.setTorch(torchState);
	          }
	        };
	    }*/

}
