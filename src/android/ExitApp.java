package org.apache.cordova.exitapp;

import android.app.Activity;
import android.content.Intent;
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
  private String methodName;
  private CallbackContext callbackContext;
  private JSONObject arg;

  public JSONObject getArg() {
    return arg;
  }

  public CallbackContext getCallbackContext() {
    return callbackContext;
  }

  public String getMethodName() {
    return methodName;
  }

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
    this.methodName = action;
    this.callbackContext = callbackContext;
    this.arg = args.getJSONObject(0);
    cordova.getActivity().runOnUiThread(new Runnable() {
      @Override
      public void run() {
        if (getMethodName().equals("exits")) {
          System.exit(0);
        }
      }
    });
    return true;
  }
}
