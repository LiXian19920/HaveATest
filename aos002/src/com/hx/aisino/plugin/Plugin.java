package com.hx.aisino.plugin;

import com.aisino.platform.view.AbstractForm;
import com.aisino.platform.view.DataMsgBus;
import com.aisino.platform.view.basicWidget.MenuItem;
import com.aisino.platform.view.listener.FormCreateListener;
import com.aisino.platform.view.wtool.MenuCmd;

/**
 * @Author LeeApri
 * @Date 2017��12��6������3:50:59
 * @Title DynMenuPlugin
 * @Description
 */
public class Plugin {

	public void onFormCreate(AbstractForm form, DataMsgBus bus) {
		MenuCmd cmd = new MenuCmd(bus, "t_menu");
		MenuItem mti = new MenuItem(); // �½�һ���˵���Ŀ
		mti.setName("newadd");
		mti.setCaption("new add menu item");
		mti.setOnclick("alert('this is new add menu');");
		cmd.defItem(mti); // ���´����Ĳ˵���Ŀ����ӵ��˵���
		cmd.hide(bus, new String[] { "test1" }); // ����һ�����еĲ˵���Ŀ
	}

	public class DynMenuPlugin extends Plugin implements FormCreateListener {
		public void onFormCreate(AbstractForm form, DataMsgBus bus) {
			MenuCmd cmd = new MenuCmd(bus, "t_menu");
			MenuItem mti = new MenuItem(); // �½�һ���˵���Ŀ
			mti.setName("newadd");
			mti.setCaption("new add menu item");
			mti.setOnclick("alert('this is new add menu');");
			cmd.defItem(mti); // ���´����Ĳ˵���Ŀ����ӵ��˵���
			cmd.hide(bus, new String[] { "test1" }); // ����һ�����еĲ˵���Ŀ
		}
	}
}
