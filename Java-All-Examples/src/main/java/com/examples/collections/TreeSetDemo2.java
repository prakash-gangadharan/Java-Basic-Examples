package com.examples.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Metrics {
	int id;
	String metrics_name;

	Metrics(int id, String metrics_name) {
		this.id = id;
		this.metrics_name = metrics_name;
	}

	public int compareTo(Metrics mtrcs) {
		return id - mtrcs.id;
	}

	@Override
	public String toString() {
		return "ID - " + id + ", METRICS_NAME - " + metrics_name;

	}

}
// To sort according to id
class IdComp implements Comparator<Metrics> {

	@Override
	public int compare(Metrics o1, Metrics o2) {
		return o1.id - o2.id;
	}

}
// To sort according to metrics_name
class MetricComp implements Comparator<Metrics>{

	@Override
	public int compare(Metrics o1, Metrics o2) {
		return o1.metrics_name.compareTo(o2.metrics_name);
	}
	
}

public class TreeSetDemo2 {

	public static void main(String[] args) {

		//Set<Metrics> alMetrics = new TreeSet<Metrics>(new IdComp());
		Set<Metrics> alMetrics = new TreeSet<Metrics>(new MetricComp());

		alMetrics.add(new Metrics(10002, "Total Diskspace"));
		alMetrics.add(new Metrics(10005, "Bytes Received"));
		alMetrics.add(new Metrics(10003, "Bytes Sent"));
		alMetrics.add(new Metrics(10001, "System Up"));
		alMetrics.add(new Metrics(10004, "Steal Time"));

		System.out.println(alMetrics);

	}

}
