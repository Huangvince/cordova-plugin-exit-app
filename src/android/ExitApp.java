package org.apache.cordova.exitapp;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Vince_Huang on 2017/10/13.
 */

public class ExitApp extends CordovaPlugin {


  @Override
  public Boolean shouldAllowBridgeAccess(String url) {
    return true;
  }

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
  }

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if (action.equals("exitApp")) {
      System.exit(0);
    }
    return true;
  }
}
