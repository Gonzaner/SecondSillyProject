package ctec.secondsillyproject.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class WeirdActivity extends Activity
{
	private Button appButton; 
	private TextView appText;
	private ArrayList<Integer> colorList;
	private RelativeLayout appBackground;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		
		appButton = (Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.boringTextView);
		colorList = new ArrayList<Integer>();
		appBackground =(RelativeLayout)findViewById(R.id.applayout);
		
		fillTheColorList();
		setupListeners();
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.Black);
		colorList.add(R.color.prettyPurple);
	}
	
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				//Button click stuff goes here
				int randomIndex =(int) (Math.random()* colorList.size());
				
				
				appBackground.setBackgroundResource(colorList.get(randomIndex));
				
			}
		});
		{
			
		}
	}
}
