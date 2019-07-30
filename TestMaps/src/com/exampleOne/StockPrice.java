package com.exampleOne;

import java.util.*;

public class StockPrice {
//	private static List<String> symbolNames = new ArrayList<>();
	private static Map<String,List<Double>> prices = new HashMap<>();
	
	public static void addPrice(String symbol, double price) {
		boolean flag = true;
		if(prices.get(symbol) == null) {
			flag = false;
		}
		if(flag) {
			List<Double> ls= prices.get(symbol);
			ls.add(price);
			prices.put(symbol, ls);
		}
		else {
//			symbolNames.add(symbol);
			List<Double> ls = new ArrayList<>();
			ls.add(price);
			prices.put(symbol, ls);
		}
	}
	public static void test() {
		System.out.println(prices.get("Lol"));
	}
	public static void getAverage(String symbol) {
		boolean flag = true;
		if(prices.get(symbol) == null) {
			flag = false;
		}
		double avg = 0;
		int i;
		
		if(!flag) {
			System.out.println("Invalid key");
			return;
		}
		List<Double> ls = prices.get(symbol);
		int len = ls.size();
		for(i=0;i<len;i++) {
			avg = avg + ls.get(i);
		}
		avg = avg/len;
		System.out.println("Average of "+symbol+" is "+avg);
	}
	
	public static void getTicks(String symbol) {
		
		boolean flag = true;
		if(prices.get(symbol) == null) {
			flag = false;
		}
		if(!flag) {
			System.out.println("Invalid key");
			return;
		}
		System.out.println("Count of "+symbol+" = "+prices.get(symbol).size());
	}
	
	public static void printAll() {
		Set<String> symbolNames = prices.keySet();
		for(String s : symbolNames) {
			System.out.println(s+" "+prices.get(s));
		}
	}
	
	
	
}
