package solitaire.gui;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;

public class CardImages {
	
	private static Map<String, Image> cards = new HashMap<>();
	private static final String IMAGE_LOCATION = "images/";
	private static final String IMAGE_SUFFUX = ".gif";
	
	private static Image getImage(String code) {
		Image image = cards.get(code);
		if(image == null) {
			image = new Image(CardImages.class.getClassLoader()
					.getResourceAsStream(IMAGE_LOCATION + code + IMAGE_SUFFUX));
			cards.put(code, image);
		}
		
		return image;
	}
	
	public static Image getBack() {
		return getImage("b");
	}
	
	
	
	
	
	
	
	

}
