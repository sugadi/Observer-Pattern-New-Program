
import java.util.ArrayList;
import java.util.List;

public class PostCard implements Subject {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PostObserver> getPoObservers() {
		return poObservers;
	}

	public void setPoObservers(List<PostObserver> poObservers) {
		this.poObservers = poObservers;
	}

	private List<PostObserver> poObservers = new ArrayList<PostObserver>();

	@Override
	public void notifyAllObservers() {

		for (PostObserver poObserver : poObservers) {
			poObserver.update(name);
		}

	}

	public void sendRegisterdPersons(boolean value) {

		if (value) {
			notifyAllObservers();

		} else {
			System.out.println("Not ready to send  ");
		}

	}

	@Override
	public void attach(PostObserver observer) {
		poObservers.add(observer);
	}

	@Override
	public void detach(PostObserver observer) {
		poObservers.remove(observer);

	}

}
