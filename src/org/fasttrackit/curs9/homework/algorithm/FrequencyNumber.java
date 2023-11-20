package org.fasttrackit.curs9.homework.algorithm;

public class FrequencyNumber {
    private Integer key;
    private Integer count;

    public FrequencyNumber(Integer key, Integer count) {
        this.key = key;
        this.count = count;
    }

    public Integer getKey() {
        return key;
    }

    public void increaseCount() {
        count++;
    }
}
