package org.learn;

import org.springframework.stereotype.Component;

@Component
public class TenisPlayer implements Sportist {

	public String playSport() {
		return "I play tenis like Federer";
	}

}
