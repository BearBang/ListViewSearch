package com.indvel.mcpesearcher;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.text.*;

public class MainActivity extends Activity implements TextWatcher
{
	EditText sh;
	ListView list;
	ArrayAdapter<String> data;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		list = (ListView)findViewById(R.id.list);
		sh = (EditText)findViewById(R.id.search);
		data = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		data.add("오리");
		data.add("닭");
		data.add("돼지");
		data.add("소");
		data.add("양");
		data.add("토끼");
		data.add("거위");
		data.add("참새");
		data.add("비둘기");
		data.add("강아지");
		data.add("고양이");
		data.add("다람쥐");
		data.add("햄스터");
		data.add("공작새");
		data.add("쥐");
		data.add("늑대");
		data.add("호랑이");
		data.add("용");
		data.add("병아리");
		data.add("백조");
		data.add("개");
		list.setAdapter(data);
		list.setTextFilterEnabled(true);
		sh.addTextChangedListener(this);
    }
	
	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		list.setFilterText(sh.getText().toString());
	}

	@Override
	public void afterTextChanged(Editable s) {
		if(sh.getText().length() == 0) {
			list.clearTextFilter();
		}
	}
}
