

public interface Subject {

	public void attach(PostObserver observer);

	public void detach(PostObserver observer);

	public void notifyAllObservers();

}
