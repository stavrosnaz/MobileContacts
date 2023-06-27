package model;

public abstract class AbstractEntity implements IdentifiableEntity {
    private long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
