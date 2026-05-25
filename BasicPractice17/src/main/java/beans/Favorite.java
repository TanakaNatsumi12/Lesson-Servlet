package beans;

import java.io.Serializable;

public class Favorite implements Serializable{
	
	 private String name;
	 private String url;

	 public Favorite() {}

	 public Favorite(String name, String url) {
	     this.name = name;
	     this.url = url;
	 }

	 public String getName() {
	     return name;
	 }

	 public void setName(String name) {
	     this.name = name;
	 }

	 public String getUrl() {
	     return url;
	 }

	 public void setUrl(String url) {
	     this.url = url;
	 }
	
	
}
