package com.gwidgets.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace=JsPackage.GLOBAL)
public class L {
	
	
	@JsProperty
	public static native String getVersion();
	
	
	public static native Map map(String id);

}
