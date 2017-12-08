package com.hx.aisino.plugin;

import com.aisino.platform.view.AbstractForm;
import com.aisino.platform.view.DataMsgBus;
import com.aisino.platform.view.basicWidget.MenuItem;
import com.aisino.platform.view.listener.FormCreateListener;
import com.aisino.platform.view.wtool.MenuCmd;

/**
 * @Author LeeApri
 * @Date 2017年12月6日下午3:50:59
 * @Title DynMenuPlugin
 * @Description
 */
public class Plugin {

	public void onFormCreate(AbstractForm form, DataMsgBus bus) {
		MenuCmd cmd = new MenuCmd(bus, "t_menu");
		MenuItem mti = new MenuItem(); // 新建一个菜单项目
		mti.setName("newadd");
		mti.setCaption("new add menu item");
		mti.setOnclick("alert('this is new add menu');");
		cmd.defItem(mti); // 将新创建的菜单项目，添加到菜单中
		cmd.hide(bus, new String[] { "test1" }); // 隐藏一个已有的菜单项目
	}

	public class DynMenuPlugin extends Plugin implements FormCreateListener {
		public void onFormCreate(AbstractForm form, DataMsgBus bus) {
			MenuCmd cmd = new MenuCmd(bus, "t_menu");
			MenuItem mti = new MenuItem(); // 新建一个菜单项目
			mti.setName("newadd");
			mti.setCaption("new add menu item");
			mti.setOnclick("alert('this is new add menu');");
			cmd.defItem(mti); // 将新创建的菜单项目，添加到菜单中
			cmd.hide(bus, new String[] { "test1" }); // 隐藏一个已有的菜单项目
		}
	}
}
