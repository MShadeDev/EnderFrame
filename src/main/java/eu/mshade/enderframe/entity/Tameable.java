package eu.mshade.enderframe.entity;

public interface Tameable {

    boolean isSitting();

    void setSitting(boolean isSitting);

    boolean isTame();

    void setTame(boolean isTame);

    String getOwner();
}
