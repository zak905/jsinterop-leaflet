package com.gwidgets.leaflet;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative=true)
public class Map {
	
	
	@JsMethod
	public native L setView(double[] center, int zoom);
	

}
