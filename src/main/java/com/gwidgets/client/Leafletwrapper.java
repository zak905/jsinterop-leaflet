package com.gwidgets.client;

import com.google.gwt.core.client.EntryPoint;
import com.gwidgets.leaflet.L;



/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Leafletwrapper implements EntryPoint {
	
	double[] positions = {51.505, -0.09};
  
  public void onModuleLoad() {
	  
	  L.map("map").setView(positions, 13);
	  
  }
}
