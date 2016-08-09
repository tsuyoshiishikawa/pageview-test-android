package jp.co.lavan7.pageview_test;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	ViewPager viewPager;
	CustomSwipeAdapter adpter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		viewPager = (ViewPager) findViewById(R.id.view_pager);
		adpter = new CustomSwipeAdapter(this);
		viewPager.setAdapter(adpter);

	}
}
