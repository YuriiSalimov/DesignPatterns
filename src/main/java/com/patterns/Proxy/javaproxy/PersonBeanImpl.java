package com.patterns.Proxy.javaproxy;

public final class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount = 0;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getInterests() {
        return this.interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (this.ratingCount == 0) {
            return 0;
        }
        return (this.rating / ratingCount);
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void setGender(final String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(final String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(final int rating) {
        this.rating += rating;
        this.ratingCount++;
    }
}
