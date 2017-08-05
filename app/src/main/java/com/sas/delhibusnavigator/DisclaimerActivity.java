package com.sas.delhibusnavigator;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.NavUtils;
import android.widget.Toast;

public class DisclaimerActivity extends Activity implements OnItemClickListener {


	public ListView lv1;
	public String[] helpline = {"Women's Helpline", "Toll Free Number", "DTC Central Control Room"
			, "DTC East Control Room", "DTC West Control Room", "DTC North Control Room",
			"DTC South Control Room", "DTC Rural Control Room"};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disclaimer);
		setupActionBar();

		lv1 = (ListView) findViewById(R.id.lv1);
		lv1.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, helpline));
		lv1.setOnItemClickListener(this);
	}


	private void setupActionBar() {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setSubtitle(getResources().getString(R.string.app_disclaimer));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.disclaimer, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				NavUtils.navigateUpFromSameTask(this);
				return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		//	interstitial.stopLoading();
		return super.onKeyDown(keyCode, event);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		switch (arg2) {

			case 0:
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:1091"));
				startActivity(callIntent);
				break;
			case 1:
				Intent callIntent1 = new Intent(Intent.ACTION_CALL);
				callIntent1.setData(Uri.parse("tel:1800118181"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    Toast.makeText(this,"CALL PERMISSION NOT GIVEN",Toast.LENGTH_LONG).show();
                    return;
                }
				startActivity(callIntent1);
				break;
			case 2:
				Intent callIntent2 = new Intent(Intent.ACTION_CALL);
				callIntent2.setData(Uri.parse("tel:9818999098"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    Toast.makeText(this,"CALL PERMISSION NOT GIVEN",Toast.LENGTH_LONG).show();
                    return;
                }
				startActivity(callIntent2);
				break;
			case 3:
				Intent callIntent3 = new Intent(Intent.ACTION_CALL);
				callIntent3.setData(Uri.parse("tel:9818999108"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    Toast.makeText(this,"CALL PERMISSION NOT GIVEN",Toast.LENGTH_LONG).show();
                    return;
                }
				startActivity(callIntent3);
				break;
			case 4:
				Intent callIntent4 = new Intent(Intent.ACTION_CALL);
				callIntent4.setData(Uri.parse("tel:9818999105"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    Toast.makeText(this,"CALL PERMISSION NOT GIVEN",Toast.LENGTH_LONG).show();
                    return;
                }
				startActivity(callIntent4);
				break;
			case 5:
				Intent callIntent5 = new Intent(Intent.ACTION_CALL);
				callIntent5.setData(Uri.parse("tel:9871383511"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    Toast.makeText(this,"CALL PERMISSION NOT GIVEN",Toast.LENGTH_LONG).show();
                    return;
                }
				startActivity(callIntent5);
				break;
			case 6:
				Intent callIntent6 = new Intent(Intent.ACTION_CALL);
				callIntent6.setData(Uri.parse("tel:9871383525"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    Toast.makeText(this,"CALL PERMISSION NOT GIVEN",Toast.LENGTH_LONG).show();
                    return;
                }
				startActivity(callIntent6);
				break;
			case 7:
				Intent callIntent7 = new Intent(Intent.ACTION_CALL);
				callIntent7.setData(Uri.parse("tel:9871383523"));
				if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
					// TODO: Consider calling
					//    ActivityCompat#requestPermissions
					// here to request the missing permissions, and then overriding
					//   public void onRequestPermissionsResult(int requestCode, String[] permissions,
					//                                          int[] grantResults)
					// to handle the case where the user grants the permission. See the documentation
					// for ActivityCompat#requestPermissions for more details.
					Toast.makeText(this,"CALL PERMISSION NOT GIVEN",Toast.LENGTH_LONG).show();
					return;
				}
				startActivity(callIntent7);
				break;
	   }
	}
}
