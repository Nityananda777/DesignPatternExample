package com.design.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopicImpl implements Topic {

	private List<ConsumerGroup> consumerList = new ArrayList<>();
	private Map<String, Message> messageMap = new HashMap<>();
	int  count=0;

	@Override
	public void addConsumer(ConsumerGroup consumer) {
		// TODO Auto-generated method stub
		consumerList.add(consumer);
	}

	@Override
	public void removeConsumer(ConsumerGroup consumer) {
		// TODO Auto-generated method stub
		consumerList.remove(consumer);
	}

	@Override
	public void publishMessage(String meesageKey, Message message) {
		publish(meesageKey, message);
		if(count==3)
		notifyConsumer(meesageKey);
	}

	private void publish(String meesageKey, Message message) {
		messageMap.put(meesageKey, message);
		count++;
	}

	private void notifyConsumer(String messageKey) {
		// TODO Auto-generated method stub
		for (ConsumerGroup o : consumerList) {
			o.consume(messageMap.get(messageKey));
		}
	}
}
