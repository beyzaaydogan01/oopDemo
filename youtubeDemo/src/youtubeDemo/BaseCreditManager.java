package youtubeDemo;

public abstract class BaseCreditManager implements ICreditManager {
	
	//abstract ortak operasyonları tutar (tamamlanmamış, her yerde değişken)
	public abstract void calculate();
	
	//her yerde ortak
	public void save() {
		System.out.println("Kaydedildi");
	}
}
