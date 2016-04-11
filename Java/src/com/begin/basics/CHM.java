package com.begin.basics;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
class Synch implements Runnable
{
	ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
	private Thread t;
	private String threadName;
	public Synch(String threadName) {
		// TODO Auto-generated constructor stub
		this.threadName = threadName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		chm.put(Integer.toString(new Random().nextInt()), "value");
		System.out.println(this.toString());
		try {
			if(threadName == "Two")
				Thread.sleep(1000);
			else
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Keys are:\n"+chm.keys()+" thread name="+threadName);
	}
	
	  public void start ()
	   {
	      System.out.println("Starting "+threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}
public class CHM {
	public static void main(String[] args) {
		Synch s1 = new Synch("One");
		s1.start();
		Synch s2 = new Synch("Two");
		s2.start();
}
}