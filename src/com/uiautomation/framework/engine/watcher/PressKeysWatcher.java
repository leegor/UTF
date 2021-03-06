package com.uiautomation.framework.engine.watcher;

import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiSelector;
import com.uiautomation.framework.utils.Constant;

public class PressKeysWatcher extends SelectorWatcher {

	 private String[] keys = new String[]{};

	    public PressKeysWatcher(UiSelector[] conditions, String[] keys) {
	        super(conditions);
	        this.keys = keys;
	    }

	    @Override
	    public void action() {
	        Log.d(Constant.LOG_TAG, "PressKeysWatcher triggered!");
	        for (String key: keys) {
	            key = key.toLowerCase();
	            if ("home".equals(key))
	                UiDevice.getInstance().pressHome();
	            else if ("back".equals(key))
	                UiDevice.getInstance().pressBack();
	            else if ("left".equals(key))
	                UiDevice.getInstance().pressDPadLeft();
	            else if ("right".equals(key))
	                UiDevice.getInstance().pressDPadRight();
	            else if ("up".equals(key))
	                UiDevice.getInstance().pressDPadUp();
	            else if ("down".equals(key))
	                UiDevice.getInstance().pressDPadDown();
	            else if ("center".equals(key))
	                UiDevice.getInstance().pressDPadCenter();
	            else if ("menu".equals(key))
	                UiDevice.getInstance().pressMenu();
	            else if ("search".equals(key))
	                UiDevice.getInstance().pressSearch();
	            else if ("enter".equals(key))
	                UiDevice.getInstance().pressEnter();
	            else if ("delete".equals(key) || "del".equals(key))
	                UiDevice.getInstance().pressDelete();
	            else if ("recent".equals(key))
	                try {
	                    UiDevice.getInstance().pressRecentApps();
	                } catch (RemoteException e) {
	                	Log.d(Constant.LOG_TAG, e.getMessage());
	                }
	            else if ("volume_up".equals(key))
	                UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_VOLUME_UP);
	            else if ("volume_down".equals(key))
	                UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_VOLUME_DOWN);
	            else if ("volume_mute".equals(key))
	                UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_VOLUME_MUTE);
	            else if ("camera".equals(key))
	                UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_CAMERA);
	            else if ("power".equals(key))
	                UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);
	        }
	    }

}
