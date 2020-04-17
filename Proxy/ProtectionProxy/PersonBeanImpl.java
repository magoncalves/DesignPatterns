public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    String getName() {
        return name;
    }

    String getGender() {
        return gender;
    }

    String getInterests() {
        return interests;
    }

    int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    void setName(String name) {
        this.name = name;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setInterests(String interests) {
        this.interests = interests;
    }

    void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}