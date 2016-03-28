package com.example.test;




import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{
	CoordinatorLayout ll;
	TabLayout tabLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//final MyTextView tv=(MyTextView) findViewById(R.id.tv);
		//Animation anim = AnimationUtils.loadAnimation(this,R.anim.anim);
		//tv.startAnimation(anim);
		ll=(CoordinatorLayout) findViewById(R.id.ll);
		
		   tabLayout=(TabLayout) findViewById(R.id.tablayout);
		   tabLayout.setTabTextColors(Color.WHITE, Color.GRAY);//设置文本在选中和为选中时候的颜色
		   tabLayout.addTab(tabLayout.newTab().setText("第一个"), true);//添加 Tab,默认选中
		   tabLayout.addTab(tabLayout.newTab().setText("第二个"),false);//添加 Tab,默认不选中
		   tabLayout.addTab(tabLayout.newTab().setText("第三个"),false);//添加 Tab,默认不选中
		   
	}
	public void showSnackBar(View v){
		Snackbar.make(ll, "123", Snackbar.LENGTH_LONG).setAction("delete", new OnClickListener() {
	          @Override
	          public void onClick(View v) {
	            Toast.makeText(MainActivity.this, "delete", Toast.LENGTH_SHORT).show();
	          }
	        }).show();
	}
}
