package com.jdc.mkt.set;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

	private Queue<String> queue;
	
	public QueueDemo(String que) {
		
		switch(que) {
		case"link":
			queue = new LinkedList<String>();
			break;
		case "prority":
			queue = new PriorityQueue<String>();
			break;
		case"block":
			queue = new ArrayBlockingQueue<String>(4);
			break;
		}
	}
	
	public  void addQueue(String...strs) {
		queue.addAll(List.of(strs));
	}
	
	public Queue<String> getQueue(){
		return queue;
	}
}








