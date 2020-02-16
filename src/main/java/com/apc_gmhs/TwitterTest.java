package com.apc_gmhs;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterTest {
	public static void main(String[] args) throws TwitterException {
		Twitter twitter = TwitterFactory.getSingleton();
		List<Status> statuses = twitter.getUserTimeline("kanyewest");
	    System.out.println("Showing home timeline.");
	    for (Status status : statuses) {
	        System.out.println(status.getUser().getName() + ":" +
	                           status.getText());
	    }
	}
}
