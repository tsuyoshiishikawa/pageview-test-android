package jp.co.lavan7.pageview_test;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by tsuyoshiishikawa on 16/08/09.
 */
public class CustomSwipeAdapter extends PagerAdapter {

	private int[] image_resources = {R.drawable.page1, R.drawable.page2, R.drawable.page3};
	private Context ctx;
	private LayoutInflater layoutInflater;

	public CustomSwipeAdapter(Context ctx){
		this.ctx = ctx;

	}

	@Override
	public int getCount() {
		return image_resources.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return (view==(LinearLayout)object);
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {

		layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View item_view = layoutInflater.inflate(R.layout.swipe_layout, container, false);
		ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
		TextView textView = (TextView) item_view.findViewById(R.id.image_count);
		imageView.setImageResource(image_resources[position]);
		textView.setText("Image: "+position);
		container.addView(item_view);

		return item_view;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((LinearLayout)object);
	}


}
