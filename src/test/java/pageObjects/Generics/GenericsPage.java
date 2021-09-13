package pageObjects.Generics;

public class GenericsPage {

	private String txtVisivel = "//*[contains(text(),'%1$s')] | (//*[contains(text(),'%1$s')])[2]" ;
	private String classVisivel = "//*[@class='%1$s']" ;

	public String getTxtVisivel() {
		return txtVisivel;
	}
	public String getClassVisivel() {
		return classVisivel;
	}

}
