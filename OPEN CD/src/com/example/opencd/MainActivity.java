package com.example.opencd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
	private ListView lv;
	private String titles[] = { "����������", "�������ֳ���", "���", "������", "���鷴��", "Ͷ�߾ٱ�" };
	private String contents[] = { "����������ֵĵط�", "����,21�����Ϸ����", "��ٰ��",
			"open CD�ٷ�������", "���飬����", "����㱨��ٱ�" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv = (ListView) this.findViewById(R.id.listView1);
		ArrayList<HashMap<String, Object>> items = new ArrayList<HashMap<String, Object>>();

		for (int i = 0; i < titles.length; i++) {
			HashMap<String, Object> item = new HashMap<String, Object>();

			item.put("title", titles[i]);
			item.put("content", contents[i]);

			items.add(item);
		}
		String from[] = { "title", "content", };
		int to[] = { R.id.textView1, R.id.textView3 };
		SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),
				items, R.layout.item, from, to);
		lv.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
