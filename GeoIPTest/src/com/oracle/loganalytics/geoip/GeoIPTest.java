package com.oracle.loganalytics.geoip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.maxmind.geoip2.exception.GeoIp2Exception;

public class GeoIPTest {

	public static void main(String[] args) throws IOException, GeoIp2Exception{
		InetAddress myIp = InetAddress.getByName("34.229.67.78");
		
		System.out.println("Getting current city: " + GeoIP.getCityName(myIp));
		
	}
	
}
