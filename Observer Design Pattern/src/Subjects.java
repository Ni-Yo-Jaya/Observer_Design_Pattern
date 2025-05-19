public interface Subjects {

    public void registerObserver(Observer o);
    public void notifyObservers();
    public void removeObserever(Observer o);

}
